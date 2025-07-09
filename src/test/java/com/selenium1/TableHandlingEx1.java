package com.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandlingEx1 extends Basic {

	public static void main(String[] args) throws InterruptedException
	{
		
		driver = openbrowser("https://demo.automationtesting.in/WebTable.html");
		List<WebElement> allheading = (List<WebElement>) driver.findElement(By.xpath("//div[@class=\"ui-grid-header-canvas\"]"));
		for(WebElement e : allheading)
		{
			String text = e.getText();
			System.out.println(text);
		}
		 
		driver.findElement(By.xpath("//span[text()=\"Email\"]"));
		
		
		
		
       Basic.close();
	}

}
