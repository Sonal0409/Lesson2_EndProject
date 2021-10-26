package com.qa.addressbook.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Base {
	
	public static WebDriver driver;
	
	public static ExtentReports extent;
	
	public static void initialization() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://18.224.63.213:49153/addressbook/");
		Thread.sleep(5000);
	}
	
	@BeforeSuite
	public void generateReport()
	{
	
	
	 extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
	
	spark.config().setDocumentTitle("Addressbooktesting");
	spark.config().setTheme(Theme.DARK);
	spark.config().setReportName("Lesson2ExtentReport Demo");
	extent.attachReporter(spark);
	}
	
	@AfterSuite
	public void endReport()
	{
		extent.flush();
	}


}
