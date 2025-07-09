package com.selenium1;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class ScreenShotAmazonEx extends Basic
{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver = openbrowser("https://www.amazon.in/");
		
		TakesScreenshot obj = (TakesScreenshot)driver;	
		File sourcefile = obj.getScreenshotAs( OutputType.FILE);
		File destinationfile = new File("D:\\screenshot"+timestamp()+".png");
		FileUtils.copyFile(sourcefile,destinationfile);
	}
	
	public static String timestamp()
	{
		return new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss").format(new Date());	
	}

}

