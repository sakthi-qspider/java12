package genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Basepage {
	
	public WebDriver driver;
	
	public  Basepage(WebDriver driver) {
		
		this.driver=driver ;
	}
		public void verifytitle(String etitle) {
		WebDriverWait wait=new WebDriverWait(driver,30);
		try {
			wait.until(ExpectedConditions.titleIs(etitle));
			System.out.println("Title is matching");
			System.out.println(driver.getTitle());
		
		
		
			
		}
		catch(Exception e) {
			System.out.println(" Title is not matching");
			Assert.fail();
			
			
			
		
			
			
		}}
	}
	


