package com.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeAndAfterMethod {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BEFORE the method (@Test)");
	}

	@Test
	public void testMethodOne() {
		System.out.println("TESTMethodOne");
	}
	@Test
	public void testMethodTwo () {
		System.out.println("TESTMethodTwo");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AFTER the method (@Test)");
	}

}
