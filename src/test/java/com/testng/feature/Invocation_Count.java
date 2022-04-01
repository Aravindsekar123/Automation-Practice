package com.testng.feature;

import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(priority = 0)
	private void browser_Launch() {
		System.out.println("Browser Launch");
	}
	@Test(priority = 1)
	private void launch_Url() {
		System.out.println("URL Launch");
	}
	@Test(priority = 2, invocationCount = 3)
	private void refresh() {
		System.out.println("Page Refresh");
	}
	@Test(priority = 3)
	private void credentials() {
		System.out.println("Credentials");
	}

}
