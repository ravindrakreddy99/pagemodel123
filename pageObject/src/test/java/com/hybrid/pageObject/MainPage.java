package com.hybrid.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainPage {
	
	
	WebDriver driver;
	
	@Test
	public void login() {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenuim1\\chromedriver.exe");
	    driver =new ChromeDriver();	
	PageObjectModel pg =new PageObjectModel(driver);
	
	driver.get("https://www.facebook.com/");
	
	pg.setUsername("ravi");
	pg.setPassword("ravi123");
	pg.click();
	
	}
	
	

}
