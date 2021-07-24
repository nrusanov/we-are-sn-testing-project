package testCases.WEare.Social.Network.registeredUser;

import constants.Constants;
import org.junit.Before;
import org.junit.Test;
import testCases.WEare.Social.Network.BaseTest;

public class PersonalProfileTests extends BaseTest {

    @Before
    public void NavigateToPersonalProfilePage_When_RegularUserAuthenticate() {
        loginPage.navigateToLoginPage();
        loginPage.assertLoginPageNavigated();

        loginPage.signInRegularUser();
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

        personalProfileEditorPage.assertUpdatedProfessionalCategory();
    }

    @Test
    public void TC_04_UserSuccessfulUpdateServices_When_FieldsAreFilled() {
        personalProfileEditorPage.updateServices();

        personalProfileEditorPage.assertUpdatedServices();
    }

    @Test
    public void TC_05_UserSuccessfulUpdatePersonalInfoAndSafety_When_UploadProfilePictureAndChooseVisibility() {
        personalProfileEditorPage.updatePersonalInfoAndSafety();

        personalProfileEditorPage.assertUpdatedPersonalInfoAndSafety();
    }



}
