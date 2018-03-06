package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genric.Basepage;

public class FacebookLogin extends Basepage {
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(id="u_0_2")
	private WebElement login;
	

	public FacebookLogin(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setmail(String un) {
		email.sendKeys(un);
	}
	public void setpass(String pw) {
		password.sendKeys(pw);
	}
public void clicklogin() {
	login.click();
}
}
