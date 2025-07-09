package com.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	    public static WebDriver driver =null;
	
	
	public static WebDriver openbrowser (String url) throws InterruptedException {
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(url);
		 Thread.sleep(2000);
		 return driver;

	}
	
	public static void close() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.close();
	}

}
