package stepDefinitions;

import com.telerikacademy.testframework.UserActions;
import org.jbehave.core.annotations.*;
import pages.weAreSocialNetwork.*;


public class BaseStepDefinitions {
    protected static UserActions actions=new UserActions();
    protected LoginPage loginPage=new LoginPage(actions.getDriver());

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