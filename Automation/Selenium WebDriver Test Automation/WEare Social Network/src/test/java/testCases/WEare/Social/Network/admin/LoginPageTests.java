package testCases.WEare.Social.Network.admin;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import testCases.WEare.Social.Network.BaseTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginPageTests extends BaseTest {

    @Before
    public void navigateToLoginPage() {
        loginPage.navigateToLoginPage();

        loginPage.assertLoginPageNavigated();
    }

    @Test
    public void TC_01_AdminSuccessfullyLogin_When_EnterValidCredentials() {
        loginPage.loginInAdmin();

        loginPage.assertSuccessfulLogin();
    }

    @After
    public void logOut() {
        logOutPage.clickOnLogOutButton();
        logOutPage.assertUserIsLoggedOut();
    }

}
