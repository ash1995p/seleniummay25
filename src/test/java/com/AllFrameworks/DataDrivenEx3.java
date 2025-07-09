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

public class DataDrivenEx3 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\java\\selenium march\\seleniummay25\\testdata\\Copy of test1.xlsx");
		FileInputStream file = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(file);
		Sheet sheet = w.getSheet("studentname");
		 int totalrows = sheet.getLastRowNum();
		 int totalcells = sheet.getRow(3).getLastCellNum();
		/// System.out.println(totalrow);
		// System.out.println(totalcell);
		 
		 for(int r=0 ; r<totalrows ; r++)
		 {
			 
			 
			 for(int c=0 ; c<totalcells ;c++)
			 {
				 Row row = sheet.getRow(r);
					Cell cell= row.getCell(c);
					System.out.print(cell.toString()+"\t");
				 
			 }
			 System.out.println( "  ");
		 }

	}

}

