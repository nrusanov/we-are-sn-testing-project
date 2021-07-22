package pages.weAreSocialNetwork;

import constants.Constants;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage implements Constants {

    public RegisterPage(WebDriver driver) { super(driver, "baseUrl");
    }


    public void navigateToRegisterPage() {
        actions.waitForElementPresentUntilTimeout("homePage.navigationBar.registerButton", 30);
        actions.clickElement("homePage.navigationBar.registerButton");
    }

    public void registerRegularUser() {
        actions.waitForElementPresentUntilTimeout("registerPage.joinMessage", 30);
        actions.typeValueInField(USERNAME_FIRST_USER, "registerPage.usernameField");
        actions.typeValueInField(EMAIL_FIRST_USER, "registerPage.emailField");
        actions.typeValueInField(PASSWORD_FIRST_USER, "registerPage.passwordField");
        actions.typeValueInField(CONFIRM_PASSWORD_FIRST_USER,"registerPage.confirmPasswordField");
        actions.clickElement("registerPage.registerButton");
    }

    public void registerAdmin() {
        actions.waitForElementPresentUntilTimeout("registerPage.joinMessage", 30);
        actions.typeValueInField(ADMIN_USERNAME, "registerPage.usernameField");
        actions.typeValueInField(ADMIN_EMAIL, "registerPage.emailField");
        actions.typeValueInField(ADMIN_PASSWORD, "registerPage.passwordField");
        actions.typeValueInField(ADMIN_CONFIRM_PASSWORD,"registerPage.confirmPasswordField");
        actions.clickElement("registerPage.registerButton");
    }

    public void assertRegisterPageNavigated() {
        actions.waitForElementVisibleUntilTimeout("registerPage.joinMessage", 30);
        actions.assertElementPresent("registerPage.joinMessage");
    }

    public void assertSuccessfulRegistration() {
        actions.waitForElementVisibleUntilTimeout("registerPage.successfulRegistrationMessage", 30);
        actions.assertElementPresent("registerPage.successfulRegistrationMessage");
    }











}