package com.qa.muvi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.muvi.base.TestBase;

public class AddContentPage extends TestBase {
	
	public  static String content_Name;
	
	@FindBy(xpath="//select[@id='parent_content_type']")
	WebElement contentDropdown;
	
	@FindBy(name="movie[name]")
	WebElement contentnameText;
	
	@FindBy(id="permalink")
	WebElement permalinkLink;
	
	@FindBy(xpath="//select[@id='content_category_value']")
	WebElement contentcategoryDropdown;
	
	@FindBy(id="save-btn")
	WebElement saveandcontinueBtn;
	

	public AddContentPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void addContent(String contentName) throws InterruptedException{
		
		content_Name=contentName;
		
		
		Select sel = new Select(contentDropdown);
		sel.selectByVisibleText("VOD Single Part");
		
		Thread.sleep(5000);
		
		contentnameText.sendKeys(contentName);
		
		permalinkLink.click();
		
		Select sel1 = new Select(contentcategoryDropdown);
		sel1.selectByVisibleText("Movie");
		
		saveandcontinueBtn.click();
		
		Thread.sleep(300000);
		
	}

}
