package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount {
	
	@FindBy(xpath="//input[@id=\"username\"]")
	public WebElement loginUsername;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	public WebElement loginPassword;
	
	@FindBy(xpath="//input[@name=\"login\"]")
	public WebElement loginButton;
	
	@FindBy(xpath="//input[@id=\"reg_email\"]")
	public WebElement registerUsername;
	
	@FindBy(xpath="//input[@id=\"reg_password\"]")
	public WebElement registerPassword;
	
	@FindBy(xpath="//input[@name=\"register\"]")
	public WebElement registerButton;
	
	@FindBy(xpath="//strong[text()='Error:']")
	public WebElement errorMessage;

}
