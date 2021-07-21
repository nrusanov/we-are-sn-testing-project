package pages.weAreSocialNetwork;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) { super(driver, "loginUrl");
    }

    public void signInRegularUser() {
        actions.waitForElementPresentUntilTimeout("registerPage.joinMessage", 30);
        actions.typeValueInField("users.username1 ", "loginPage.usernameField");
        actions.typeValueInField("users.password1", "loginPage.passwordField");
        actions.clickElement("loginPage.loginButton");
    }

    public void signInAdmin() {
        actions.waitForElementPresentUntilTimeout("registerPage.joinMessage", 30);
        actions.typeValueInField("admin.username ", "loginPage.usernameField");
        actions.typeValueInField("admin.password", "loginPage.passwordField");
        actions.clickElement("loginPage.loginButton");
    }

    public void assertSuccessfulLogin(){
        actions.waitForElementVisibleUntilTimeout("homePage.navigationBar.logOutButton", 30);
        actions.assertElementPresent("homePage.navigationBar.logOutButton");
        actions.waitForElementVisibleUntilTimeout("homePage.navigationBar.PersonalProfile", 30);
        actions.assertElementPresent("homePage.navigationBar.PersonalProfile");
    }












}
