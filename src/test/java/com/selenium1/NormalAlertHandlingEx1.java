package com.selenium1;

import org.openqa.selenium.By;

public class NormalAlertHandlingEx1 extends Basic {

	public static void main(String[] args) throws InterruptedException {
		
		driver = openbrowser("https://demo.automationtesting.in/Alerts.html");                                            //normal alert handling//
		
		driver.findElement(By.xpath("//div[@id=\"OKTab\"]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		closebrowser();
	}

	
	
	
	
	public static void closebrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}




