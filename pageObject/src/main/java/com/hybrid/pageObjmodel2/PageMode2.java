package com.hybrid.pageObjmodel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageMode2 {
	
	
	
	WebDriver driver;
	
	
	By email=By.name("email");
	By pass = By.name("pass");
	By click = By.id("loginbutton");
	
	
	PageMode2 (WebDriver d2){
		
		driver=d2;
		
	}
	
	
	public void setUsername(String uname) {
		
		driver.findElement(email).sendKeys(uname);
		
		
		
		
	}
public void setPassword(String pass1) {
		
		driver.findElement(pass).sendKeys(pass1);
		
	}
	
public void click() {
	
	driver.findElement(click).click();
	
	
	
	
}





















	
	

}
