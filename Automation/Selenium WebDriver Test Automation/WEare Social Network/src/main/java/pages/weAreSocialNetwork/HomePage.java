package pages.weAreSocialNetwork;

import constants.Constants;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage implements Constants {
    public HomePage(WebDriver driver) {
        super(driver, "baseUrl");
    }

    public void navigateToHomePage() {
        actions.waitForElementPresentUntilTimeout("homePage.weAreButton", TIMEOUT_SECONDS);
        actions.clickElement("homePage.weAreButton");
    }

    public void fillInProfessionalCategoryField() {
        actions.waitForElementVisibleUntilTimeout("homePage.searchBox",TIMEOUT_SECONDS);
        actions.typeValueInField(PROFESSIONAL_CATEGORY_SECOND_USER,"homePage.professionalCategoryField");
    }

    public void fillInNameField() {
        actions.waitForElementVisibleUntilTimeout("homePage.searchBox",TIMEOUT_SECONDS);
        actions.typeValueInField(FIRST_NAME + " " + LAST_NAME,"homePage.namesField");
    }

    public void clickOnSearchButton() {
        actions.waitForElementVisibleUntilTimeout("homePage.searchButton", TIMEOUT_SECONDS);
        actions.clickElement("homePage.searchButton");
    }

    public void assertUserProfileIsDisplayed() {
        actions.waitForElementVisibleUntilTimeout("homePage.assertNames", TIMEOUT_SECONDS);
        actions.assertTextEquals("homePage.assertNames", FIRST_NAME + " " + LAST_NAME);
        actions.assertTextEquals("homePage.assertProfessionalCategory", PROFESSIONAL_CATEGORY_SECOND_USER );
    }


    }




