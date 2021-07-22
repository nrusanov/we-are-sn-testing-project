package com.telerikacademy.testframework;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CustomWebDriverManager {
	public enum CustomWebDriverManagerEnum {
		INSTANCE;
		private WebDriver driver = setupBrowser();

		private WebDriver setupBrowser(){
			ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriver chromeDriver = new ChromeDriver(chromeOptions);
			chromeDriver.manage().window().maximize();

			driver = chromeDriver;
			return chromeDriver;
		}

		public void quitDriver() {
			if (driver != null) {
				driver.quit();
				driver = null;
			}
		}

		public WebDriver getDriver() {
			if (driver == null){
				setupBrowser();
			}
			return driver;
		}


	}
}
