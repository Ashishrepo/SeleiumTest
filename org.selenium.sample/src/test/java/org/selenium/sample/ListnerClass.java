package org.selenium.sample;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass extends Screenshot implements ITestListener

{
	 
	
	
	
	public void onTestFailure(ITestResult result) {
		
		try {
			Screenshot.TS(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
