package com.pageactions;

import org.openqa.selenium.support.PageFactory;

import com.pageobjects.HomePageObject;
import com.utilities.Helper;

public class HomePageActions {
	HomePageObject obj=null;
	public HomePageActions(){
		this.obj=new HomePageObject();
		PageFactory.initElements(Helper.getDriver(), obj);
	}
	
	//click on my account
	public void clickOnMyAccount() {
		obj.myAccount.click();
	}

}
