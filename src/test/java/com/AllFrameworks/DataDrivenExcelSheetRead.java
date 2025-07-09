package com.AllFrameworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcelSheetRead {

	public static void main(String[] args) throws IOException 
	{
		
	   File f = new File("D:\\java\\selenium march\\seleniummay25\\testdata\\Copy of test1.xlsx");
	   FileInputStream file = new FileInputStream(f);
	    Workbook w = new XSSFWorkbook(file);
	    Sheet s = w.getSheet("Sheet1");
	    Row r= s.getRow(1);
	    Cell c =r.getCell(1);
	    
	    String value = c.getStringCellValue();
	    System.out.println(value);
	   
	    
	    
	 
		

	}

}
