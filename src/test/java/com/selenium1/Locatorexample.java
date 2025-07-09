package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Register.html");
		
		Driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));           //locators mhnje webelement//
		
        Driver.navigate().refresh();
        
        Driver.navigate().back();
        
        Driver.navigate().forward();
        Driver.navigate().to("");        //same like get//
        
	}

}
