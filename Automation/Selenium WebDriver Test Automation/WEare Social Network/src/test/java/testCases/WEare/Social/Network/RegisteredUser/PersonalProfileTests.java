package testCases.WEare.Social.Network.RegisteredUser;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
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
        personalProfileEditorPage.updatePersonalInformationWithAllRequiredFields();

        personalProfileEditorPage.assertUpdatedPersonalInformationWithAllRequiredFields();
    }

    @Test
    public void TC_02_UserSuccessfulUpdatePersonalInformation_When_RequiredAndNotRequiredFieldsAreFilled() {
        personalProfileEditorPage.updatePersonalInformationWithAllRequiredFields();

        personalProfileEditorPage.assertUpdatedPersonalInformationWithAllRequiredFields();
    }

    @Test
    public void TC_03_UserSuccessfulUpdateProfessionalCategory_When_CategoryIsSelected() {
        personalProfileEditorPage.updateProfessionalCategory();

//        personalProfileEditorPage.assertUpdatedProfessionalCategory();
    }

    @Test
    public void TC_04_UserSuccessfulUpdateServices_When_FieldsAreFilled() {
        personalProfileEditorPage.updateServices();

        personalProfileEditorPage.assertUpdatedServices();

    }





}
