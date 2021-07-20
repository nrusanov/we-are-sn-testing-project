package stepDefinitions;

import com.telerikacademy.testframework.UserActions;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStory;

public class BaseStepDefinitions {


    @BeforeStory
    public static void setUp() {
        UserActions.loadBrowser("");
    }


    @AfterStory
    public static void tearDown() {
        UserActions.quitDriver();
    }

}
