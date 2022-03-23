package com.myproject.mp.common;

import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class Browser {
	public static WebDriver driver = null;

public static void openBrowser(String browserType) {
	
	switch(browserType) {
		case "Chrome":
			openChrome();
			WaitUtil.applyPageLoadTimeOut(120);
			break;
		case "Firefox":
			openFirefox();
			WaitUtil.applyPageLoadTimeOut(120);
			break;
		default:
			break;
	}
}

private static void openFirefox() {
	//Firefox browser initialisation
	WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
	driver = new FirefoxDriver();
	
}

private static void openChrome() {
	// Chrome browser initialisation
	WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
	ChromeOptions chromeSettings = getChromeBrowserSettings();
	driver = new ChromeDriver(chromeSettings);
	
}

private static ChromeOptions getChromeBrowserSettings() {
	// https://chromedriver.chromium.org/capabilities  ---> chrome option arguments reference
		ChromeOptions options = new ChromeOptions();
		options.addArguments(Arrays.asList("--test-type", "test-type=browser", "--disable-default-apps",
				"--enable-precise-memory-info", "--js-flags=--expose-gc", "--disable-infobars", "--start-maximized",
				"--ignore-certificate-errors", "--disable-popup-blocking", "--allow-running-insecure-content",
				"--disable-notifications", "--disable-save-password", "--disable-translate",
				"--always-authorize-plugins", "--incognito"));
		options.setExperimentalOption("useAutomationExtension", false);
		//options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		return options;
}
public static void closeAllBrowserWindows() {
	Browser.driver.quit();
	
}
	
}
