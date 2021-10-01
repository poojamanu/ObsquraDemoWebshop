package com.demowebshop.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demowebshop.automationcore.Base;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.LoginPage;
import com.demowebshop.pages.UserAccountPage;
import com.demowebshop.utilities.ExcelUtility;

public class LoginTest extends Base {
	LoginPage login;
	HomePage home;
	UserAccountPage userAccount;
	
	@Test(priority = 1, enabled = true)
	public void verifyLoginPageTitle() {
		home = new HomePage(driver);
		login = home.clickOnLoginMenu();
		String actualTitle = login.getLoginPageTitle();
		String expectedTitle = "Demo Web Shop. Login";
		Assert.assertEquals(actualTitle, expectedTitle, "invalid title");
	}

	
	  @Test(priority = 2, enabled = true)
	  public void verifyValidUserLogin() throws IOException {
			home=new HomePage(driver);
			login=home.clickOnLoginMenu();
			login.enterUsername(ExcelUtility.getString(1, 0));
			login.enterPassword(ExcelUtility.getString(1, 1));
			userAccount=login.clickOnLoginButton();
			String actualUsername=userAccount.getUsername();
			String expectedUsername="pooja.ranjan@gmail.com";
		}
	 

}
