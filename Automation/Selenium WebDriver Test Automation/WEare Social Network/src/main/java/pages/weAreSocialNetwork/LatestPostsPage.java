package pages.weAreSocialNetwork;

import constants.Constants;
import org.openqa.selenium.WebDriver;

public class LatestPostsPage extends BasePage implements Constants {

    public LatestPostsPage(WebDriver driver, String urlKey) {
        super (driver, "baseUrl");
    }

    public void navigateToLastPostsPage(String username, String password) {
        actions.waitForElementVisibleUntilTimeout("homePage.navigationBar.LatestPosts", 30);
        actions.clickElement("homePage.navigationBar.LatestPosts");
    }

    public void assertLatestPostsPageNavigated() {
        actions.assertElementPresent("LatestPostsPage.browsePublicPostsButton");
        actions.assertElementPresent("LatestPostsPage.browseCategoryButton");
    }

    public void filterPublicPosts() {
        actions.waitForElementPresentUntilTimeout("LatestPostsPage.browsePublicPostsButton", 30);
        actions.clickElement("personalProfilePage.updateMyProfileButton");
    }

    public void filterCategories (){
        actions.waitForElementVisibleUntilTimeout("LatestPostsPage.browseCategoryButton", 30);
        actions.waitForElementVisibleUntilTimeout("LatestPostsPage.browseCategoryDropDown", 30);
        actions.clickElement("LatestPostsPage.browseCategoryDropDown");
        actions.waitForElementVisibleUntilTimeout("LatestPostsPage.allCategoryButton", 30);
        actions.clickElement("LatestPostsPage.allCategoryButton");
    }

}
