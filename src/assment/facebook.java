package assment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebook {

	public static void main(String[] args) throws Exception {
		String etitle = null;
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver  driver=new FirefoxDriver();
		driver.get("https://login.naukri.com/nLogin/Login.php");
		Thread.sleep(4000);
	    WebElement radiobutton= driver.findElement(By.xpath(".//*[@id='userRad']"));
	  
	    radiobutton.click();
	    
	    if (radiobutton.isSelected()) {
	    	System.out.println("The radiobutton is no");
	    }else {
	    	System.out.println("The radiobutton is off");
	    	
	    }
driver.findElement(By.xpath(".//*[@id='userTxt']")).sendKeys("sakthiaero@ymail.com");
driver.findElement(By.xpath(".//*[@id='pwd1']")).sendKeys("sakthikaveri");


driver.findElement(By.name("Login")).click();
WebDriverWait wait=new WebDriverWait(driver, 30);
try {
	wait.until(ExpectedConditions.titleIs(etitle));
	System.out.println(driver.getTitle());
	System.out.println("The Title is matching");
}catch(Exception e) {
	System.out.println("The Title is not matching");
	System.out.println(driver.getTitle());
	
}




	}

}
