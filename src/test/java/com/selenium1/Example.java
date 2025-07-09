package com.selenium1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	
	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		String urli = driver.getCurrentUrl();
		System.out.println(urli);
		
		//String pagecode=driver.getPageSource();
		//System.out.println(pagecode);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
	}

}
