package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.utilities.PageUtility;
import com.demowebshop.utilities.WaitUtility;
import com.demowebshop.utilities.WaitUtility.LocatorType;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	private final String _email = "Email";
	@FindBy(id=_email)
	private WebElement username;
	
	private final String _password="Password";
	@FindBy(id=_password)
	private WebElement password;
	
	private final String _loginButton="//input[@class=\"button-1 login-button\"]";
	@FindBy(xpath=_loginButton)
	private WebElement loginButton;

	public String getLoginPageTitle() {
		return PageUtility.getPageTitle(driver);
	}
	 public void enterUsername(String uName) {
		 WaitUtility.waitForElement(driver, _email, LocatorType.Id);
		 PageUtility.enterText(username, uName);
	 }
	 
	 public void enterPassword(String uPassword) {
		 PageUtility.enterText(password, uPassword);
	 }
	 
	 public UserAccountPage clickOnLoginButton() {
		 PageUtility.clickOnElement(loginButton);
		 return new UserAccountPage(driver);
	 }
	 
}
