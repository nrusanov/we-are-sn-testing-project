package testCases.WEare.Social.Network;

import com.telerikacademy.testframework.UserActions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import pages.weAreSocialNetwork.LoginPage;
import pages.weAreSocialNetwork.PersonalProfileEditorPage;
import pages.weAreSocialNetwork.PersonalProfilePage;
import pages.weAreSocialNetwork.RegisterPage;

public class BaseTest {

	protected UserActions actions = new UserActions();
	protected RegisterPage registerPage = new RegisterPage(actions.getDriver());
	protected LoginPage loginPage = new LoginPage(actions.getDriver());
	protected PersonalProfilePage personalProfilePage = new PersonalProfilePage(actions.getDriver());
	protected PersonalProfileEditorPage personalProfileEditorPage = new PersonalProfileEditorPage(actions.getDriver());

	@BeforeClass
	public static void setUp(){
		UserActions.loadBrowser("baseUrl");
	}

	@AfterClass
	public static void tearDown(){
		UserActions.quitDriver();
	}
}
