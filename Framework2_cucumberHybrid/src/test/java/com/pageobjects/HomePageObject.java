package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObject {
	
	
	
	@FindBy (xpath="//a[text()='My Account']")
	public WebElement myAccount;

}
