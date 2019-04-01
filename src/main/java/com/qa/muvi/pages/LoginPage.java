package com.qa.muvi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.muvi.*;
import com.qa.muvi.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id="clk")
	WebElement loginLink;
	
	@FindBy(id="LoginForm_email")
	WebElement emailAdress;
	
	@FindBy(id="LoginForm_password")
	WebElement password;
	
	@FindBy(id="btn-login")
	WebElement loginBtn;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnloginLink(){
		loginLink.click();
	}
	
	
	public HomePage login(String email, String pwd) throws InterruptedException{
		emailAdress.sendKeys(email);
		password.sendKeys(pwd);
		loginBtn.click();
		Thread.sleep(5000);
		
		return new HomePage();
	}
	
	

}
