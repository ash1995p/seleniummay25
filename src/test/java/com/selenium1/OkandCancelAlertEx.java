package com.selenium1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class OkandCancelAlertEx extends Basic {

	public static void main(String[] args) throws InterruptedException {
		
		driver = openbrowser("https://demo.automationtesting.in/Alerts.html");
		
		
		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"tab-pane col-md-6 col-md-offset-1 col-xs-4 col-xs-offset-1 active\"]/button")).click();
	   Alert myalert = driver.switchTo().alert();
	   Thread.sleep(2000);
	   System.out.println(myalert.getText());
	   myalert.accept();
		closebrowser();

	}
	
	public static void closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}

