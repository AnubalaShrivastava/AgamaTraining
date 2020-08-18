package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(description="Login OrangeHRM")
	public void login() {
		System.out.println("Test Case login");
	}
	@Test(dependsOnMethods="login")
	public void search() {
	System.out.println("Test Case search");
	Assert.assertEquals("xyz", "abc");
	
	}
	@Test(dependsOnMethods="search")
	public void logout() {
	System.out.println("Test Case logout");
	}	
}
