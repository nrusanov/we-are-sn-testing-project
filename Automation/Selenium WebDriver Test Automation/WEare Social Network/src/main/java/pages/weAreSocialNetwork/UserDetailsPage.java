package pages.weAreSocialNetwork;

import constants.Constants;
import org.openqa.selenium.WebDriver;

public class UserDetailsPage extends BasePage implements Constants {

    public UserDetailsPage(WebDriver driver) {
        super (driver, "baseUrl");
    }

    public void assertUpdatedServices() {
        actions.assertAttributeText("userDetailsPage.updatedSkillOne", SKILL_FIRST);
        actions.assertAttributeText("userDetailsPage.updatedSkillTwo",SKILL_SECOND);
        actions.assertAttributeText("userDetailsPage.updatedSkillThree",SKILL_THIRD);
        actions.assertAttributeText("userDetailsPage.updatedSkillFour",SKILL_FOURTH);
        actions.assertAttributeText("userDetailsPage.updatedSkillFive",SKILL_FIFTH);
        actions.assertAttributeText("userDetailsPage.updatedWeeklyAvailability",
                WEEKLY_AVAILABILITY_FULL_TEXT);
    }

    public void assertUpdatedProfessionalCategory() {
        actions.waitForElementVisibleUntilTimeout("userDetailsPage.updatedProfessionalCategory", TIMEOUT_SECONDS);
        actions.assertAttributeText ("userDetailsPage.updatedProfessionalCategory", PROFESSIONAL_CATEGORY);
    }

    public void assertUpdatedProfessionalCategoryForSecondUser() {
        actions.waitForElementVisibleUntilTimeout("userDetailsPage.updatedProfessionalCategory", TIMEOUT_SECONDS);
        actions.assertAttributeText ("userDetailsPage.updatedProfessionalCategory", PROFESSIONAL_CATEGORY_SECOND_USER);
    }
}
