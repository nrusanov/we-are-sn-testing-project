package com.telerikacademy.testframework;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserActions {

    public WebDriver getDriver() {
        return driver;
    }

    final WebDriver driver;

    public UserActions() {
        this.driver = Utils.getWebDriver();
    }

    public static void loadBrowser(String baseUrlKey) {
        Utils.getWebDriver().get(Utils.getConfigPropertyByKey(baseUrlKey));
    }

    public static void quitDriver() {
        Utils.tearDownWebDriver();
    }

    public void clickElement(String key, Object... arguments) {
        String locator = getLocatorValueByKey (key, arguments);
        Utils.LOG.info("Clicking on element " + key);
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
    }

    public void hoverElement(String key, Object... arguments) {
        String locator = getLocatorValueByKey(key, arguments);
        Utils.LOG.info("Hovering over element " + key);
        WebElement element = driver.findElement(By.xpath(locator));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    public void typeValueInField(String value, String field, Object... arguments) {
        String locator = getLocatorValueByKey(field, arguments);
        WebElement element = driver.findElement(By.xpath(locator));
        element.sendKeys(value);
    }

    public void selectFromDropDownMenu(String value, String dropDown) {
        String locator = Utils.getUIMappingByKey(dropDown);
        Utils.LOG.info("Selecting " + value + " from dropdown " + dropDown);
        Select element = new Select(driver.findElement(By.xpath(locator)));
        element.selectByVisibleText(value);
    }

    public void clearField(String field, Object... fieldArguments){
        String locator = Utils.getUIMappingByKey(field);
        WebElement element = driver.findElement(By.xpath(locator));
        element.clear();
    }

    public void uploadImage(String fileLocation, String key, Object... arguments) {
        Utils.LOG.info("Uploading image");
        String locator = Utils.getUIMappingByKey(key);
        WebElement element = driver.findElement(By.xpath(locator));
        element.sendKeys(fileLocation);
    }

    public void scrollDown(String locator){
        waitForElementVisibleUntilTimeout(locator,10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement webElement = driver.findElement(By.xpath(Utils.getUIMappingByKey(locator)));
        js.executeScript("arguments[0].scrollIntoView();", webElement);
    }


    //############# WAITS #########

    public void waitForElementVisible(String locatorKey, Object... arguments) {
        Integer defaultTimeout = Integer.parseInt(Utils.getConfigPropertyByKey("config.defaultTimeoutSeconds"));
        waitForElementVisibleUntilTimeout(locatorKey, defaultTimeout, arguments);
    }

    public void waitForElementVisibleUntilTimeout(String locator, int seconds, Object... locatorArguments) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        waitForElementPresent(locator, locatorArguments);
        String xpath = getLocatorValueByKey(locator, locatorArguments);
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
        } catch (Exception exception) {
            Assert.fail("Element with locator: '" + xpath + "' was not found.");
        }
    }

    public void waitForElementPresent(String locator, Object... arguments) {
        Integer defaultTimeout = Integer.parseInt(Utils.getConfigPropertyByKey("config.defaultTimeoutSeconds"));
        WebDriverWait wait = new WebDriverWait(driver, defaultTimeout);
        try {
            isElementPresent(locator, arguments);
        } catch (Exception exception) {
            Assert.fail("Element with locator: '" + locator + "' was not found.");
        }
    }

    public boolean isElementPresent(String locator, Object... arguments) {
        Integer defaultTimeout = Integer.parseInt(Utils.getConfigPropertyByKey("config.defaultTimeoutSeconds"));
        return isElementPresentUntilTimeout(locator, defaultTimeout, arguments);
    }

    public boolean isElementPresentUntilTimeout(String locator, int timeout, Object... arguments) {
        try {
            String xpath = getLocatorValueByKey(locator, arguments);
            Integer defaultTimeout = Integer.parseInt(Utils.getConfigPropertyByKey("config.defaultTimeoutSeconds"));
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

        public boolean isElementVisible(String locator) {
            try {
                Integer defaultTimeout = Integer.parseInt(Utils.getConfigPropertyByKey("config.defaultTimeoutSeconds"));
                WebDriverWait wait = new WebDriverWait(driver, defaultTimeout);
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(Utils.getUIMappingByKey(locator))));
                return true;
            } catch (Exception exception) {
                return false;
            }
        }

    public void waitForElementPresentUntilTimeout(String locator, int seconds, String... locatorArguments) {
        locator = String.format(locator, locatorArguments);
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        try {
            isElementPresent(locator, locatorArguments);
        } catch (Exception exception) {
            Assert.fail("Element with locator: '" + locator + "' was not found.");
        }
    }

    public void waitFor(long timeOutMilliseconds) {
        try {
            Thread.sleep(timeOutMilliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //############# ASSERTS #########

    public void assertElementPresent(String locator) {
        Assert.assertNotNull(driver.findElement(By.xpath(Utils.getUIMappingByKey(locator))));
    }

    public void assertAttributeValue(String locator, String expectedValue, String attribute) {
        String actualResult = driver.findElement(By.xpath(Utils.getUIMappingByKey(locator))).getAttribute(attribute);
        Assert.assertEquals("The actual value is not equal to expected", expectedValue, actualResult);
    }

    public void assertAttributeText(String locator, String expectedValue) {
        WebElement element = driver.findElement(By.xpath(Utils.getUIMappingByKey(locator)));
        String actualResult = element.getAttribute ("textContent");
        Assert.assertTrue ("The actual text is not equal to expected", actualResult.equals (expectedValue));
    }

    public void assertNavigatedUrl(String urlKey) {
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = Utils.getConfigPropertyByKey(urlKey);
        Assert.assertTrue("Landed URL is not as expected. Actual URL: " + currentUrl + ". Expected URL: " + expectedUrl, currentUrl.contains(expectedUrl));
    }


    public void pressKey(Keys key) {
        Actions actions = new Actions(driver);
        actions.sendKeys(key);
        actions.perform();
    }

    private String getLocatorValueByKey(String locator, Object[] arguments) {
        return String.format(Utils.getUIMappingByKey(locator), arguments);
    }
}
