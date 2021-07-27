package testCases.WEare.Social.Network.registeredUser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testCases.WEare.Social.Network.BaseTest;

public class LoginPageTests extends BaseTest {


    @Before
    public void navigateToLoginPage() {
        loginPage.navigateToLoginPage();

        loginPage.assertLoginPageNavigated();
    }

    @Test
    public void TC_01_UserSuccessfullyLogin_When_EnterValidCredentials() {
        loginPage.loginRegularUser();

        loginPage.assertSuccessfulLogin();
    }

    @After
    public void logOut() {
        logOutPage.clickOnLogOutButton();
        logOutPage.assertUserIsLoggedOut();
    }



}
