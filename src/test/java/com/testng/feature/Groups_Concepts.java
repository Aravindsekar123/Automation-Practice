package com.testng.feature;

import org.testng.annotations.Test;

public class Groups_Concepts {
	
	@Test(groups="Books")
	private void books() {
		System.out.println("Books");
	}
	
	@Test(priority = 0,groups="Social Media")
	private void whatsapp() {
		System.out.println("Whatsapp");
	}
	@Test(priority = 1,groups="Social Media")
	private void instagram() {
		System.out.println("Instagram");
	}
	@Test(priority = 2,groups="Music")
	private void wynkMusic() {
		System.out.println("WynkMusic");
	}
	@Test(priority = 3,groups="Music")
	private void spotify() {
		System.out.println("Spotify");
	}

}
