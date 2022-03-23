package com.myproject.mp.testng.listeners;

import org.testng.IExecutionListener;

public class MyTestNgExecutionListener implements IExecutionListener {
	
	@Override
	public void onExecutionStart() { 
	System.out.println("TestNG framework has been started its execution");
	} 
	 
	
	
	@Override
	public void onExecutionFinish() { 
		System.out.println("TestNG framework has been finished its execution"); 
	}

}
