package com.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicHandlingAllLink {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");   
      
		List<WebElement> alllinks =  driver.findElements(By.tagName("a"));
		for(WebElement e : alllinks)
		{
		 String value = e.getText();
		// System.out.println(value);
		 
		 if(value.equals("Home"))
		 {
			 e.click();
		 }
		}
		
		
		
	}

}
