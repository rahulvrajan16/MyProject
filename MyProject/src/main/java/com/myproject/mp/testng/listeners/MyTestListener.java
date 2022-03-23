package com.myproject.mp.testng.listeners;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {
	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println(arg0.getName() + "Test  finished");



	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println(arg0.getName() + "test on start");


	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

		System.out.println(arg0.getName() + " test on failed");
		System.out.println(arg0.getTestName());


	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "failure");
		System.out.println(result.getTestName());
		if (result.getStatus() == ITestResult.FAILURE) {
// Do something here
			System.out.println("Failed ***********");
			String testcasename = result.getName();
			System.out.println(testcasename);
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println(arg0.getName() + "on testskipped");

		System.out.println(arg0.getTestName());
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println(arg0.getName() + "onstarted");

		System.out.println(arg0.getTestName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "on test success");

		System.out.println(result.getTestName());

		try {
			if (result.getStatus() == ITestResult.SUCCESS) {

// Do something here
				System.out.println("passed **********");
				String testcasename = result.getName();
				System.out.println(testcasename);

			}

		} catch (Exception e) {

		}

	}
}
