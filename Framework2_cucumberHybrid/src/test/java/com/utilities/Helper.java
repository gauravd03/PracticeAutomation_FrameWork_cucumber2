package com.utilities;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	
	public static Helper objHelper;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static final int TIMEOUT=10;

	
	
	public Helper(){
	driver=new ChromeDriver();
	wait=new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	driver.manage().window().maximize();
	}
	
	public static void openPage(String url) {
		driver.get(url);
		//to close adds which come at starting when url launch
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		
	}
	
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	//setup method which creaqte this clas object and invoke all
	public static void setDriver() {
		
		if(objHelper==null) {
			objHelper=new Helper();
				
		}
	}
	
	
	public static void tearDown() {
		if(driver!=null) {
			//driver.close();
			//driver.quit();
		}
		objHelper=null;
	}
	

	
}
