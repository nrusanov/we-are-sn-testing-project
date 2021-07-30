package testCases.WEare.Social.Network.admin;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.runners.MethodSorters;
import testCases.WEare.Social.Network.BaseTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AdminPersonalProfileTests extends BaseTest {


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
    @Disabled
    public void TC_04_AdminSuccessfulUpdateServices_When_FieldsAreFilled() {
        personalProfileEditorPage.updateServices();

        userDetailsPage.assertUpdatedServices();
    }

    @Test
    public void TC_05_AdminSuccessfulUpdatePersonalInfoAndSafety_When_UploadProfilePictureAndChooseVisibility() {
        personalProfileEditorPage.updatePersonalInfoAndSafety();

        personalProfileEditorPage.assertUpdatedPersonalInfoAndSafety();
    }

    @After
    public void logOut() {
        logOutPage.clickOnLogOutButton();
        logOutPage.assertUserIsLoggedOut();
    }



}

