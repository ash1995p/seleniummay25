package com.TestngFrameworkBeforeTestAfterTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium1.webelementexam;

public class test3 {
   
	public static WebDriver driver=null;
	
	@BeforeTest
	public void Ac()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		System.out.println("BeforeSuit amazon open");
	}
	
	@Test
	public void c1()
	{
		System.out.println("admin");
	}
	
	@Test
	public void c2()
	{
		System.out.println("admin123");
	}
	
	@AfterClass
	public void close() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.close();
	}

}
