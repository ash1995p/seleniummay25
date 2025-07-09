package com.AllFrameworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class OutputStreamDataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:\\java\\selenium march\\seleniummay25\\testdata\\Student.xlsx");
		//FileOutputStream file = new FileOutputStream(f);
		Workbook w = new XSSFWorkbook();
		Sheet s= w.createSheet("Sheet1");
		
		Row row1= s.createRow(0);
		        row1.createCell(0).setCellValue("Name");	
				row1.createCell(1).setCellValue("id");
			    row1.createCell(2).setCellValue("school_name");
			    
		Row row2 = s.createRow(1);
		         row2.createCell(0).setCellValue("ash");
		         row2.createCell(1).setCellValue(101);
		         row2.createCell(2).setCellValue("pvdp");	
		         
		Row row3 = s.createRow(2);
		         row3.createCell(0).setCellValue("bish");
		         row3.createCell(1).setCellValue(101);
		         row3.createCell(2).setCellValue("pvdp");	
		         
		 Row row4 = s.createRow(3);
		         row4.createCell(0).setCellValue("tishh");
		         row4.createCell(1).setCellValue(101);
		         row4.createCell(2).setCellValue("pvdp");	
			    
		      
		 
		      FileOutputStream file = new FileOutputStream(f);
		      w.write(file);
		      
		      System.out.println("data writting done");
		

	}

}
