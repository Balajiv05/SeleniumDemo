
package com.infosys.test.SeleniumDemo1.Assertions;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
 
//How to read excel files using Apache POI
public class ReadExcelFile {
	 @Test		
	    public void ReadExcel() throws InterruptedException, Exception					
	    {           //I have placed an excel file 'Test.xlsx' in my D Driver 
			FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\git\\SeleniumDemo1\\SeleniumDemo1\\src\\excelExportAndFileIO\\ExportExcel.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
           	Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
                       	System.out.println(cell);
			//System.out.println(sheet.getRow(0).getCell(0));
		
	}		
}