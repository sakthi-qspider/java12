package genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Basetest implements Autoconst {
	public WebDriver driver;
	@BeforeMethod
	
	public void openapplication() throws InterruptedException {
		
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		
		driver=new FirefoxDriver();
	//driver.get("https://my.naukri.com/account/createaccount");
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	System.out.println(driver.getTitle());
	
		
		
	}
	
	@AfterMethod
	public void closeAppliaction() {
		
		//driver.close();
		
	}

}
