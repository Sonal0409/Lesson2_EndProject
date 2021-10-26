package com.qa.addressbook.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.addressbook.Base.Base;

public class CreateAddress extends Base {
	
	@FindBy(xpath="//*[@id=\"addressbook-1376863011\"]/div/div[2]/div/div[1]/div/div/div[1]/div/div/div[1]/input")
     WebElement search;
	
	@FindBy(xpath="//*[@id=\"addressbook-1376863011\"]/div/div[2]/div/div/div/div/div[1]/div/div/div[2]/div")
	WebElement contact;
	
	@FindBy(xpath="//*[@id=\"gwt-uid-5\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"gwt-uid-7\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"gwt-uid-9\"]")
	WebElement phone;

	@FindBy(xpath="//*[@id=\"gwt-uid-11\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"gwt-uid-13\"]")
	WebElement date;
	
	@FindBy(xpath="//*[@id=\"addressbook-1376863011\"]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div")
	WebElement save;
	
	public CreateAddress()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createAddress() throws InterruptedException
	{
	
		contact.click();
		Thread.sleep(2000);
		firstname.clear();
		firstname.sendKeys("admin");
		lastname.clear();
		lastname.sendKeys("employee");
		phone.clear();
		phone.sendKeys("35345436546");
		email.clear();
		email.sendKeys("admin@gmail.com");
		date.clear();
		date.sendKeys("2/15/93,");
		
		Thread.sleep(2000);
		
		save.click();
    	search.sendKeys("admin");
		
		
	}








}
