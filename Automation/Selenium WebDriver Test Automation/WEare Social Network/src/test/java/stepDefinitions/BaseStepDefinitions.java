package stepDefinitions;

import com.telerikacademy.testframework.UserActions;
import org.jbehave.core.annotations.*;
import pages.weAreSocialNetwork.*;


public class BaseStepDefinitions {
    protected static UserActions actions=new UserActions();
    protected RegisterPage registrationPage=new RegisterPage(actions.getDriver());
    protected LoginPage loginPage=new LoginPage(actions.getDriver());
    protected SearchPage searchPage=new SearchPage(actions.getDriver());
    protected PersonalProfileEditorPage personalProfileEditorPage=new PersonalProfileEditorPage(actions.getDriver());
    protected LogOutPage logOutPage=new LogOutPage(actions.getDriver());


    @BeforeStories
    public void setUp() {
        UserActions.loadBrowser("baseUrl");
        loginPage.navigateToLoginPage();
        loginPage.assertLoginPageNavigated();
    }

    
    @AfterStories
    public void tearDown() {
        UserActions.quitDriver();
    }
}