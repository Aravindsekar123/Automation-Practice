package com.testng.feature;

import org.testng.annotations.Test;

public class Priority_Concept {
	@Test(priority = 0)
	private void userName() {
		System.out.println("UserName");
	}
	@Test(priority = 1)
	private void password() {
		System.out.println("Password");
	}
	@Test(priority = 2)
	private void login() {
		System.out.println("Login");
	}

}
