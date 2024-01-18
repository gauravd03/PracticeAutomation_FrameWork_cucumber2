package com.stepdefinition;

import com.pageactions.HomePageActions;
import com.pageactions.MyAccountActions;
import com.utilities.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountRegister {
	
	HomePageActions hpobj=new HomePageActions();
	MyAccountActions myobj=new MyAccountActions();
	
	
	@Given("user should be on {string} web page")
	public void user_should_be_on_web_page(String string) {
		Helper.openPage(string);
	   
	}

	@When("user click on MyAccount tab")
	public void user_click_on_my_account_tab() {
		hpobj.clickOnMyAccount();
	}

	@When("user enter register email {string}")
	public void user_enter_register_email_gaurav_gmail_com(String uername) throws InterruptedException {
	   myobj.enterRegisterUsername(uername);
	   Thread.sleep(5000);
	}

	@When("user enter password  {string}")
	public void user_enter_password_gaurav(String pass) {
		myobj.enterRegisterPassword(pass);
	    
	}

	@When("user click on register")
	public void user_click_on_register() {
		myobj.clickOnRegisterButton();
	}

	@Then("user should successfully get registered")
	public void user_should_successfully_get_registered() {
		
	}


}
