package com.myproject.mp.testng.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MyTestSuiteListener implements ISuiteListener{

	
	long startTime = 0;
	long endTime = 0;

	@Override
	public void onFinish(ISuite suite) {
		endTime = System.currentTimeMillis();
		System.out.println( suite.getName() +" Execution End Time ::: " + endTime);
		System.out.println("Total Time Taken to complete the  Testsuite " + suite.getName() +":::  "+ (endTime-startTime));
	}

	@Override
	public void onStart(ISuite suite) {
		startTime = System.currentTimeMillis();
		System.out.println( suite.getName() +" Execution Start Time ::: " + startTime);
	}
}
