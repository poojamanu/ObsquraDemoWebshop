package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.utilities.PageUtility;

public class RegisterPage {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	private final String _genderMale = "gender-male";
	@FindBy(id=_genderMale)
	private WebElement genderMale;
	
	private final String _firstName = "FirstName";
	@FindBy(id=_firstName)
	private WebElement firstName;
	
	private final String _lastName = "LastName";
	@FindBy(id=_lastName)
	private WebElement LastName;
	
	private final String _email = "Email";
	@FindBy(id=_email)
	private WebElement Email;
	
	private final String _password = "Password";
	@FindBy(id=_password)
	private WebElement password;
	
	private final String _confirmPassword = "ConfirmPassword";
	@FindBy(id=_confirmPassword)
	private WebElement confirmPassword;
	
	private final String _register = "register-button";
	@FindBy(id=_register)
	private WebElement registerButton;
	
	public String getRegisterPageTitle() {
		return PageUtility.getPageTitle(driver);
	}
	
	public void selectCheckbox() {
		PageUtility.clickOnElement(genderMale);
	}
	
	public void  enterFirstName(String fName) {
		PageUtility.enterText(firstName, fName);
	}
	
	public void  enterLastName(String lName) {
		PageUtility.enterText(LastName, lName);
	}
	
	public void  enterEmail(String r_email) {
		PageUtility.enterText(Email, r_email);
	}
	
	public void enterPassword(String r_password) {
		PageUtility.enterText(password, r_password);
	}
	
	public void enterConfirmPassword(String r_confirmpassword) {
		PageUtility.enterText(confirmPassword, r_confirmpassword);
	}
	
	public UserAccountPage clickOnRegisterButton() {
		PageUtility.clickOnElement(registerButton);
		return new UserAccountPage(driver);
	}

}
