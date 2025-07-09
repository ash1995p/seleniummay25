package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameHandlingEx1 extends Basic
{

	public static void main(String[] args) throws InterruptedException 
	{
		 driver =  openbrowser("https://demo.automationtesting.in/Frames.html");
		 
		 WebElement frame1=driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
		 driver.switchTo().frame(frame1);
		 
		WebElement text =driver.findElement(By.xpath("//input[@type=\"text\"]"));
		text.sendKeys("ashwini");	
		
		close();

	}
 
	public static void close() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.close();
	}
	
}
