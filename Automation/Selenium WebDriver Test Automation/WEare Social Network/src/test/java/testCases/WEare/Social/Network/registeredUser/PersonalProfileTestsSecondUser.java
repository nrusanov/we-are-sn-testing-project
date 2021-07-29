package testCases.WEare.Social.Network.RegisteredUser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testCases.WEare.Social.Network.BaseTest;

public class PersonalProfileTestsSecondUser extends BaseTest {

    @Before
    public void NavigateToPersonalProfilePage_When_RegularUserAuthenticate() {
        loginPage.navigateToLoginPage();
        loginPage.assertLoginPageNavigated();

        loginPage.loginSecondRegularUser();
        loginPage.assertSuccessfulLogin();

        personalProfileEditorPage.navigateToPersonalProfileEditorPage();
        personalProfileEditorPage.assertPersonalProfileEditorPageNavigated();
    }

    @Test
    public void TC_01_SecondUserSuccessfulUpdatePersonalInformation_When_RequiredAndNotRequiredFieldsAreFilled() {
        personalProfileEditorPage.secondUserUpdatePersonalInformationWithAllRequiredFieldsAndAllNotRequiredFields();

        personalProfileEditorPage.assertSecondUserUpdatedPersonalInformationWithAllRequiredFieldsAndAllNotRequired();
    }

    @Test
    public void TC_02_SecondUserSuccessfulUpdateProfessionalCategory_When_CategoryIsSelected() {
        personalProfileEditorPage.updateSecondUserProfessionalCategory();

        userDetailsPage.assertUpdatedProfessionalCategoryForSecondUser();
    }

    @After
    public void logOut() {
        logOutPage.clickOnLogOutButton();
        logOutPage.assertUserIsLoggedOut();
    }

}
