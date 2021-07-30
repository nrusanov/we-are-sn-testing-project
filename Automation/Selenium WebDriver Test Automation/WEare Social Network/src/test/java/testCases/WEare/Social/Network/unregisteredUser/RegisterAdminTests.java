package testCases.WEare.Social.Network.unregisteredUser;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import testCases.WEare.Social.Network.BaseTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
