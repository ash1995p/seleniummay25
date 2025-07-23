package com.TestngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethod {
	
		WebDriver driver= new ChromeDriver();
		
		@BeforeMethod
		public void browser()
		{
			driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
		}
		
		@Test(priority=0)
		public void male()
		{
			WebElement radiobtn1 =driver.findElement(By.xpath("//input[@value=\"Male\"]"));
			boolean result = radiobtn1.isEnabled();
			if(result == true)
			{
			    radiobtn1.click();
		    }
		}
		
		@Test(priority=1)
		public void female()
		{
			driver.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
		}
		
		@AfterClass
		public void close() throws InterruptedException
		{
			Thread.sleep(6000);
			driver.close();
		}
		
		@AfterMethod
		public void time() throws InterruptedException
		{
			Thread.sleep(2000);
		}
		
		
		
		
		
		
		
		

}
