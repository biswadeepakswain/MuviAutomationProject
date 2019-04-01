package com.qa.muvi.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.muvi.base.TestBase;
import com.qa.muvi.pages.AddContentPage;
import com.qa.muvi.pages.ContentLibraryPage;
import com.qa.muvi.pages.HomePage;
import com.qa.muvi.pages.LoginPage;
import com.qa.muvi.pages.ManageContentPage;
import com.qa.muvi.pages.PlayVideoAndTrailer;

public class ContentLibraryPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	ManageContentPage managecontentpage;
	ContentLibraryPage contentlibrarypage;
	AddContentPage addcontentpage;
	PlayVideoAndTrailer playvideoandtrailer;
	
	public ContentLibraryPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException{
		Initialization();
		loginpage = new LoginPage();
		managecontentpage = new ManageContentPage();
		contentlibrarypage = new ContentLibraryPage();
		addcontentpage = new AddContentPage();
		playvideoandtrailer = new PlayVideoAndTrailer();
		loginpage.clickOnloginLink();
		homepage = loginpage.login(prop.getProperty("email"), prop.getProperty("pwd"));
	}
	
	@Test(priority=1)
	public void addContent() throws InterruptedException{
		
		managecontentpage.mousehoverOnManagecontent();
		managecontentpage.clickOnContentLibraryLink();
		contentlibrarypage.ClickOnAddContentButton();
		addcontentpage.addContent("DemoContent");
		
	}
	
	@Test(priority=2)
	public void verifyUploadVideoFileName() throws IOException, InterruptedException{
		
		String expText = "File Name";
		managecontentpage.mousehoverOnManagecontent();
		managecontentpage.clickOnContentLibraryLink();
		
		contentlibrarypage.uploadVideoBox();
		contentlibrarypage.ClickOnAddContentButton();
		
		Assert.assertTrue(playvideoandtrailer.toverifyUploadVideo());
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
		
	}

}
