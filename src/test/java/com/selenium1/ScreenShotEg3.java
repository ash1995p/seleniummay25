package com.selenium1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.opentelemetry.api.internal.Utils;

public class ScreenShotEg3 extends Basic {

	public static void main(String[] args) throws InterruptedException, IOException, WebDriverException
	{
	    driver = openbrowser("https://demo.automationtesting.in/Frames.html");	
	    
	    
	    TakesScreenshot obj = (TakesScreenshot)driver;
	    File source = obj.getScreenshotAs(OutputType.FILE);
	    File destination = new File ("D:\\screenshot\\automationpage.png");
	    FileUtils.copyFile(source, destination);
	    
	    
	    close();
	    
	    
	    
	    
	    

	}
	
	public static void close() throws InterruptedException
	{
		Thread.sleep(2000);
	}

	
}
