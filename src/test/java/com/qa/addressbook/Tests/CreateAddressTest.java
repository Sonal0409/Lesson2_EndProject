package com.qa.addressbook.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.qa.addressbook.Base.Base;
import com.qa.addressbook.Pages.CreateAddress;


public class CreateAddressTest extends Base {
	
	CreateAddress ca;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{

       initialization();
       ca = new CreateAddress();
		
	}
	
	
	@Test
	public void creaetAddressTest() throws InterruptedException
	{
		ExtentTest test=extent.createTest("CreateAddressPage").assignAuthor("Sonal")
				.assignCategory("lesson2")
				.assignDevice("Chrome94");
		
		
		ca.createAddress();
		test.pass("Address created successfully");
	}

	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

	
}
