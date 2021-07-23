package stepDefinitions;

import com.telerikacademy.testframework.UserActions;
import constants.Constants;
import org.jbehave.core.annotations.*;
import pages.weAreSocialNetwork.CreateNewPostPage;
import pages.weAreSocialNetwork.LoginPage;
import pages.weAreSocialNetwork.PersonalProfileEditorPage;
import pages.weAreSocialNetwork.RegisterPage;

public class BaseStepDefinitions {
    protected UserActions actions = new UserActions();
    protected RegisterPage registrationPage = new RegisterPage(actions.getDriver());
    protected LoginPage loginPage = new LoginPage(actions.getDriver());
    protected PersonalProfileEditorPage personalProfileEditorPage = new PersonalProfileEditorPage(actions.getDriver());
    protected CreateNewPostPage createNewPostPage = new CreateNewPostPage(actions.getDriver());

    @BeforeStories
    public void setUp() {
        UserActions.loadBrowser("baseUrl");
        loginPage.navigateToLoginPage();
        loginPage.signInRegularUser(Constants.FIRST_USER_USERNAME, Constants.PASSWORD_FIRST_USER);
    }

    @BeforeScenario
    public void setInstances() {
        UserActions actions = new UserActions();
        RegisterPage registrationPage = new RegisterPage(actions.getDriver());
        LoginPage loginPage = new LoginPage(actions.getDriver());
        PersonalProfileEditorPage personalProfileEditorPage = new PersonalProfileEditorPage(actions.getDriver());
        CreateNewPostPage createNewPostPage = new CreateNewPostPage(actions.getDriver());

    }


    @AfterStories
    public static void tearDown() {
        UserActions.quitDriver();
    }

}
