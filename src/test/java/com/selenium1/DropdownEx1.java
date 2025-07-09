package com.selenium1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;                         //select tag aslyavar select cha object create karava lagto//
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownEx1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement dropdownelement = driver.findElement(By.xpath("//Select[@id=\"Skills\"]"));
		 
		Select s = new Select(dropdownelement);
		boolean b = s.isMultiple();
		System.out.println("ismultiple : "+b);
		
		   s.selectByIndex(2);
		   Thread.sleep(1000);
		   s.selectByValue("Email");
		   
		   Thread.sleep(1000);
		   s.selectByVisibleText("Documentation");
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
