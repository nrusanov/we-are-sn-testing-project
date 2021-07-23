package pages.weAreSocialNetwork;

import constants.Constants;
import org.openqa.selenium.WebDriver;

public class LatestPostsPage extends BasePage implements Constants {

    public LatestPostsPage(WebDriver driver, String urlKey) {
        super (driver, "baseUrl");
    }

    public void navigateToLastPostsPage(String username, String password) {
        actions.waitForElementVisibleUntilTimeout("homePage.navigationBar.LatestPosts", TIMEOUT_SECONDS);
        actions.clickElement("homePage.navigationBar.LatestPosts");
    }

    public void assertLatestPostsPageNavigated() {
        actions.assertElementPresent("LatestPostsPage.browsePublicPostsButton");
        actions.assertElementPresent("LatestPostsPage.browseCategoryButton");
    }

    public void filterPublicPosts() {
        actions.waitForElementPresentUntilTimeout("LatestPostsPage.browsePublicPostsButton", TIMEOUT_SECONDS);
        actions.clickElement("personalProfilePage.updateMyProfileButton");
    }

    public void filterCategories (){
        actions.waitForElementVisibleUntilTimeout("LatestPostsPage.browseCategoryButton", TIMEOUT_SECONDS);
        actions.waitForElementVisibleUntilTimeout("LatestPostsPage.browseCategoryDropDown", TIMEOUT_SECONDS);
        actions.clickElement("LatestPostsPage.browseCategoryDropDown");
        actions.waitForElementVisibleUntilTimeout("LatestPostsPage.allCategoryButton", TIMEOUT_SECONDS);
        actions.clickElement("LatestPostsPage.allCategoryButton");
    }

}
