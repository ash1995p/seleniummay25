package com.TestngFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selenium1.Basic;

public class testng1st extends Basic

{
	@Test(priority=1)
	public void username() throws InterruptedException 
	{
	    driver=openbrowser("https://opensource-demo.orangehrmlive.com/");
	    WebElement name =driver.findElement(By.xpath("//input[@name=\"username\"]"));
	    name.sendKeys("admin");
	}
	
	@Test(priority=2)
	public void password () throws InterruptedException 
	{
	    WebElement password =driver.findElement(By.xpath("//input[@name=\"password\"]"));
	    password.sendKeys("admin1234");
	    
	}
	
	@Test(priority=3)
	public void submit() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(6000);
		driver.close();
		
	}
	
}	


//    @Test(priority = 2)                              //simple//
//	public void m1()
//	{
//		
//		System.out.println("testng");
//		int i = 10/2;
//	}
//
//    @Test(priority =1)                 //priority//
//   	public void m2()
//   	{
//   		
//   		System.out.println("testng 2");
//   	}
//    
//    
//    @Test(priority=0,invocationCount=5)                 //InvocationCount = 3 (kiti vela tya method la call karaycha ahe te)same like for loop//
//   	public void m3()
//   	{
//   		
//   		System.out.println("testng 3");
//   	}
//    
//    
//    @Test(priority =1, groups="smoke")                 //priority//
//   	public void m4()
//   	{
//   		
//   		System.out.println("testng 2");
//   	}
    
    


