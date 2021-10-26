package com.qa.addressbook.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.addressbook.Base.Base;
import com.qa.addressbook.Pages.ContactPage;
import com.qa.addressbook.Pages.HomePage;

public class ContactpageTest extends Base{

	
HomePage hp;
ContactPage cp;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException
	{

       initialization();
		hp = new HomePage();
		cp= new ContactPage();
	}
	
	@Test
	public void clickContactTest()
	{
		cp.clickcontact();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}















