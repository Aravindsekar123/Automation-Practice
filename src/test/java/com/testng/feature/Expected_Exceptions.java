package com.testng.feature;

import org.testng.annotations.Test;

public class Expected_Exceptions {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void calculator1() {
		int a =10;
		System.out.println(a/0);
		System.out.println("Display the output");
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	private void calculator2() {
		int a =10;
		System.out.println(a/0);
		System.out.println("Display the output");
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void calculator3() {
		int a =10;
		System.out.println(a/2);
		System.out.println("Display the output");
	}

}
