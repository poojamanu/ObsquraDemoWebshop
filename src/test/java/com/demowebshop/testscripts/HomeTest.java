package com.demowebshop.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demowebshop.automationcore.Base;
import com.demowebshop.pages.HomePage;

public class HomeTest extends Base {
	HomePage home;
	@Test(priority=1,enabled=true)
	public void verifyHomePageTitle() {
		home=new HomePage(driver);
		String actualTitle=home.getHomePageTitle();
		String expectedTitle="Demo Web Shop";
		Assert.assertEquals(actualTitle, expectedTitle,"Invalid Home Page title");
	}
}
