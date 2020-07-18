package com.hybrid.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {
	
	WebDriver driver;
	
	@FindBy(name="email")
	
	  WebElement email;
	
	
	@FindBy(name="pass")
	
	  WebElement pass;
	
	@FindBy(id="loginbutton")
	
	  WebElement click;
	
	PageObjectModel(WebDriver d1){
		
		driver=d1;
		PageFactory.initElements(d1,this);
	}
	
	
	
	
	
	public void setUsername(String uname) {
		
		email.sendKeys(uname);
		
		
	}
	
	
	public void setPassword(String password) {
		
		
		pass.sendKeys(password);
		
		
	}
	
	
	public void click() {
		
		click.click();
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		

