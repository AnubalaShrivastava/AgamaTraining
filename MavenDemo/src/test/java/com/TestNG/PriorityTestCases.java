package com.TestNG;

import org.testng.annotations.Test;

public class PriorityTestCases {
	@Test(priority=3)
	public void testCase1() {
	System.out.println("Test Case 1");
	}
	@Test(priority=1)
	public void testCase2() {
	System.out.println("Test Case 2");
	}
	@Test(priority=2)
	public void testCase3() {
	System.out.println("Test Case 3");
	}	
}
