package com.beforesuitaftersuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class test3 {
	
	WebDriver driver = null;

	@Test
	public void m2()
	{
		System.out.println("images");
	}
	
	@AfterSuite
	public void m3()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("opend flipkart");
	}
}
