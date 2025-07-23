package com.TestngFrameworkBeforeTestAfterTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	
public static WebDriver driver=null;

	
	@BeforeTest
	public void dc()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println("BeforeSuit--- flipkart open");
	}
	
	@Test
	public void a1()
	{
		System.out.println("ash");
	}
	
	@Test
	public void a2()
	{
		System.out.println("ashwini");
	}
	
	@AfterClass
	public void close() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.close();
	}

}
