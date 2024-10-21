package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {
	public static void main(String[] args) throws IOException  {
		
		// step1 : convert physical file into java readable file
		FileInputStream fis = new FileInputStream("./src/test/resources/excel1.xlsx");
		
		//step2 : open workbook
 Workbook wb = WorkbookFactory.create(fis);
	 
	 //step3:go to particular sheet
    Sheet sheet= wb.getSheet("Sheet1");
	
	//step4: go to particular row
	Row row=sheet.getRow(3);
//	
	//step5 : go to particular cell
	Cell cell=row.getCell(1);
	
	//step6 : fetch data
	String data=cell.getStringCellValue();
	System.out.println(data);
	
	//step7: close workbook
	wb.close();
		
	
		
		
	}
}
		