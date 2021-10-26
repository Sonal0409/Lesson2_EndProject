package com.qa.addressbook.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.addressbook.Base.Base;

public class HomePage extends Base {
	
	@FindBy(xpath="//*[@id=\"addressbook-1376863011\"]/div/div[2]/div/div/div/div/div[1]/div/div/div[1]/input")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"addressbook-1376863011\"]/div/div[2]/div/div/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[3]")
    WebElement email;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void titlePage()
	{
		System.out.println(driver.getTitle());
		
	}
	
	public String searchEmail()
	{
		search.sendKeys("Daniel");
		String text = email.getText();
		return text;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
