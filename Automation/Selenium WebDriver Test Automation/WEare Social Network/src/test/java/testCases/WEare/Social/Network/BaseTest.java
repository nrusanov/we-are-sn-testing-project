package testCases.WEare.Social.Network;

import com.telerikacademy.testframework.UserActions;
import org.junit.After;
import org.junit.Before;
<<<<<<< HEAD
import pages.weAreSocialNetwork.LogOutPage;
import pages.weAreSocialNetwork.LoginPage;
import pages.weAreSocialNetwork.PersonalProfileEditorPage;
import pages.weAreSocialNetwork.RegisterPage;
=======
import pages.weAreSocialNetwork.*;
>>>>>>> b8b1ec8dc7af684c33cbb14cf7ce70b3150b308c

public class BaseTest {

	protected UserActions actions = new UserActions();
	protected RegisterPage registerPage = new RegisterPage(actions.getDriver());
	protected LoginPage loginPage = new LoginPage(actions.getDriver());
	protected PersonalProfileEditorPage personalProfileEditorPage = new PersonalProfileEditorPage(actions.getDriver());
	protected LogOutPage logOutPage = new LogOutPage(actions.getDriver());
<<<<<<< HEAD
=======
	protected UserDetailsPage userDetailsPage = new UserDetailsPage (actions.getDriver ());
>>>>>>> b8b1ec8dc7af684c33cbb14cf7ce70b3150b308c

	@Before
	public void setUp(){
		UserActions.loadBrowser("baseUrl");
	}

	@After
	public void tearDown(){
		UserActions.quitDriver();
	}
}
