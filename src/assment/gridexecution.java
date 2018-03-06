package assment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class gridexecution extends gridparallelexecution{
	@Test
	
	public void testapplication()
	{
		getDriver().get("https://www.facebook.com");
		getDriver().findElement(By.id("email")).sendKeys("sakthiaero@ymail.com");
		getDriver().findElement(By.id("pass")).sendKeys("111222");
		getDriver().findElement(By.xpath(".//*[@id='u_0_3']")).click();
		

	}
}
