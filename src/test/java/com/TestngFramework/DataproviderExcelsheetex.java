package com.TestngFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExcelsheetex {
	
	WebDriver driver=null;
	
	
	@BeforeTest
	public void openbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="Exceldata")
	public void login(String uname, String pass) throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(uname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pass);
		Thread.sleep(2000);
	}
	
	@DataProvider
	public Object[][] Exceldata() throws IOException
	{
		File f = new File("D:\\java\\selenium march\\seleniummay25\\testdata\\Student.xlsx");
		FileInputStream file = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(file);
		Sheet sh = w.getSheet("Sheet1");
		
		int lastrow = sh.getLastRowNum();
		int lastcell = sh.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[lastrow+1][lastcell];
		for(int r=0 ; r<=lastrow ; r++)
		{
			
			for(int c=0 ; c<lastcell ;c++)
			{
				
				obj[r][c]=sh.getRow(r).getCell(c).getStringCellValue();
			}
		}
		
		return obj;
	}

}
