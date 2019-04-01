package com.qa.muvi.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.muvi.base.TestBase;

public class ContentLibraryPage extends TestBase {
	
	
	
	@FindBy(xpath="//button[contains(text(),'Add Content')]")
	WebElement addcontentBtn;
	
	@FindBy(xpath="//a[contains(text(),'Upload video')]")
	WebElement uploadvideoLink;
	
	@FindBy(xpath="//input[@value='Browse File']")
	WebElement browseBtn;
	
	@FindBy(xpath="//button[@class='confirm']")
	WebElement uploadBtn;
	
	@FindBy(xpath="//div[contains(text(),'DemoContent')]")
	WebElement fileNametext;
	

	
	public ContentLibraryPage(){
		PageFactory.initElements(driver, this);
	}
	
	public AddContentPage ClickOnAddContentButton(){
		addcontentBtn.click();
		
		return new AddContentPage();
		
	}
	
	public void uploadVideoBox() throws IOException, InterruptedException{
		uploadvideoLink.click();
		
		browseBtn.click();
		
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\CHINKU\\Desktop\\Autoit\\FileUpload.exe");
		
		
		Thread.sleep(2000);
		
		uploadBtn.click();
		
		Thread.sleep(200000);
		
	}
	
	public PlayVideoAndTrailer toclickOnContentFile(){
		
		
		fileNametext.click();
		return new PlayVideoAndTrailer();
		
	}
	

}
