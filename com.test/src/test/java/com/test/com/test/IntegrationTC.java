package com.test.com.test;

import org.testng.annotations.Test;

import com.qa.pageObject.TestingAzureIntegration;

import baseclass.TestBase;

public class IntegrationTC extends TestBase {

	@Test
	public void login() {
		TestingAzureIntegration tc = new TestingAzureIntegration();
		tc.setUsername().sendKeys("SayaliV");
		tc.setPassword().sendKeys("abcd123");
		tc.signInBtn().click();
	}
}
