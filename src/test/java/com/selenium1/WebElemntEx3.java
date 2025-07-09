package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemntEx3 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
      WebElement element1= driver.findElement(By.xpath("//input[@value=\"Male\"]"));
      //System.out.println(element1.isEnabled());
      
      boolean result = element1.isSelected();
      if(result==false)
      {
    	  element1.click();
      }
      
        Thread.sleep(2000);
		driver.close();
	}

}
