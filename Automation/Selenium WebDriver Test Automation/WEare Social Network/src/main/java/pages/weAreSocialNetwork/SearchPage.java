package pages.weAreSocialNetwork;

import constants.Constants;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage implements Constants {
    public SearchPage(WebDriver driver) {
        super(driver, "baseUrl");
    }

    public void clickOnSeeProfileButton() {
        actions.waitForElementPresentUntilTimeout("searchPage.seeProfileButton", TIMEOUT_SECONDS);
        actions.clickElement("searchPage.seeProfileButton");
    }

    public void clickOnConnectButton() {
        actions.waitForElementPresentUntilTimeout("searchPage.connectButton", TIMEOUT_SECONDS);
        actions.clickElement("searchPage.connectButton");
    }

//TODO                   WRITE ASSERT FOR SENT FRIEND REQUEST

//    public void assertConnectRequestIsSend() {
//        actions.waitForElementVisibleUntilTimeout("searchPage.FriendRequestMessage", TIMEOUT_SECONDS);
//        actions.assertElementPresent("searchPage.FriendRequestMessage");
//    }



}
