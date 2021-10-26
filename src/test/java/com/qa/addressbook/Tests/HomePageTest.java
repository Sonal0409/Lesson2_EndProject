package com.qa.addressbook.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.qa.addressbook.Base.Base;
import com.qa.addressbook.Pages.HomePage;

public class HomePageTest extends Base {
	
	HomePage hp;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{

       initialization();
		hp = new HomePage();
	}

	@Test(priority='1')
	public void Printtitle()
	{
		ExtentTest test=extent.createTest("HoemPagePage").assignAuthor("Sonal")
				.assignCategory("lesson2")
				.assignDevice("Chrome94");
		
	hp.titlePage();
	test.info("tile of the page is correct");
	}
	
	@Test(priority='2')
	public void searchemailtest() throws InterruptedException
	{
		ExtentTest test2=extent.createTest("HomePagePage").assignAuthor("Sonal")
				.assignCategory("lesson2")
				.assignDevice("Chrome94");
		
		System.out.println(hp.searchEmail());
		test2.pass("email id copied");
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
