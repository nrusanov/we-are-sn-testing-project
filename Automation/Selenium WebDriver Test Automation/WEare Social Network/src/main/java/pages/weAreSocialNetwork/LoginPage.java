package pages.weAreSocialNetwork;

import constants.Constants;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage implements Constants {


    public LoginPage(WebDriver driver) { super(driver, "baseUrl");
    }

    public void navigateToLoginPage() {
        actions.waitForElementPresentUntilTimeout("homePage.navigationBar.signInButton", TIMEOUT_SECONDS);
        actions.clickElement("homePage.navigationBar.signInButton");
    }


    public void loginRegularUser() {
        actions.waitForElementPresentUntilTimeout("usernameField", TIMEOUT_SECONDS);
        actions.typeValueInField(FIRST_USER_USERNAME, "usernameField");
        actions.typeValueInField(PASSWORD_FIRST_USER, "passwordField");
        actions.clickElement("loginPage.loginButton");
    }

    public void loginSecondRegularUser() {
        actions.waitForElementPresentUntilTimeout("usernameField", TIMEOUT_SECONDS);
        actions.typeValueInField(SECOND_USER_USERNAME, "usernameField");
        actions.typeValueInField(PASSWORD_SECOND_USER, "passwordField");
        actions.clickElement("loginPage.loginButton");
    }

    public void loginInAdmin() {
        actions.waitForElementPresentUntilTimeout("usernameField", TIMEOUT_SECONDS);
        actions.typeValueInField(ADMIN_USERNAME, "usernameField");
        actions.typeValueInField(ADMIN_PASSWORD, "passwordField");
        actions.clickElement("loginPage.loginButton");
    }

    public void assertLoginPageNavigated() {
        actions.waitForElementPresentUntilTimeout("loginPage.loginText", TIMEOUT_SECONDS);
        actions.assertElementPresent("loginPage.loginText");
    }

    public void assertSuccessfulLogin(){
        actions.waitForElementVisibleUntilTimeout("homePage.navigationBar.logOutButton", TIMEOUT_SECONDS);
        actions.assertElementPresent("homePage.navigationBar.logOutButton");
        actions.waitForElementVisibleUntilTimeout("homePage.navigationBar.PersonalProfile", TIMEOUT_SECONDS);
        actions.assertElementPresent("homePage.navigationBar.PersonalProfile");
    }












}
