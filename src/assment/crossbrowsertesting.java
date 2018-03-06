package assment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertesting {
	
	public WebDriver driver;
	@Parameters("browser")
@BeforeClass
	public void openapplication(String browser) throws Exception
	{
		
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("Webdriver.gecko.driver","./driver/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
			
			driver=new ChromeDriver();
			
			
		}
		driver.get("https://login.naukri.com");
		
		Thread.sleep(3000);
		
	}	
@Test

public void testapplication() throws Exception {

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.id("emailTxt")).sendKeys("sakthiaero@ymail.com");
	driver.findElement(By.id("pwd1")).sendKeys("sakthikaveri");
	driver.findElement(By.cssSelector("#sbtLog")).click();
	Thread.sleep(3000);
	
}
	
	
	
	@AfterClass
	
	public void closeapplication()
	{
	driver.quit();
	}
}
