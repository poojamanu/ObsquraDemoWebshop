package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.utilities.PageUtility;

public class UserAccountPage {
	WebDriver driver;
	public UserAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	private final String _userid="//div[@class=\"header-links\"]//a[@class=\"account\"]";
	@FindBy(xpath=_userid)
	private WebElement userid;
	
	public String getUsername() {
		return PageUtility.getElementText(userid);
	}

}
