package assment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class gmail {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//WebDriver driver = new HtmlUnitDriver();
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("sakthikaveri04@gmail.com");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//*[@id='password']/div[1]")).sendKeys("Skaveri@123");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
	
		driver.findElement(By.xpath(".//*[@class,'WaidBe']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='gbqfq']")).sendKeys("sakthiaero");
		driver.findElement(By.cssSelector("#gbqfb")).click();
		
		

	}

}
