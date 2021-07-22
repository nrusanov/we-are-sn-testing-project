package testCases.WEare.Social.Network.UnregisteredUser;

import org.junit.Before;
import org.junit.Test;
import testCases.WEare.Social.Network.BaseTest;

public class RegisterUserTests extends BaseTest {

    @Before
    public void navigateToRegisterPage() {
        registerPage.navigateToRegisterPage();
        registerPage.assertRegisterPageNavigated();
    }

    @Test
    public void TC_R_01_() {
        registerPage.registerRegularUser();

        registerPage.assertSuccessfulRegistration();
    }
}
