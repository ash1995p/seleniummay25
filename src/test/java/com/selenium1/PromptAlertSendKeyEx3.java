package com.selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class PromptAlertSendKeyEx3 extends Basic {

	public static void main(String[] args) throws InterruptedException {
		
		driver = openbrowser("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"Textbox\"]/button")).click();
		Alert myalert = driver.switchTo().alert();
		myalert.sendKeys("ashwini");
		Thread.sleep(3000);
		myalert.accept();
		
		
        
		close();
		
	}
	
	public static void close() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.close();
	}

}
