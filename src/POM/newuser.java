package POM;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import genric.Basepage;
public class newuser extends Basepage {
	@FindBy(css=".action-btn.exp")
	private WebElement professional;
	@FindBy(id="fname")
	private WebElement name;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(name="password")
	private WebElement  password;
	@FindBy(xpath=".//*[@id='basicDetailForm']/div[4]/div[1]/div/input[2]")
	private WebElement mobilenumber;
	@FindBy(name="expYear")
	
	private WebElement years;
	@FindBy(tagName="a")
	private WebElement year;
	@FindBy(name="expMonth")
	private WebElement months;
	@FindBy(tagName="a")
	private WebElement month;
	@FindBy(name="uploadCV")
	private WebElement uploadresume;
	@FindBy(css=".primary-btn")
	private WebElement Registernow;
	public newuser(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);	
	}
public void clickprofessional() {
	professional.click();
}
public void setname(String un) {
	name.sendKeys(un);
}
public void setmailid(String mailid) {
	email.sendKeys(mailid);
}
public void setpassword(String pw) {
	password.sendKeys(pw);
}
public void setmobileno(String no) {
	mobilenumber.sendKeys(no);
}
public void selectexp() {
years.click();
year.sendKeys("3");


}
public void selectmonth() {
	months.click();
	month.sendKeys("2");
	
	
}
public void uploaddcoument(String path) {
	uploadresume.sendKeys("C:\\Users\\VishwaKM\\Desktop\\Sakthi_Manual_Automation_Resume.txt");
}
public void clickregisterbutton() {
	Registernow.click();
}
}
