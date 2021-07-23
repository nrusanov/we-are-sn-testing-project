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


    public void signInRegularUser() {
        actions.waitForElementPresentUntilTimeout("registerPage.joinMessage", TIMEOUT_SECONDS);
        actions.typeValueInField(FIRST_USER_USERNAME, "loginPage.usernameField");
        actions.typeValueInField(PASSWORD_FIRST_USER, "loginPage.passwordField");
        actions.clickElement("loginPage.loginButton");
    }

    public void signInAdmin() {
        navigateToPage();
        actions.waitForElementPresentUntilTimeout("registerPage.joinMessage", TIMEOUT_SECONDS);
        actions.typeValueInField(ADMIN_USERNAME, "loginPage.usernameField");
        actions.typeValueInField(ADMIN_PASSWORD, "loginPage.passwordField");
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
