package com.selenium1;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;

public class NewTabOpenEx1 extends Basic {

	public static void main(String[] args) throws InterruptedException {
		
		driver = openbrowser("https://www.flipkart.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		
		
		Basic.close();
		
	}

}
