package pages.weAreSocialNetwork;

import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) { super(driver, "baseUrl");
    }


    public void navigateToRegisterPage() {
        actions.waitForElementPresentUntilTimeout("homePage.navigationBar.registerButton", 30);
        actions.clickElement("homePage.navigationBar.registerButton");
    }

    public void registerRegularUser() {
        actions.waitForElementPresentUntilTimeout("registerPage.joinMessage", 30);
        actions.typeValueInField("users.username1", "registerPage.usernameField");
        actions.typeValueInField("users.email1", "registerPage.emailField");
        actions.typeValueInField("users.password1", "registerPage.passwordField");
        actions.typeValueInField("users.confirmPassword1","registerPage.confirmPasswordField");
        actions.clickElement("registerPage.registerButton");
    }

    public void registerAdmin() {
        actions.waitForElementPresentUntilTimeout("registerPage.joinMessage", 30);
        actions.typeValueInField("admin.username", "registerPage.usernameField");
        actions.typeValueInField("admin.email", "registerPage.emailField");
        actions.typeValueInField("admin.password", "registerPage.passwordField");
        actions.typeValueInField("admin.confirmPassword","registerPage.confirmPasswordField");
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