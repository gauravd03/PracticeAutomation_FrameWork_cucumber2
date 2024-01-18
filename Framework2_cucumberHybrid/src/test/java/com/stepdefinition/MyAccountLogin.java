package com.stepdefinition;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pageactions.HomePageActions;
import com.pageactions.MyAccountActions;
import com.utilities.Helper;
import com.utilities.ReadExcelData;
import com.utilities.ReadPropertiesfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class MyAccountLogin {
	
	HomePageActions hpobj1=new HomePageActions();
	MyAccountActions myobj1=new MyAccountActions();
	ReadPropertiesfile prop=new ReadPropertiesfile();
	public static Logger log=LogManager.getLogger(MyAccountLogin.class);

	
	
	private static List<String> validUsernames;
    private static List<String> invalidPasswords;

    
	@Given("user should be on {string}")
	public void user_should_be_on(String string) {
	    Helper.openPage(string);
	}

	@When("user click on my account")
	public void user_click_on_my_account() {
	    hpobj1.clickOnMyAccount();
	}

	@When("^user enter valid username (.*)$")
	public void user_enter_valid_gauragh_gmail_com(String username) {
		myobj1.enterLoginUsername(username);
	}

	@When("^user enter valid password (.*)$")
	public void user_enter_valid_gaurav(String pass) {
		myobj1.enterLoginPassword(pass);
	    
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		myobj1.clickOnLogin();
	    
	}

	@Then("user should successfully get logged in")
	public void user_should_successfully_get_logged_in() {
		
	    
	}
	
	
	@When("user enter invalid username")
	public void user_enter_invalid_username() throws InterruptedException {
	    myobj1.enterLoginUsername(prop.getInvalidUsername());
	    
	}

	@When("user enter invalid password")
	public void user_enter_invalid_password() {
		myobj1.enterLoginPassword(prop.invalidPass());
	    
	}

	@Then("user should successfully get error message")
	public void user_should_successfully_get_error_message() {
	    
	}
	
	
	//Steps for valid username and invalid username
	
	@When("user enters valid username")
	public void user_enters_valid_username() {
		/*List<String> validUsernames = ReadExcelData.readExcelData("src\\test\\java\\com\\testdata\\Framework2_CucumberHybrid_TestData.xls", "Sheet1", 1);

        for (String username : validUsernames) {
            myobj1.enterLoginUsername(username);
            // Additional steps if needed
        }
        */
        
        
        if (validUsernames == null) {
            validUsernames = ReadExcelData.readExcelData("src\\test\\java\\com\\testdata\\Framework2_CucumberHybrid_TestData.xls", "Sheet1", 0);
        }

        // Use only the first valid username in the list
        String validUsername = validUsernames.get(1);
        myobj1.enterLoginUsername(validUsername);
        // Additional steps if needed
	   
	}

	@When("user enters invalid password")
	public void user_enters_invalid_password() {
		if (invalidPasswords == null) {
			invalidPasswords = ReadExcelData.readExcelData("src\\test\\java\\com\\testdata\\Framework2_CucumberHybrid_TestData.xls", "Sheet1", 1);
        }

        // Use only the first valid username in the list
        String invalidPass = invalidPasswords.get(1);
        myobj1.enterLoginPassword(invalidPass);
        // Additional steps if needed
		
		
	}
	   
	

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		myobj1.clickOnLogin();
	   
	}

	@Then("user should receive an error message")
	public void user_should_receive_an_error_message() {
		
		if(myobj1.checkErrorMessage()) {
			
			
			Assert.assertTrue(true);
			log.info("User successfully got error message");
			
		}else {
			Assert.assertFalse(false);
			log.info("not got error message, test failed");

		}
	
	
	    
	}






}