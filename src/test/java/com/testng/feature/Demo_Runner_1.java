package com.testng.feature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Runner_1 {
	
	@Test(priority = -1)
	private void username1() {
		
		String expected_Username = "Aravind";
		
		String actual_Username = "Aravind";
		
		Assert.assertEquals(actual_Username, expected_Username);

	}
	
	@Test
	private void password() {
		
		String expected_Password = "Aravind";
		
		String actual_Password = "Aravind@123";
		
		Assert.assertEquals(actual_Password, expected_Password);

	}

}
