package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElemEx2 {
                                                                                  //label sathi method//
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement element1 = driver.findElement(By.xpath("//label[text()='Email address*']"));
		//System.out.println(element1.isDisplayed());
		System.out.println(element1.getSize());
		
		
		String elementtext=element1.getText();
		System.out.println(elementtext);
		if(elementtext.equals("Email address*"))
		{
			System.out.println("test case pass");
		}
		else
		{
         System.out.println("test case fail");
		}
        
         
         
         Thread.sleep(2000);
         driver.close();
	}

}
