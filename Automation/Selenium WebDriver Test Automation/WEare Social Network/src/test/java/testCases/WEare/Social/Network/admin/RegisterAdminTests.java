package testCases.WEare.Social.Network.admin;

import org.junit.Before;
import org.junit.Test;
import testCases.WEare.Social.Network.BaseTest;

public class RegisterAdminTests extends BaseTest {

    @Before
    public void navigateToRegisterPage() {
        registerPage.navigateToRegisterPage();

        registerPage.assertRegisterPageNavigated();
    }

    @Test
    public void TC_01_AdminSuccessfulRegistration_When_RequiredFieldsAreFilled() {
        registerPage.registerAdmin();

        registerPage.assertSuccessfulRegistration();
    }
}
