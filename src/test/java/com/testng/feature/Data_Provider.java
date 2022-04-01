package com.testng.feature;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider = "Test_Data")
	private void Adactin_Runner(String name , int password) {
		
		System.out.println("Username for Adactin: "+name);
		
		System.out.println("Passwordfor Adactin : "+password);

	}
	
	@DataProvider
	private Object[][] Test_Data() {
		return new Object [] [] {
			{"Aravind",123},
			{"Anand",345},
			{"Sekar",567}
		};
		
	}
	
	@Test(dataProvider = "Test_Data")
	private void Automation_Runner(String name , int password) {
		
		System.out.println("Username for Automation: "+name);
		
		System.out.println("Passwordfor Automation : "+password);
		

	}

}
