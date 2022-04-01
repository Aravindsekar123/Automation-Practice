package com.testng.feature;

import org.testng.annotations.Test;

public class Timeout_Test {
	
	@Test(timeOut = 8000)
	private void browser_Execution() throws Throwable {
		
		Thread.sleep(2000);

		System.out.println("Browser Launch");
		
		Thread.sleep(1000);
		
		System.out.println("URL Launch");
		
		Thread.sleep(2000);
		
		System.out.println("Credentials Entered");
		
		Thread.sleep(1000);
		
		System.out.println("Next Page");
		
	}

}
