package com.qa.addressbook.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.addressbook.Base.Base;

public class ContactPage extends Base{
	
	@FindBy(xpath="//*[@id=\"addressbook-1376863011\"]/div/div[2]/div/div/div/div/div[1]/div/div/div[2]/div")
     WebElement contact;
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickcontact()
	{
		contact.click();
	}
}
