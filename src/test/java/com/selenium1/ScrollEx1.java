package com.selenium1;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;

public class ScrollEx1 extends Basic {           //javascriptexecutor//

	public static void main(String[] args) throws InterruptedException 
	{
  
	  driver = openbrowser("https://demo.automationtesting.in/Frames.html");	
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,250)", "");
		
		
		
		
		
		
		
		Basic.close();
		
		
	}

}
