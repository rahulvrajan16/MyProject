package com.myproject.mp.testng.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class MyTestMethodListener implements IInvokedMethodListener {
	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
	ITestNGMethod method =arg0.getTestMethod();
	System.out.println(method.getMethodName()+ " has been invoked");
	System.out.println(method.getDescription());



	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
	ITestNGMethod method =arg0.getTestMethod();
	System.out.println(method.getMethodName()+ " is going to be invoked");
	System.out.println(method.getDescription());





	}
}
