package com.hybrid.pageObjmodel2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MainPage2 {
	WebDriver driver;
	
	


	
	@Test
	public void login() {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenuim1\\chromedriver.exe");
	    driver =new ChromeDriver();	
	driver.get("https://www.facebook.com/");
	PageMode2 pg1= new PageMode2(driver);

	
	pg1.setUsername("ravi");
	pg1.setPassword("ravi123");
	pg1.click();
	
	}
	
}
