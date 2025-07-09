package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframeWithIframeNestedEx2 extends Basic {

	public static void main(String[] args) throws InterruptedException 
	{
		
		driver = openbrowser("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[@href=\"#Multiple\"]")).click();
		
	   WebElement frame1 = driver.findElement(By.xpath("//div[@class=\"container iframes-page-container\"]"));
	   driver.switchTo().frame("frame1");
	   
	   WebElement frame2 = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
	   driver.switchTo().frame(frame2);
	   
	   WebElement text = driver.findElement(By.xpath(""));
	   text.sendKeys("ashwini p");
	   
	   Thread.sleep(5000);
		
	}

}
