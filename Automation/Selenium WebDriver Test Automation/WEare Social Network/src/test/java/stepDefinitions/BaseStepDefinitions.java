package stepDefinitions;

import com.telerikacademy.testframework.UserActions;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStory;
import pages.weAreSocialNetwork.LoginPage;
import pages.weAreSocialNetwork.PersonalProfileEditorPage;
import pages.weAreSocialNetwork.RegisterPage;

public class BaseStepDefinitions {
    protected UserActions actions = new UserActions();
    protected RegisterPage registrationPage = new RegisterPage(actions.getDriver());
    protected LoginPage loginPage = new LoginPage(actions.getDriver());
    protected PersonalProfileEditorPage personalProfileEditorPage = new PersonalProfileEditorPage(actions.getDriver());


    @BeforeStory
    public static void setUp() {
        UserActions.loadBrowser("baseUrl");
    }

    @BeforeScenario
    public void setInstances() {
        UserActions userActions = new UserActions();
        RegisterPage registrationPage = new RegisterPage(userActions.getDriver());
        LoginPage loginPage = new LoginPage(userActions.getDriver());
        PersonalProfileEditorPage personalProfileEditorPage = new PersonalProfileEditorPage(userActions.getDriver());

    }


    @AfterStory
    public static void tearDown() {
        UserActions.quitDriver();
    }

}
