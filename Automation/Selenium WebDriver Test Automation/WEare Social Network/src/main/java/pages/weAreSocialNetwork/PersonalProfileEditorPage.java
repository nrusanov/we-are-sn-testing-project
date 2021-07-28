package pages.weAreSocialNetwork;
import constants.Constants;
import org.openqa.selenium.WebDriver;
import java.nio.file.Paths;

public class PersonalProfileEditorPage extends BasePage implements Constants {

    public PersonalProfileEditorPage(WebDriver driver) {
        super(driver, "baseUrl");
    }

    public void navigateToPersonalProfileEditorPage() {
        actions.waitForElementVisibleUntilTimeout("homePage.navigationBar.PersonalProfile", TIMEOUT_SECONDS);
        actions.clickElement("homePage.navigationBar.PersonalProfile");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.editButton", TIMEOUT_SECONDS);
        actions.clickElement("personalProfilePage.editButton");
    }

    public void userUpdatePersonalInformationWithAllRequiredFields() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.firstName", TIMEOUT_SECONDS);
        actions.clearField("personalProfilePage.firstName");
        actions.typeValueInField(FIRST_NAME, "personalProfilePage.firstName");
        actions.clearField("personalProfilePage.lastName");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.lastName", TIMEOUT_SECONDS);
        actions.typeValueInField(LAST_NAME_FIRST_USER, "personalProfilePage.lastName");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.birthday", TIMEOUT_SECONDS);
        actions.typeValueInField(BIRTHDAY_DATE,"personalProfilePage.birthday");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
    }

    public void adminUpdatePersonalInformationWithAllRequiredFields() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.firstName", TIMEOUT_SECONDS);
        actions.clearField("personalProfilePage.firstName");
        actions.typeValueInField(FIRST_NAME, "personalProfilePage.firstName");
        actions.clearField("personalProfilePage.lastName");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.lastName", TIMEOUT_SECONDS);
        actions.typeValueInField(ADMIN_LAST_NAME, "personalProfilePage.lastName");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.birthday", TIMEOUT_SECONDS);
        actions.typeValueInField(BIRTHDAY_DATE,"personalProfilePage.birthday");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
    }

    public void userUpdatePersonalInformationWithAllRequiredFieldsAndAllNotRequiredFields() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.firstName", TIMEOUT_SECONDS);
        actions.clearField("personalProfilePage.firstName");
        actions.typeValueInField(FIRST_NAME, "personalProfilePage.firstName");
        actions.clearField("personalProfilePage.lastName");
        actions.typeValueInField(LAST_NAME_FIRST_USER, "personalProfilePage.lastName");
        actions.clearField("personalProfilePage.birthday");
        actions.typeValueInField(BIRTHDAY_DATE,"personalProfilePage.birthday");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
        actions.selectFromDropDownMenu(GENDER, "personalProfilePage.gender");
        actions.clearField("personalProfilePage.dropFewWordsField");
        actions.typeValueInField(DROP_FEW_WORDS_FIELD, "personalProfilePage.dropFewWordsField");
        actions.selectFromDropDownMenu(CITY, "personalProfilePage.city");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
    }

    public void secondUserUpdatePersonalInformationWithAllRequiredFieldsAndAllNotRequiredFields() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.firstName", TIMEOUT_SECONDS);
        actions.clearField("personalProfilePage.firstName");
        actions.typeValueInField(FIRST_NAME, "personalProfilePage.firstName");
        actions.clearField("personalProfilePage.lastName");
        actions.typeValueInField(LAST_NAME_SECOND_USER, "personalProfilePage.lastName");
        actions.clearField("personalProfilePage.birthday");
        actions.typeValueInField(BIRTHDAY_DATE,"personalProfilePage.birthday");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
        actions.selectFromDropDownMenu(GENDER, "personalProfilePage.gender");
        actions.clearField("personalProfilePage.dropFewWordsField");
        actions.typeValueInField(DROP_FEW_WORDS_FIELD, "personalProfilePage.dropFewWordsField");
        actions.selectFromDropDownMenu(CITY, "personalProfilePage.city");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
    }

    public void adminUpdatePersonalInformationWithAllRequiredFieldsAndAllNotRequiredFields() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.firstName", TIMEOUT_SECONDS);
        actions.clearField("personalProfilePage.firstName");
        actions.typeValueInField(FIRST_NAME, "personalProfilePage.firstName");
        actions.clearField("personalProfilePage.lastName");
        actions.typeValueInField(ADMIN_LAST_NAME, "personalProfilePage.lastName");
        actions.clearField("personalProfilePage.birthday");
        actions.typeValueInField(BIRTHDAY_DATE,"personalProfilePage.birthday");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
        actions.selectFromDropDownMenu(GENDER, "personalProfilePage.gender");
        actions.clearField("personalProfilePage.dropFewWordsField");
        actions.typeValueInField(DROP_FEW_WORDS_FIELD, "personalProfilePage.dropFewWordsField");
        actions.selectFromDropDownMenu(CITY, "personalProfilePage.city");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
    }

    public void updateProfessionalCategory() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.list.editProfessionalInformation", TIMEOUT_SECONDS);
        actions.clickElement("personalProfilePage.list.editProfessionalInformation");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.industry",TIMEOUT_SECONDS);
        actions.selectFromDropDownMenu(PROFESSIONAL_CATEGORY, "personalProfilePage.industry");
        actions.clickElement("personalProfilePage.industryUpdateButton");
    }

    public void updatePersonalInfoAndSafety() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.list.settings",TIMEOUT_SECONDS);
        actions.clickElement("personalProfilePage.list.settings");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.chooseFileButton",TIMEOUT_SECONDS);
        actions.uploadImage(USER_PROFILE_PICTURE,"personalProfilePage.chooseFileButton");
        actions.selectFromDropDownMenu(PROFILE_PRIVACY, "personalProfilePage.privacy");
        actions.clickElement("personalProfilePage.settingsUpdateButton");
    }

    public void updateSecondUserProfessionalCategory() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.list.editProfessionalInformation", TIMEOUT_SECONDS);
        actions.clickElement("personalProfilePage.list.editProfessionalInformation");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.industry",TIMEOUT_SECONDS);
        actions.selectFromDropDownMenu(PROFESSIONAL_CATEGORY_SECOND_USER, "personalProfilePage.industry");
        actions.clickElement("personalProfilePage.industryUpdateButton");
    }

    public void assertPersonalProfileEditorPageNavigated() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.list.editPersonalInformation", TIMEOUT_SECONDS);
        actions.assertElementPresent("personalProfilePage.list.editPersonalInformation");
    }

    public void assertUserUpdatedPersonalInformationWithAllRequiredFields() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.firstName", TIMEOUT_SECONDS);
        actions.assertAttributeValue("personalProfilePage.firstName", FIRST_NAME, "value");
        actions.assertAttributeValue("personalProfilePage.lastName", LAST_NAME_FIRST_USER, "value");
        actions.assertAttributeValue("personalProfilePage.birthday", BIRTHDAY_DATE_ASSERT, "value");
    }

    public void assertAdminUpdatedPersonalInformationWithAllRequiredFields() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.firstName", TIMEOUT_SECONDS);
        actions.assertAttributeValue("personalProfilePage.firstName", FIRST_NAME, "value");
        actions.assertAttributeValue("personalProfilePage.lastName", ADMIN_LAST_NAME, "value");
        actions.assertAttributeValue("personalProfilePage.birthday", BIRTHDAY_DATE_ASSERT, "value");
    }

    public void assertUserUpdatedPersonalInformationWithAllRequiredFieldsAndAllNotRequired() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.firstName", TIMEOUT_SECONDS);
        actions.assertAttributeValue("personalProfilePage.firstName", FIRST_NAME, "value");
        actions.assertAttributeValue("personalProfilePage.lastName", LAST_NAME_FIRST_USER, "value");
        actions.assertAttributeValue("personalProfilePage.birthday", BIRTHDAY_DATE_ASSERT, "value");
        actions.assertAttributeValue("personalProfilePage.dropFewWordsField", DROP_FEW_WORDS_FIELD , "value");
    }

    public void assertSecondUserUpdatedPersonalInformationWithAllRequiredFieldsAndAllNotRequired() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.firstName", TIMEOUT_SECONDS);
        actions.assertAttributeValue("personalProfilePage.firstName", FIRST_NAME, "value");
        actions.assertAttributeValue("personalProfilePage.lastName", LAST_NAME_SECOND_USER, "value");
        actions.assertAttributeValue("personalProfilePage.birthday", BIRTHDAY_DATE_ASSERT, "value");
        actions.assertAttributeValue("personalProfilePage.dropFewWordsField", DROP_FEW_WORDS_FIELD , "value");
    }

    public void assertAdminUpdatedPersonalInformationWithAllRequiredFieldsAndAllNotRequired() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.firstName", TIMEOUT_SECONDS);
        actions.assertAttributeValue("personalProfilePage.firstName", FIRST_NAME, "value");
        actions.assertAttributeValue("personalProfilePage.lastName", ADMIN_LAST_NAME, "value");
        actions.assertAttributeValue("personalProfilePage.birthday", BIRTHDAY_DATE_ASSERT, "value");
        actions.assertAttributeValue("personalProfilePage.dropFewWordsField",DROP_FEW_WORDS_FIELD , "value");
    }

    public void assertUpdatedPersonalInfoAndSafety() {
        actions.waitForElementPresentUntilTimeout("personalProfilePage.pictureUpdated", TIMEOUT_SECONDS);
        actions.assertElementPresent("personalProfilePage.pictureUpdated");
    }





}
