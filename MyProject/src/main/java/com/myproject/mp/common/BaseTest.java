package com.myproject.mp.common;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;



public abstract class BaseTest {
	@BeforeClass
	@Parameters("browserType")
	public void setupTestClass(@Optional("Chrome") String browserType){
		System.out.println("Before the testclass: ");
		System.out.println("Browser Type: "+ browserType);
		Browser.openBrowser(browserType);
	}
	
	@AfterClass
	public void tearDownTestClass() {
		System.out.println("After the test class");
		Browser.driver.quit();
	}

}
