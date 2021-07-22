package stepDefinitions;

import com.telerikacademy.testframework.UserActions;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStory;
import pages.weAreSocialNetwork.RegisterPage;

public class BaseStepDefinitions {
    UserActions userActions = new UserActions();
    protected RegisterPage registrationPage = new RegisterPage(userActions.getDriver());

    @BeforeStory
    public static void setUp() {
        UserActions.loadBrowser("baseUrl");
    }


    @AfterStory
    public static void tearDown() {
        UserActions.quitDriver();
    }

}
