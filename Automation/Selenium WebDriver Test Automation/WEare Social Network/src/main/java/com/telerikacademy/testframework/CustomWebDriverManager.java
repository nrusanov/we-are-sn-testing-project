package com.telerikacademy.testframework;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CustomWebDriverManager {
	public enum CustomWebDriverManagerEnum {
		INSTANCE;
		private WebDriver driver = setupBrowser();

		private WebDriver setupBrowser(){
			//Run with Chrome WebDriver
			ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriver chromeDriver = new ChromeDriver(chromeOptions);
			chromeDriver.manage().window().maximize();
			driver = chromeDriver;
			return chromeDriver;

			//Run with Firefox WebDriver
//			private WebDriver setupBrowser(){
//			FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
//			WebDriver firefoxDriver = new FirefoxDriver();
//			firefoxDriver.manage().window().maximize();
//			driver = firefoxDriver;
//			return firefoxDriver;

			//Run with Opera WebDriver
//			private WebDriver setupBrowser(){
//			EdgeDriverManager.getInstance(DriverManagerType.EDGE).setup();
//			WebDriver edgeDriver = new EdgeDriver();
//			edgeDriver.manage().window().maximize();
//			driver = edgeDriver;
//			return edgeDriver;
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
