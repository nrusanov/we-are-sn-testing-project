package pages.weAreSocialNetwork;

import org.openqa.selenium.WebDriver;

public class PersonalProfilePage extends BasePage {

    public PersonalProfilePage(WebDriver driver) {
        super(driver, "baseUrl");
    }

    public void navigateToPersonalProfilePage(String username, String password) {
        actions.waitForElementVisibleUntilTimeout("homePage.navigationBar.PersonalProfile", 30);
        actions.clickElement("homePage.navigationBar.PersonalProfile");
    }

    public void assertPersonalProfilePageNavigated() {
        actions.waitForElementPresentUntilTimeout("personalProfilePage.editButton", 30);
        actions.assertElementPresent("personalProfilePage.editButton");
    }














}
