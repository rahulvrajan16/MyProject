package com.myproject.mp.test.login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.myproject.mp.common.BaseTest;
import com.myproject.mp.common.Browser;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class LoginTest extends BaseTest {


	@BeforeClass
	@Parameters("browserType")

	public void setUpTestClass(@Optional("FIREFOX") String browserType) {
		log.info(" before the testclass:  ");
		log.info("browserType: {}", browserType);
		Browser.openBrowser(browserType);
	}
	
	@Test
	public void testCase1() {
		System.out.println("Test Case 1");
	}
	@Test
	public void testCase2() {
		System.out.println("Test Case 2");
	}
	@Test
	public void testCase3() {
		System.out.println("Test Case 3");
	}
}
