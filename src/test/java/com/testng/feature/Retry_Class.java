package com.testng.feature;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer {
	
	int start = 1;
	
	int end = 3;
	
	//override method
	public boolean retry(ITestResult result) {
		
		if (start <= end) {
			
			start++;
			
			return true;  // execute
			
		}
		
		return false;  // stop the execution
	}

}
