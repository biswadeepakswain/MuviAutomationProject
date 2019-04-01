package com.qa.muvi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.*;
import com.qa.muvi.base.TestBase;

public class ManageContentPage extends TestBase{
	
	@FindBy(xpath="//div[@id='mCSB_1_container']/ul/li[2]/a")
	WebElement managecontentLink;
	
	@FindBy(xpath="//a[contains(text(),'Content Library')]")
	WebElement contentlibraryLink;
	
	public ManageContentPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void mousehoverOnManagecontent(){
		
		Actions act = new Actions(driver);
		act.moveToElement(managecontentLink).perform();
		
	}
	
	public ContentLibraryPage clickOnContentLibraryLink(){
			contentlibraryLink.click();
			
			return new ContentLibraryPage();
	}

}
