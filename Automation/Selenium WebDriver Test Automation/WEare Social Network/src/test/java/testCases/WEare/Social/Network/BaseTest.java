package testCases.WEare.Social.Network;

import com.telerikacademy.testframework.UserActions;
import org.junit.After;
import org.junit.Before;
import pages.weAreSocialNetwork.*;

public class BaseTest {

	protected UserActions actions = new UserActions();
	protected RegisterPage registerPage = new RegisterPage(actions.getDriver());
	protected LoginPage loginPage = new LoginPage(actions.getDriver());
	protected PersonalProfileEditorPage personalProfileEditorPage = new PersonalProfileEditorPage(actions.getDriver());
	protected LogOutPage logOutPage = new LogOutPage(actions.getDriver());
	protected UserDetailsPage userDetailsPage = new UserDetailsPage (actions.getDriver ());

	@Before
	public void setUp(){
		UserActions.loadBrowser("baseUrl");
	}

	@After
	public void tearDown(){
		UserActions.quitDriver();
	}
}
