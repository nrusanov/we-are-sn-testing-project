package testCases.forumTelerik;

import com.telerikacademy.testframework.UserActions;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {

	UserActions actions = new UserActions();

	@BeforeClass
	public static void setUp(){
		UserActions.loadBrowser("forum.homePageURL");
	}

	@AfterClass
	public static void tearDown(){
		UserActions.quitDriver();
	}
}
