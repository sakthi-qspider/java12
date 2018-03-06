package assment;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Registerpage {
	
	@Test
	
	
	public void openapplication() throws Exception {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		FileInputStream fis=new FileInputStream("/designframework/data/input.xlsx");
		Workbook wb= WorkbookFactory(fis);
		
		org.apache.poi.ss.usermodel.Sheet s= wb.getSheet("naukri");
			
		
		String value = s.getRow(1).getCell(1).getStringCellValue();
		
	
		
		
		
		
		driver.get("https://login.naukri.com");
		driver.findElement(By.xpath(".//*[@id='pWdgPan_login']/div[2]/h3/a")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("html/body/div/form/div[2]/div/button")).click();
	}

	private Workbook WorkbookFactory(FileInputStream fis) {
		// TODO Auto-generated method stub
		return null;
	}
}
