package pages.weAreSocialNetwork;

import com.telerikacademy.testframework.UserActions;
import com.telerikacademy.testframework.Utils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected String url;
    protected WebDriver driver;
    public UserActions actions;

    public BasePage(WebDriver driver, String urlKey) {
        String pageUrl = Utils.getConfigPropertyByKey(urlKey);
        this.driver = driver;
        this.url = pageUrl;
        actions = new UserActions();
    }

    public String getUrl(){ return url; };

    public void navigateToPage(){
        this.driver.get(url);
    }

    public void assertPageNavigated() {
        actions.assertNavigatedUrl(url);
    }
}
