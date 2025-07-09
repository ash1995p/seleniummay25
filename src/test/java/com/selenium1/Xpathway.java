package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathway {

	public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://demo.automationtesting.in/Register.html");
		
		//relative x-path 1.(normalway)//
		//drive.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("ashwini");   
		
		
		//absolute xpath//
		//drive.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
		
		
		//find xpath by 2.contains
		//drive.findElement(By.xpath("//input[contains(@placeholder,'irst')]")).sendKeys("ash");
		
		
		//find xpath by 3.starts-with
		//  //tagname[starts-with(@attribute,'value'])
		
		//drive.findElement(By.xpath("//input[starts-with(@placeholder,\"Las\")]")).sendKeys("pudale");
		
		//find xpath by 4.text
		//drive.findElement(By.xpath("//label[text()=\" Cricket \"]")).submit();
		
		//find xpath by 5.following
		// drive.findElement(By.xpath("//label[text()=\" Cricket \"]/following :: button"));
		
		
		

	}

}
