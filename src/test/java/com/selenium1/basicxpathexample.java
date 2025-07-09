package com.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicxpathexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://demo.automationtesting.in/Register.html");
		
		WebElement element=drive.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		
		if(element.equals("First Name"));
		{
		   element.click();  
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        List<WebElement> allelement = drive.findElements(By.tagName("a"));
        System.out.println(allelement.size());
        for(WebElement ele : allelement)
        {
       System.out.println(((WebElement) allelement).getText());
       
	}

}
}
