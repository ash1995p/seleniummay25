package com.AllFrameworks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenReadex3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:\\java\\selenium march\\seleniummay25\\testdata\\Copy of test1.xlsx");
		   FileInputStream file = new FileInputStream(f);
		    Workbook w = new XSSFWorkbook(file);
		    
		    Sheet sh = w.getSheet("studentname");
		    
 	       int lastrows = sh.getLastRowNum();
           System.out.println(lastrows);
           
           int lastcells = sh.getRow(1).getLastCellNum();
		    System.out.println(lastcells);
           
           for(int r=0;  r<=lastrows ; r++)
           {  
        	   Row row = sh.getRow(r);
        	   
        	  for(int j=0 ; j<lastcells ;j++)
        	  {
        		  Cell cell = row.getCell(j);
        		  System.out.print(cell.toString()+ "\t      ");
        		  
        	  }
        	   
        	  System.out.println();
           }
		    
		   
//		    
//		    String value = sh.getRow(1).getCell(1).getStringCellValue();
//		    System.out.println(value);
		    
		    

	}

}
