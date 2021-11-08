package com.mindtree.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public ArrayList<String> getData(String testcaseName) throws IOException {

		
		ArrayList<String> a = new ArrayList<String>();
		int book=0;
		FileInputStream fis = new FileInputStream(".\\Test Data\\Atlantic.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				
			XSSFSheet sheet = workbook.getSheetAt(i);
			
			Iterator<Row> rows = sheet.iterator();
			Row firstrow =rows.next();
			Iterator<Cell> ce = firstrow.iterator();
			int k=0;
			int column=0;
			while(ce.hasNext()) {
				Cell value = ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("TestCases")) {
					column = k;
				}
				k++;
			}
			//System.out.println(column);
			int c=0;
			
			while(rows.hasNext()){
				Row r = rows.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
					Iterator<Cell> cv = r.cellIterator();
					while(cv.hasNext()) {
						c++;
						a.add(cv.next().getStringCellValue());
					
					}
				}
			}
		}
			System.out.print(a.size());
	}	return a;
	}	
	
}
