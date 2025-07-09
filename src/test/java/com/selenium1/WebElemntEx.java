package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemntEx {

	public static void main(String[] args) throws InterruptedException {             //text chya method//
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement element1 = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		element1.sendKeys("ashwini");
		
		WebElement element2 = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		element2.sendKeys("pudale");
		Thread.sleep(1000);
		element1.clear();
		element2.clear();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
