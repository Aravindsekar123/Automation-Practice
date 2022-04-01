package com.testng.feature;

import org.testng.annotations.Test;

public class Multi_Threading {
	
	@Test
	private void username() {
		System.out.println("UserName");
	}
	@Test
	private void password() {
		System.out.println("Password");
	}

}
