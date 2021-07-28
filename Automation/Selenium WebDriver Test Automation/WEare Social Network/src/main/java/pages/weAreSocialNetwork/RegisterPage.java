package pages.weAreSocialNetwork;

import constants.Constants;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage implements Constants {

    public RegisterPage(WebDriver driver) { super(driver, "baseUrl");
    }


    public void navigateToRegisterPage() {
        actions.waitForElementPresentUntilTimeout("homePage.navigationBar.registerButton", TIMEOUT_SECONDS);
        actions.clickElement("homePage.navigationBar.registerButton");
    }



    public void registerRegularUser() {
        actions.waitForElementPresentUntilTimeout("registerPage.joinMessage", TIMEOUT_SECONDS);
        actions.typeValueInField(FIRST_USER_USERNAME, "usernameField");
        actions.typeValueInField(EMAIL_FIRST_USER, "registerPage.emailField");
        actions.typeValueInField(PASSWORD_FIRST_USER, "passwordField");
        actions.typeValueInField(PASSWORD_SECOND_USER,"registerPage.confirmPasswordField");
        actions.clickElement("registerPage.registerButton");
    }

    public void registerAdmin() {
        actions.waitForElementPresentUntilTimeout("registerPage.joinMessage", TIMEOUT_SECONDS);
        actions.typeValueInField(ADMIN_USERNAME, "usernameField");
        actions.typeValueInField(ADMIN_EMAIL, "registerPage.emailField");
        actions.typeValueInField(ADMIN_PASSWORD, "passwordField");
        actions.typeValueInField(ADMIN_CONFIRM_PASSWORD,"registerPage.confirmPasswordField");
        actions.clickElement("registerPage.registerButton");
    }

    public void assertRegisterPageNavigated() {
        actions.waitForElementVisibleUntilTimeout("registerPage.joinMessage", TIMEOUT_SECONDS);
        actions.assertElementPresent("registerPage.joinMessage");
    }

    public void assertSuccessfulRegistration() {
        actions.waitForElementVisibleUntilTimeout("registerPage.successfulRegistrationMessage", TIMEOUT_SECONDS);
        actions.assertElementPresent("registerPage.successfulRegistrationMessage");
    }











}