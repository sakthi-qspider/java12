package genric;

import java.io.File;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel  implements Autoconst{
	
	public static String getCellData(String path, String sheet, int r,int c) {
		
		
		
		String v=" ";
		try {
			
			Workbook wb=WorkbookFactory.create(new File(INPUT_PATH));
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		return v;
		
	}
	
	public static int getRowcount(String path, String sheet) {
		
		int  rc=0;
		
		try {
			Workbook wb=WorkbookFactory.create(new File(INPUT_PATH));
			rc=wb.getSheet(sheet).getLastRowNum();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return rc;
		
	}
		

}
