package stepDefinitions;

import constants.Constants;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class StepDefinitions extends BaseStepDefinitions {

    @Given("User click $element element")
    @When("User click $element element")
    @Then("User click $element element")
    public void clickElement(String element) {
        actions.clickElement(element);
    }

    @Given("User type $value in $name field")
    @When("User type $value in $name field")
    @Then("User type $value in $name field")
    public void typeInField(String value, String field) {
        actions.typeValueInField(value, field);
    }

    @Given("User select $value from $dropdown dropdown")
    @When("User select $value from $dropdown dropdown")
    @Then("User select $value from $dropdown dropdown")
    public void selectFromDropDownMenu(String value, String select) {
        actions.selectFromDropDownMenu(value, select);
    }

    @Given("User upload $image from $button button")
    @When("User upload $image from $button button")
    @Then("User upload $image from $button button")
    public void uploadImage(String fileLocation, String key, Object... arguments) {
        actions.uploadImage(fileLocation, key, arguments);
    }

    @Given("Assert $element present")
    @When("Assert $element present")
    @Then("Assert $element present")
    public void assertElementPresent(String locator) {actions.assertElementPresent(locator); }


    @Given("I open Crete New Post page")
    public void openLoginPage(){createNewPostPage.navigateToCreateNewPostPage();}

    @When("I select $visibility visibility from the dropdown menu")
    public void selectPostVisibility(String visibility) {
        createNewPostPage.selectPostVisibility(Constants.POST_VISIBILITY);
    }

    @When("I type the text $text in the body field")
    public void fillInThePostBodyWithText() {
        createNewPostPage.fillInThePostBodyWithText(Constants.POST_CONTENT);
    }
    @When("I upload a image in the post")
    public void uploadImageТоТhePost() {
        createNewPostPage.uploadImageТоТhePost();
    }

    @When("I click on 'Save post' button")
     public void clickOnSavePostButton() {
         createNewPostPage.clickOnSavePostButton();
        }

      @Then("A public post is created, containing a body and an image")
    public void assertPostIsCreated() {
        createNewPostPage.assertPostIsCreated();

        }





}