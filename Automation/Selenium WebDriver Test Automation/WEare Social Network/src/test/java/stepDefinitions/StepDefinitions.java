package stepDefinitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class StepDefinitions extends BaseStepDefinitions {

    @Given("I click $element element")
    @When("I click $element element")
    @Then("I click $element element")
    public void clickElement(String element) {
        actions.waitForElementVisibleUntilTimeout(element, 5);
        actions.clickElement(element);
    }

    @Given("I type $value in $name field")
    @When("I type $value in $name field")
    @Then("I type $value in $name field")
    public void typeInField(String value, String field) {
        actions.typeValueInField(value, field);
    }


    @Given("I clear $field and type $value in the field")
    @When("I clear $field and type $value in the field")
    @Then("I clear $field and type $value in the field")
    public void clearAndTypeInField(String field, String value) {
        actions.clearField(field);
        actions.typeValueInField(field, value);
    }

    @Given("I select $value from $dropdown dropdown")
    @When("I select $value from $dropdown dropdown")
    @Then("I select $value from $dropdown dropdown")
    public void selectFromDropDownMenu(String value, String select) {
        actions.selectFromDropDownMenu(value, select);
    }

    @Given("$Element element is present")
    @When("$Element element is present")
    @Then("$Element element is present")
    public void assertElementPresent(String locator) {actions.assertElementPresent(locator); }

    @Given("$Element element contains the value $value")
    @When("$Element element contains the value $value")
    @Then("$Element element contains the value $value")
    public void assertElementContainsValue(String locator, String value) {actions.assertElementPresent(locator); }


    @Given("I upload a $image in $field")
    @When("I upload a $image in $field")
    @Then("I upload a $image in $field")
    public void uploadImageТоТhePost(String image,String element) {
        actions.waitForElementVisibleUntilTimeout(element, 5);
        actions.uploadImage(image, element);
    }







}