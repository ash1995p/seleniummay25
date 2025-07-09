package com.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicHandlingSkillsPart{

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
	List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	for(WebElement e: allcheckbox)
	{
		String value = e.getAttribute("value");
		System.out.println("value is :" +value);
		
		if(value.equals("Hockey"))
		{
			boolean b = e.isSelected();
			if(b==false)
			{
				e.click();
			}
			
		}
	  }
	
	}
}

