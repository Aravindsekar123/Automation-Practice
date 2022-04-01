package com.testng.feature;

import org.testng.annotations.Test;

public class Dependency_Test {
	
	@Test
	private void SSLC() {
		System.out.println("10th");
	}
	
	@Test(dependsOnMethods = "SSLC")
	private void HSC() {
		System.out.println("12th");
	}
	
	@Test(dependsOnMethods = "HSC")
	private void College() {
		System.out.println("Degree");
	}

}
