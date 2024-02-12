package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObject {
	
	
	//page object
	@FindBy (xpath="//a[text()='My Account']")
	public WebElement myAccount;

}
