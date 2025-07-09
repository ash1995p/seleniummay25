package com.selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementexam {

	public static void main(String[] args) 
	{
		
		WebDriver drive = new ChromeDriver();
		drive.get("");
		
		drive.findElement(By.id(""));
		
		WebElement homelink =drive.findElement(By.linkText(""));
		homelink.click();
		
		List<WebElement> alllinkele = drive.findElements(By.tagName(""));
		System.out.print(alllinkele);
		for(WebElement allele:alllinkele)
		{
			System.out.print(allele.getText());
		}
		
		
		
		//drive.findElement(By.xpath(tagname[@attribute="value"]);//simple xpath syntax
	}

}
