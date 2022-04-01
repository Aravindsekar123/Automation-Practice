package com.testng.feature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Runner {
	
	@Test(retryAnalyzer = Retry_Class.class)
	private void username1() {
		
		String expected_Username = "Aravind";
		
		String actual_Username = "Anand";
		
		Assert.assertEquals(actual_Username, expected_Username);

	}
	
	@Test(retryAnalyzer = Retry_Class.class)
	private void password() {
		
		String expected_Password = "Aravind@123";
		
		String actual_Password = "Anand@123";
		
		Assert.assertEquals(actual_Password, expected_Password);

	}

}
