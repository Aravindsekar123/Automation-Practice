package com.testng.feature;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asser_Concepts_1 {
	
	@Test
	private void username1() {
		
		String expected_Username = "Aravind";
		
		String actual_Username = "Anand";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual_Username, expected_Username);
		
		System.out.println("Username1");

}
	
}
