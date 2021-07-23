package stepDefinitions;

import com.telerikacademy.testframework.UserActions;
import constants.Constants;
import org.jbehave.core.annotations.*;
import pages.weAreSocialNetwork.*;

public class BaseStepDefinitions {
    protected UserActions actions = new UserActions();
    protected RegisterPage registrationPage = new RegisterPage(actions.getDriver());
    protected LoginPage loginPage = new LoginPage(actions.getDriver());
    protected HomePage homePage = new HomePage(actions.getDriver());
    protected SearchPage searchPage = new SearchPage(actions.getDriver());
    protected PersonalProfileEditorPage personalProfileEditorPage = new PersonalProfileEditorPage(actions.getDriver());
    protected CreateNewPostPage createNewPostPage = new CreateNewPostPage(actions.getDriver());
    protected LogOutPage logOutPage = new LogOutPage(actions.getDriver());

    @BeforeStories
    public void setUp() {
        UserActions.loadBrowser("baseUrl");
        loginPage.navigateToLoginPage();
    }

    @BeforeScenario
    public void setInstances() {
        loginPage.signInRegularUser(Constants.FIRST_USER_USERNAME, Constants.PASSWORD_FIRST_USER);
    }


    @AfterStories
    public static void tearDown() {
        UserActions.quitDriver();
    }

}
