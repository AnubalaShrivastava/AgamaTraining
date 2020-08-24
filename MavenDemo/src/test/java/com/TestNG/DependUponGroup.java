package com.TestNG;

import org.testng.annotations.Test;

public class DependUponGroup {
	@Test(groups= {"smoke","Regression testing"})
	public void testCase1() {
	System.out.println("Test Case 1");
	}
	@Test(groups= {"smoke","Sanity"})
	public void testCase2() {
	System.out.println("Test Case 2");
	}
	@Test(groups= {"Functional Testing","Retesting"})
	public void testCase3() {
	System.out.println("Test Case 3");
	}
}
