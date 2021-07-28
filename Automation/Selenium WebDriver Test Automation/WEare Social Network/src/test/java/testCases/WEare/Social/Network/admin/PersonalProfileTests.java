package testCases.WEare.Social.Network.admin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testCases.WEare.Social.Network.BaseTest;

public class PersonalProfileTests extends BaseTest {


    @Before
    public void NavigateToPersonalProfilePage_When_AdminAuthenticate() {
        loginPage.navigateToLoginPage();
        loginPage.assertLoginPageNavigated();

        loginPage.loginInAdmin();
        loginPage.assertSuccessfulLogin();

        personalProfileEditorPage.navigateToPersonalProfileEditorPage();
        personalProfileEditorPage.assertPersonalProfileEditorPageNavigated();
    }

    @Test
    public void TC_01_AdminSuccessfulUpdatePersonalInformation_When_RequiredFieldsAreFilled() {
        personalProfileEditorPage.adminUpdatePersonalInformationWithAllRequiredFields();

        personalProfileEditorPage.assertAdminUpdatedPersonalInformationWithAllRequiredFields();
    }

    @Test
    public void TC_02_AdminSuccessfulUpdatePersonalInformation_When_RequiredAndNotRequiredFieldsAreFilled() {
        personalProfileEditorPage.adminUpdatePersonalInformationWithAllRequiredFieldsAndAllNotRequiredFields();

        personalProfileEditorPage.assertAdminUpdatedPersonalInformationWithAllRequiredFieldsAndAllNotRequired();
    }

    @Test
    public void TC_03_AdminSuccessfulUpdateProfessionalCategory_When_CategoryIsSelected() {
        personalProfileEditorPage.updateProfessionalCategory();

        userDetailsPage.assertUpdatedProfessionalCategory();
    }


    @Test
    public void TC_04_AdminSuccessfulUpdatePersonalInfoAndSafety_When_UploadProfilePictureAndChooseVisibility() {
        personalProfileEditorPage.updatePersonalInfoAndSafety();

        personalProfileEditorPage.assertUpdatedPersonalInfoAndSafety();
    }

    @After
    public void logOut() {
        logOutPage.clickOnLogOutButton();
        logOutPage.assertUserIsLoggedOut();
    }



}

