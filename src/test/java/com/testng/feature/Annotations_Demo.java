package com.testng.feature;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo {
	
	@BeforeTest
	private void browser_Launch() {
		System.out.println("Browser Launch");
	}
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("Set Property");
	}
	
	@BeforeClass
	private void getUrl() {
		System.out.println("Url");
	}
	
	@Test
	private void women() {
		System.out.println("Women");
	}
	
	@BeforeMethod
	private void sigin() {
		System.out.println("Sign in");
	}
	
	@AfterMethod
	private void signout() {
		System.out.println("signout");
	}
	
	@Test
	private void children() {
		System.out.println("Children");
	}
	
	@AfterClass
	private void verify_Homepage() {
		System.out.println("Assert");
	}
	
	@AfterTest
	private void close() {
		System.out.println("Close");
	}
	
	@AfterSuite
	private void deleteAllCookies() {
		System.out.println("Delete All Cookies");
	}

}
