package pages.weAreSocialNetwork;

import constants.Constants;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage implements Constants {

    public LoginPage(WebDriver driver) { super(driver, "baseUrl");
    }

    public void navigateToLoginPage() {
        actions.waitForElementPresentUntilTimeout("homePage.navigationBar.signInButton", 30);
        actions.clickElement("homePage.navigationBar.signInButton");
    }


    public void signInRegularUser() {
        navigateToPage();
        actions.waitForElementPresentUntilTimeout("registerPage.joinMessage", 30);
        actions.typeValueInField(USERNAME_FIRST_USER, "loginPage.usernameField");
        actions.typeValueInField(PASSWORD_FIRST_USER, "loginPage.passwordField");
        actions.clickElement("loginPage.loginButton");
    }

    public void signInAdmin() {
        navigateToPage();
        actions.waitForElementPresentUntilTimeout("registerPage.joinMessage", 30);
        actions.typeValueInField(ADMIN_USERNAME, "loginPage.usernameField");
        actions.typeValueInField(ADMIN_PASSWORD, "loginPage.passwordField");
        actions.clickElement("loginPage.loginButton");
    }

    public void assertLoginPageNavigated() {
        actions.waitForElementPresentUntilTimeout("loginPage.loginText", 30);
        actions.assertElementPresent("loginPage.loginText");
    }

    public void assertSuccessfulLogin(){
        actions.waitForElementVisibleUntilTimeout("homePage.navigationBar.logOutButton", 30);
        actions.assertElementPresent("homePage.navigationBar.logOutButton");
        actions.waitForElementVisibleUntilTimeout("homePage.navigationBar.PersonalProfile", 30);
        actions.assertElementPresent("homePage.navigationBar.PersonalProfile");
    }












}
