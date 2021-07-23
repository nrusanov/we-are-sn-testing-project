package testCases.WEare.Social.Network.unregisteredUser;

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
    public void TC_01_UserSuccessfulRegistration_When_RequiredFieldsAreFilled() {
        registerPage.registerRegularUser();

        registerPage.assertSuccessfulRegistration();
    }
}
