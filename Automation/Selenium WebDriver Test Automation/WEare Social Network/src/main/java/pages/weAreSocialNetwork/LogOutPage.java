package pages.weAreSocialNetwork;

import constants.Constants;
import org.openqa.selenium.WebDriver;

public class LogOutPage extends BasePage implements Constants {
    public LogOutPage(WebDriver driver) {
        super(driver, "baseUrl");
    }

    public void clickOnLogOutButton() {
        actions.waitForElementVisibleUntilTimeout("homePage.navigationBar.logOutButton", TIMEOUT_SECONDS);
        actions.clickElement("homePage.navigationBar.logOutButton");
    }

    public void assertUserIsLoggedOut() {
        actions.waitForElementVisibleUntilTimeout("homePage.navigationBar.signInButton", TIMEOUT_SECONDS);
        actions.assertElementPresent("homePage.navigationBar.signInButton");
    }



}
