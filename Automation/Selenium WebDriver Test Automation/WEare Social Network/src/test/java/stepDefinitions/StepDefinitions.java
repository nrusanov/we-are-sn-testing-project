package stepDefinitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class StepDefinitions extends BaseStepDefinitions {


    @Given("Click $element element")
    @When("Click $element element")
    @Then("Click $element element")
    public void clickElement(String element) {
        actions.clickElement(element);
    }

    @Given("Type $value in $name field")
    @When("Type $value in $name field")
    @Then("Type $value in $name field")
    public void typeInField(String value, String field) {
        actions.typeValueInField(value, field);
    }

    @Given("Select $value from $dropdown dropdown")
    @When("Select $value from $dropdown dropdown")
    @Then("Select $value from $dropdown dropdown")
    public void selectFromDropDownMenu(String value, String select) {
        actions.selectFromDropDownMenu(value, select);
    }


}
