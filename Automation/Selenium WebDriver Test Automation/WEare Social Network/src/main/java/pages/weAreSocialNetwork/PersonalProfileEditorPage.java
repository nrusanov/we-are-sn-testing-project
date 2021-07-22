package pages.weAreSocialNetwork;

import constants.Constants;
import org.openqa.selenium.WebDriver;


public class PersonalProfileEditorPage extends BasePage implements Constants {

    public PersonalProfileEditorPage(WebDriver driver) {
        super(driver, "baseUrl");
    }

    public void navigateToPersonalProfileEditorPage(String username, String password) {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.editButton", 30);
        actions.clickElement("personalProfilePage.editButton");
    }

    public void updatePersonalInformationWithAllRequiredFields() {
        actions.waitForElementPresentUntilTimeout("personalProfilePage.firstName", 30);
        actions.typeValueInField(FIRST_NAME, "personalProfilePage.firstName");
        actions.typeValueInField(LAST_NAME, "personalProfilePage.lastName");
        actions.typeValueInField(BIRTHDAY_DATE,"personalProfilePage.birthday");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
    }

    public void updatePersonalInformationWithInvalidDataInAllRequiredFields() {
        actions.waitForElementPresentUntilTimeout("personalProfilePage.firstName", 30);
        actions.clearField("personalProfilePage.firstName");
        actions.typeValueInField(FIRST_NAME_INVALID, "personalProfilePage.firstName");
        actions.clearField("personalProfilePage.lastName");
        actions.typeValueInField(LAST_NAME_INVALID, "personalProfilePage.lastName");
        actions.clearField("personalProfilePage.birthday");
        actions.typeValueInField(BIRTHDAY_DATE,"personalProfilePage.birthday");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
    }

    public void updatePersonalInformationWithAllRequiredFieldsAndAllNotRequiredFields() {
        actions.waitForElementPresentUntilTimeout("personalProfilePage.firstName", 30);
        actions.clearField("personalProfilePage.firstName");
        actions.typeValueInField(FIRST_NAME, "personalProfilePage.firstName");
        actions.clearField("personalProfilePage.lastName");
        actions.typeValueInField(LAST_NAME, "personalProfilePage.lastName");
        actions.clearField("personalProfilePage.birthday");
        actions.typeValueInField(BIRTHDAY_DATE,"personalProfilePage.birthday");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
        actions.select("personalProfilePage.gender.female", "personalProfilePage.gender");
        actions.typeValueInField(DROP_FEW_WORDS_FIELD, "personalProfilePage.dropFewWordsField");
        actions.select("personalProfilePage.city.plovdiv", "personalProfilePage.city");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
    }

    public void updateProfessionalCategory() {
        actions.waitForElementPresentUntilTimeout("personalProfilePage.list.editProfessionalInformation", 30);
        actions.clickElement("personalProfilePage.list.editProfessionalInformation");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.industry",30);
        actions.select("personalProfilePage.industry.designer", "personalProfilePage.industry");
    }

    public void updateServices() {
        actions.waitForElementPresentUntilTimeout("personalProfilePage.list.services", 30);
        actions.clickElement("personalProfilePage.list.services");
        actions.waitForElementPresentUntilTimeout("personalProfilePage.skill1Field",30);
        actions.typeValueInField(SKILL_FIRST,"personalProfilePage.skill1Field");
        actions.typeValueInField(SKILL_SECOND,"personalProfilePage.skill2Field");
        actions.typeValueInField(SKILL_THIRD,"personalProfilePage.skill3Field");
        actions.typeValueInField(SKILL_FOURTH,"personalProfilePage.skill4Field");
        actions.typeValueInField(SKILL_FIFTH,"personalProfilePage.skill5Field");
        actions.clearField("personalProfilePage.weeklyAvailability");
        actions.typeValueInField(WEEKLY_AVAILABILITY,"personalProfilePage.weeklyAvailability");
        actions.clickElement("personalProfilePage.updateServicesButton");
    }

    public void updatePersonalInfoAndSafety() {
        actions.waitForElementPresentUntilTimeout("personalProfilePage.list.settings",30);
        actions.clickElement("personalProfilePage.list.settings");
        actions.waitForElementPresentUntilTimeout("personalProfilePage.chooseFileButton",30);
        actions.uploadImage(USER_PROFILE_PICTURE,"personalProfilePage.chooseFileButton");
        actions.waitForElementVisibleUntilTimeout("users.picture", 30);
        actions.select("personalProfilePage.privacy.public", "personalProfilePage.privacy");
        actions.clickElement("personalProfilePage.settingsUpdateButton");
    }

    public void assertPersonalProfileEditorPageNavigated() {
        actions.waitForElementPresentUntilTimeout("personalProfilePage.list.editPersonalInformation", 30);
        actions.assertElementPresent("personalProfilePage.list.editPersonalInformation");
    }

    public void assertUpdatedPersonalInformationWithAllRequiredFields() {
        actions.waitForElementPresentUntilTimeout("", 30);
        actions.assertElementPresent("");
    }

    public void assertUpdatedPersonalInformationWithAllRequiredAndAllNotRequiredFields() {
        actions.waitForElementPresentUntilTimeout("", 30);
        actions.assertElementPresent("");
    }

    public void assertPersonalInformationNotUpdated() {
        actions.waitForElementPresentUntilTimeout("personalProfilePage.NameErrorMessage", 30);
        actions.assertElementPresent("personalProfilePage.NameErrorMessage");
    }

    public void assertUpdatedProfessionalCategory() {
        actions.waitForElementPresentUntilTimeout("personalProfilePage.industryUpdated", 30);
        actions.assertElementPresent("personalProfilePage.industryUpdated");
    }

    public void assertUpdatedServices() {
        actions.waitForElementPresentUntilTimeout("personalProfilePages.skillsUpdated", 30);
        actions.assertElementPresent("personalProfilePages.skillsUpdated");
    }

    public void assertUpdatedPersonalInfoAndASafety() {
        actions.waitForElementPresentUntilTimeout("personalProfilePage.settingUpdated", 30);
        actions.assertElementPresent("personalProfilePage.settingUpdated");
    }





}
