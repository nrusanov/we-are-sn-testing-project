package testCases.WEare.Social.Network.registeredUser;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import testCases.WEare.Social.Network.BaseTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserPersonalProfileTests extends BaseTest {

    @Before
    public void NavigateToPersonalProfilePage_When_RegularUserAuthenticate() {
        loginPage.navigateToLoginPage();
        loginPage.assertLoginPageNavigated();

        loginPage.loginRegularUser();
        loginPage.assertSuccessfulLogin();

        personalProfileEditorPage.navigateToPersonalProfileEditorPage();
        personalProfileEditorPage.assertPersonalProfileEditorPageNavigated();
    }

    @Test
    public void TC_01_UserSuccessfulUpdatePersonalInformation_When_RequiredFieldsAreFilled() {
        personalProfileEditorPage.userUpdatePersonalInformationWithAllRequiredFields();

        personalProfileEditorPage.assertUserUpdatedPersonalInformationWithAllRequiredFields();
    }

    @Test
    public void TC_02_UserSuccessfulUpdatePersonalInformation_When_RequiredAndNotRequiredFieldsAreFilled() {
        personalProfileEditorPage.userUpdatePersonalInformationWithAllRequiredFieldsAndAllNotRequiredFields();

        personalProfileEditorPage.assertUserUpdatedPersonalInformationWithAllRequiredFieldsAndAllNotRequired();
    }

    @Test
    public void TC_03_UserSuccessfulUpdateProfessionalCategory_When_CategoryIsSelected() {
        personalProfileEditorPage.updateProfessionalCategory();

        userDetailsPage.assertUpdatedProfessionalCategory();
    }

    @Test
    public void TC_04_UserSuccessfulUpdateServices_When_FieldsAreFilled() {
        personalProfileEditorPage.updateServices();

        userDetailsPage.assertUpdatedServices();
    }

    @Test
    public void TC_05_UserSuccessfulUpdatePersonalInfoAndSafety_When_UploadProfilePictureAndChooseVisibility() {
        personalProfileEditorPage.updatePersonalInfoAndSafety();

        personalProfileEditorPage.assertUpdatedPersonalInfoAndSafety();
    }

    @After
    public void logOut() {
        logOutPage.clickOnLogOutButton();
        logOutPage.assertUserIsLoggedOut();
    }


}
