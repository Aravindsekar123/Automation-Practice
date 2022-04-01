package com.testng.feature;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concepts {
	
	@Test
	private void username1() {
		
		String expected_Username = "Aravind";
		
		String actual_Username = "Anand";
		
		Assert.assertEquals(actual_Username, expected_Username);
		
		System.out.println("Username1");

	}
	
	@Test
	private void username2() {
		
		String expected_Username = "Sekar";
		
		String actual_Username = "Dhanam";
		
		Assert.assertNotEquals(actual_Username, expected_Username);
		
		System.out.println("Username2");

	}
	

	@Test
	private void username3() {
		
		String expected_Username = "Sekar";
		
		String actual_Username = "Sekar";
		
		Assert.assertSame(actual_Username, expected_Username);
		
		System.out.println("Username3");

	}
	
	@Test
	private void username4() {
		
		String username = null;
		
		Assert.assertNull(username);
		
		System.out.println("Username4");

	}
	
	@Test
	private void username5() {
		
		String username = "Aravind";
		
		Assert.assertNotNull(username);
		
		System.out.println("Username5");

	}
	
	@Test
	private void username6() {
		
		Boolean username = true;
		
		Assert.assertTrue(username);
		
		System.out.println("Username6");

	}
	
	@Test
	private void username7() {
		
		Boolean username = false;
		
		Assert.assertFalse(username);
		
		System.out.println("Username7");

	}

}
