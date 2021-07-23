package pages.weAreSocialNetwork;

import com.telerikacademy.testframework.Utils;
import constants.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


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

    public void updatePersonalInformationWithAllRequiredFields() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.firstName", TIMEOUT_SECONDS);
        actions.clearField("personalProfilePage.firstName");
        actions.typeValueInField(FIRST_NAME, "personalProfilePage.firstName");
        actions.clearField("personalProfilePage.lastName");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.lastName", TIMEOUT_SECONDS);
        actions.typeValueInField(LAST_NAME, "personalProfilePage.lastName");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.birthday", TIMEOUT_SECONDS);
        actions.typeValueInField(BIRTHDAY_DATE,"personalProfilePage.birthday");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
    }


    public void updatePersonalInformationWithAllRequiredFieldsAndAllNotRequiredFields() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.firstName", TIMEOUT_SECONDS);
        actions.clearField("personalProfilePage.firstName");
        actions.typeValueInField(FIRST_NAME, "personalProfilePage.firstName");
        actions.clearField("personalProfilePage.lastName");
        actions.typeValueInField(LAST_NAME, "personalProfilePage.lastName");
        actions.clearField("personalProfilePage.birthday");
        actions.typeValueInField(BIRTHDAY_DATE,"personalProfilePage.birthday");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
        actions.selectFromDropDownMenu("personalProfilePage.gender.female", "personalProfilePage.gender");
        actions.typeValueInField(DROP_FEW_WORDS_FIELD, "personalProfilePage.dropFewWordsField");
        actions.selectFromDropDownMenu("personalProfilePage.city.plovdiv", "personalProfilePage.city");
        actions.clickElement("personalProfilePage.updateMyProfileButton");
    }

    public void updateProfessionalCategory() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.list.editProfessionalInformation", TIMEOUT_SECONDS);
        actions.clickElement("personalProfilePage.list.editProfessionalInformation");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.industry",TIMEOUT_SECONDS);
        actions.selectFromDropDownMenu(PROFESSIONAL_CATEGORY, "personalProfilePage.industry");
        actions.clickElement("personalProfilePage.industryUpdateButton");
    }


    public void updateServices() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.list.services", TIMEOUT_SECONDS);
        actions.clickElement("personalProfilePage.list.services");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.skill1Field",TIMEOUT_SECONDS);
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
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.list.settings",TIMEOUT_SECONDS);
        actions.clickElement("personalProfilePage.list.settings");
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.chooseFileButton",TIMEOUT_SECONDS);
        actions.uploadImage(USER_PROFILE_PICTURE,"personalProfilePage.chooseFileButton");
//        actions.waitForElementVisibleUntilTimeout("users.picture", TIMEOUT_SECONDS);
        actions.selectFromDropDownMenu(PROFILE_PRIVACY, "personalProfilePage.privacy");
        actions.clickElement("personalProfilePage.settingsUpdateButton");
    }

    public void assertPersonalProfileEditorPageNavigated() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.list.editPersonalInformation", TIMEOUT_SECONDS);
        actions.assertElementPresent("personalProfilePage.list.editPersonalInformation");
    }

    public void assertUpdatedPersonalInformationWithAllRequiredFields() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.firstName", TIMEOUT_SECONDS);
        actions.assertAttributeValue("personalProfilePage.firstName", FIRST_NAME, "value");
        actions.assertAttributeValue("personalProfilePage.lastName", LAST_NAME, "value");
        actions.assertAttributeValue("personalProfilePage.birthday", BIRTHDAY_DATE_ASSERT, "value");
    }

    public void assertUpdatedProfessionalCategory() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.updatedProfessionalCategory", TIMEOUT_SECONDS);
        actions.assertAttributeValue("personalProfilePage.updatedProfessionalCategory", PROFESSIONAL_CATEGORY, "value");
    }

    public void assertUpdatedServices() {
        actions.waitForElementVisibleUntilTimeout("personalProfilePage.skill1Field", TIMEOUT_SECONDS);
        actions.assertAttributeValue("personalProfilePage.skill1Field",SKILL_FIRST, "value");
        actions.assertAttributeValue("personalProfilePage.skill2Field",SKILL_SECOND, "value");
        actions.assertAttributeValue("personalProfilePage.skill3Field",SKILL_THIRD, "value");
        actions.assertAttributeValue("personalProfilePage.skill4Field",SKILL_FOURTH, "value");
        actions.assertAttributeValue("personalProfilePage.skill5Field",SKILL_FIFTH, "value");
        actions.assertAttributeValue("personalProfilePage.weeklyAvailability", WEEKLY_AVAILABILITY, "value");
    }


    public void assertUpdatedPersonalInfoAndSafety() {
        actions.waitForElementPresentUntilTimeout("personalProfilePage.pictureUpdated", TIMEOUT_SECONDS);
        actions.assertElementPresent("personalProfilePage.pictureUpdated");
    }





}
