package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import genric.Basepage;

public class facebookpage extends Basepage {
	
	
	@FindBy(id="u_0_l")
private WebElement firstname;
	@FindBy (id="u_0_n")
	private WebElement surname;
	
	@FindBy(id="u_0_q")
	private WebElement email;
	@FindBy(id="u_0_t")
	private WebElement conemail;
	
	@FindBy(css="#u_0_x")
	
	private WebElement password;
	
	@FindBy(id="day")
	private WebElement day;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement years;
	@FindBy(id="u_0_c")
	private WebElement male;
	@FindBy(css="#u_0_13")
	private WebElement createbutton;
	public facebookpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void setfirstname(String fn) {
		firstname.sendKeys(fn);
	}
	public void setsurname (String sn) {
		
		surname.sendKeys(sn);
	}
	
	public void setmail(String mail) {
		email.sendKeys(mail);
	}
	public void setconmail(String conmail) {
		conemail.sendKeys(conmail);
	}
	public void setpassword(String pw) {
		password.sendKeys(pw);
	}
	public void days() {
		Select sel1=new Select(day);
		sel1.selectByVisibleText("4");
	}
	public void months() {
		Select sel2=new Select(month);
		sel2.selectByVisibleText("Apr");
	}
	public void years() {
		Select sel3=new Select(years);
		sel3.selectByVisibleText("1992");
	}
		public void clickmale() {
		male.click();
	}
	public void clickcreatebutton() {
		createbutton.click();
	}

}
