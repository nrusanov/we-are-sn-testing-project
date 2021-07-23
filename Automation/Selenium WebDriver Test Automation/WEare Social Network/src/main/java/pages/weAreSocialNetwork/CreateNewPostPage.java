package pages.weAreSocialNetwork;

import constants.Constants;
import org.openqa.selenium.WebDriver;

public class CreateNewPostPage extends BasePage implements Constants {

    public CreateNewPostPage(WebDriver driver) {
        super(driver, "baseUrl");
    }

    public void navigateToCreateNewPostPage() {
        actions.waitForElementVisibleUntilTimeout("homePage.navigationBar.createPost", TIMEOUT_SECONDS);
        actions.clickElement("homePage.navigationBar.createPost");
    }

    public void selectPostVisibility() {
        actions.waitForElementVisibleUntilTimeout("createPostPage.postVisibilityDropDown", TIMEOUT_SECONDS);
        actions.clickElement("createPostPage.postVisibilityDropDown");
        actions.selectFromDropDownMenu(POST_VISIBILITY, "createPostPage.postVisibilityDropDown");
    }

    public void fillInThePostBodyWithText() {
        actions.waitForElementVisibleUntilTimeout("createPostPage.bodyField", TIMEOUT_SECONDS);
        actions.typeValueInField(POST_CONTENT,"createPostPage.bodyField" );
    }

    public void uploadImageТоТhePost() {
        actions.waitForElementVisibleUntilTimeout("createPostPage.chooseFileButton", TIMEOUT_SECONDS);
        actions.uploadImage(POST_IMAGE, "createPostPage.chooseFileButton");
    }

    public void clickOnSavePostButton() {
        actions.waitForElementVisibleUntilTimeout("createPostPage.savePostButton", TIMEOUT_SECONDS);
        actions.clickElement("createPostPage.savePostButton");
    }

    public void assertPostIsCreated() {
        actions.waitForElementPresentUntilTimeout("createPostPage.createdPost", TIMEOUT_SECONDS);
        actions.assertElementPresent("createPostPage.createdPost");
        actions.waitForElementPresentUntilTimeout("createPostPage.uploadedPicture", TIMEOUT_SECONDS);
        actions.assertElementPresent("createPostPage.uploadedPicture");
    }











}
