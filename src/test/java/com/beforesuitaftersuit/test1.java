package com.beforesuitaftersuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test1 {
	
	WebDriver driver = null;
	
	@BeforeSuite
	public void m1()
	{
		driver = new ChromeDriver();
	    driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().window().maximize();
		System.out.println("before suit opend gmail page");
	}

	@Test
	public void m2()
	{
		System.out.println("successfull");
	}
	
	@Test
	public void m3() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
}


