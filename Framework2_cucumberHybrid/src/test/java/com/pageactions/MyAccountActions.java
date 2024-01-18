package com.pageactions;

import org.openqa.selenium.support.PageFactory;

import com.pageobjects.MyAccount;
import com.utilities.Helper;

public class MyAccountActions {
	
	MyAccount myAccountObj;
	
	public MyAccountActions(){
		this.myAccountObj=new MyAccount();
		PageFactory.initElements(Helper.getDriver(), myAccountObj);
		
	}
	
	
	//login actions
	public void enterLoginUsername(String username) {
		myAccountObj.loginUsername.sendKeys(username);
	}
	
	public void enterLoginPassword(String pass) {
		myAccountObj.loginPassword.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		myAccountObj.loginButton.click();
	}
	
	//Registern actions
	
	public void enterRegisterUsername(String username) {
		myAccountObj.registerUsername.sendKeys(username);
	}

	public void enterRegisterPassword(String pass) {
		myAccountObj.registerPassword.sendKeys(pass);
	}
	
	public void clickOnRegisterButton() {
		myAccountObj.registerButton.click();
	}
	
	public boolean checkErrorMessage() {
		boolean a=myAccountObj.errorMessage.isDisplayed();
		return a;
	}
}
