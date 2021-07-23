package testCases.WEare.Social.Network.Admin;

import constants.Constants;
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
    public void TC_01_AdminSuccessfullyLogin_When_EnterValidCredentials() {
        loginPage.signInAdmin(Constants.ADMIN_USERNAME, Constants.ADMIN_PASSWORD);

        loginPage.assertSuccessfulLogin();
    }

}
