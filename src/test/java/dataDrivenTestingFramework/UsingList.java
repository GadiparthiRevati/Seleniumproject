package dataDrivenTestingFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsingList {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
	FileInputStream fis=new FileInputStream("./src/test/resources/excel1.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	
	Sheet sheet=wb.getSheet("Sheet1");
	List<String> list=new ArrayList<String>();
	DataFormatter df=new DataFormatter();
	//for(int i=0;i<=sheet.getLastRowNum;i++)
	{
		
	}
	
		
		
		
		
		
		
}
}
