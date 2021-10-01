package com.demowebshop.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demowebshop.automationcore.Base;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.RegisterPage;
import com.demowebshop.pages.UserAccountPage;

public class RegisterTest extends Base{
	RegisterPage register;
	HomePage home;
	UserAccountPage userAccount;
	
	@Test(enabled=true,priority=1)
	public void verifyRegisterPageTitle() {
		home=new HomePage(driver);
		register=home.clickOnRegisterMenu();
		String actualTitle=register.getRegisterPageTitle();
		String expectedTitle="Demo Web Shop. Register";
		Assert.assertEquals(actualTitle, expectedTitle,"Invalid title");
	}
	
	@Test(enabled=true,priority=2)
	public void verifyValidRegistration() {
		home=new HomePage(driver);
		register=home.clickOnRegisterMenu();
		register.selectCheckbox();
		register.enterFirstName("Arun");
		register.enterLastName("vijay");
		register.enterEmail("arun.vijay2@gmail.com");
		register.enterPassword("password");
		register.enterConfirmPassword("password");
		userAccount=register.clickOnRegisterButton();
		String actualUsername=userAccount.getUsername();
		String expectedUsername="arun.vijay2@gmail.com";
		Assert.assertEquals(actualUsername, expectedUsername);
	}

}
