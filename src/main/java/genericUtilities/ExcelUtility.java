package genericUtilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	private Workbook w;
	private Sheet s;
	public void excelInit(String excelPath, String sheetName)
	{
		FileInputStream f=null;
		try {
			f=new FileInputStream(excelPath);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			w=WorkbookFactory.create(f);
			
		}
		catch(EncryptedDocumentException | IOException e) {
		e.printStackTrace();
		
	}

	s=w.getSheet(sheetName);
}
	public void readFromExcel()
	{
		DataFormatter d=new DataFormatter();
		Map<String, String>map=new HashMap<String,String>();
		for(int i=0;i<s.getLastRowNum();i++)
		{
			if(d.formatCellValue(s.))
		}
	}
}