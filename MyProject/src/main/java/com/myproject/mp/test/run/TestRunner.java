package com.myproject.mp.test.run;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

import lombok.extern.slf4j.Slf4j;
@Slf4j

public class TestRunner {
	
	public static void main (String[] args) {
    	TestNG tg = new TestNG();
    	List<String> suites = new ArrayList<String>();
    	suites.add("C:\\Users\\rahul\\Work Projects\\MyProject\\src\\main\\resources\\test-suites\\master-suite.xml");
    	
    	try {
			tg.setTestSuites(suites);
		}catch(Exception e) {
			log.error("TestRunner -> main()  - Exception happened while adding test suites for execution", e);
		}
    	tg.run();
	}
}
