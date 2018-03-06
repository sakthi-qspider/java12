package assment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class gridparallelexecution {
	

	
		public static ThreadLocal<RemoteWebDriver>dr= new ThreadLocal<RemoteWebDriver>();
		
		@BeforeClass
		@Parameters("browser")
		
		public void openapplication(String browser) throws Exception {
			RemoteWebDriver driver=null;
			
			if(browser.equalsIgnoreCase("chrome")) {
				URL url=new URL("http://localhost:4444/wd/hub");
				DesiredCapabilities dc=new DesiredCapabilities().chrome();
				dc.setBrowserName("chrome");
				dc.setPlatform(Platform.WIN8_1);
				driver=new RemoteWebDriver(url,dc);
				
			}else if(browser.equalsIgnoreCase("firefox")) {
				URL url=new URL("http://localhost:4444/wd/hub");
				DesiredCapabilities dc=new DesiredCapabilities().firefox();
				dc.setBrowserName("firefox");
				dc.setPlatform(Platform.WIN8_1);
				driver=new RemoteWebDriver(url,dc);
			}
					setWebdriver(driver);
					Thread.sleep(3000);
					
		}
		
	public WebDriver  getDriver() {
		return dr.get();
		
	}

		public void setWebdriver(RemoteWebDriver driver) {
			dr.set(driver);
			
		}



		@AfterClass
		
		public void closeapplication() throws InterruptedException {
			
			Thread.sleep(3000);
			//getDriver().close();
		
			
		}

		
		}
		
		
		

	


