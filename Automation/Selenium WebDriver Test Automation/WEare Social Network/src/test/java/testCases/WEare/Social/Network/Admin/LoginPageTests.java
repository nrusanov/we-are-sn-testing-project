package testCases.WEare.Social.Network.Admin;

import org.junit.Before;
import org.junit.Test;
import testCases.WEare.Social.Network.BaseTest;

public class LoginPageTests extends BaseTest {

    @Before
    public void navigateToRegisterPage() {
        loginPage.navigateToLoginPage();

        loginPage.assertLoginPageNavigated();
    }

//    @Test
//    public void TC_01_AdminSuccessfullyLogin_When_EnterValidCredentials() {
//        loginPage.signInAdmin();
//
//        loginPage.assertSuccessfulLogin();
//    }
}