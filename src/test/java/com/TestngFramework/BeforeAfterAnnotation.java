package com.TestngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterAnnotation {

	WebDriver driver = new ChromeDriver(); 
	
	@BeforeClass
	public void openbrowser() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
	}
	
	@Test(priority=0)
	public void fullname() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("tanuja");
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void lastname() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Patil");
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void close() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.close();
	}

}
