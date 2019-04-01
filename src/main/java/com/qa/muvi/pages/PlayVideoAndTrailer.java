package com.qa.muvi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.muvi.base.TestBase;

public class PlayVideoAndTrailer extends TestBase{
	
	@FindBy(xpath="//a[@class='playbtn btn btn-primary btn-lg']")
	WebElement playvideoBtn;
	
	
	public PlayVideoAndTrailer(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean toverifyUploadVideo(){
		boolean playbtn = playvideoBtn.isDisplayed();
		return playbtn;
	}

}
