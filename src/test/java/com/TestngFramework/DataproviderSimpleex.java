package com.TestngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderSimpleex {
	
	
	
     WebDriver driver=null;
	
	
	@BeforeTest
	public void openbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="data")
	public void login(String uname, String password) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(uname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		Thread.sleep(2000);

   }
	
	@DataProvider
	public Object[][]data()
	{
		Object[][]obj = new Object[3][2];
		
		obj[0][0] = "admin";
	    obj[0][1] = "admin1234";	
	    
	    obj[1][0] = "ashwini";
	    obj[1][1] = "admin1234";
	    
	    obj[2][0] = "ashu";
	    obj[2][1] = "admin123";
	    
		return obj;
		
	}
	
}
