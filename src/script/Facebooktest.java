package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.FacebookLogin;
import POM.facebookpage;
import genric.Basetest;
import genric.Excel;

public class Facebooktest extends Basetest {
	@Test(priority=0)
	
	public void test() throws Exception {
		facebookpage fb=new facebookpage(driver);
		
		
		
		int rc=Excel.getRowcount(INPUT_PATH, "facebook");
		for(int i=1;i<=rc;i++) {
			
			String fn=Excel.getCellData(INPUT_PATH, "facebook", i, 0);
			String sn=Excel.getCellData(INPUT_PATH, "facebook", i, 1);
			String mail=Excel.getCellData(INPUT_PATH, "facebook", i, 2);
			String conmail=Excel.getCellData(INPUT_PATH, "facebook", i, 3);
			String pw=Excel.getCellData(INPUT_PATH, "facebook", i, 4);
			fb.setfirstname(fn);
			Reporter.log(fn,true);
			fb.setsurname(sn);
		    Reporter.log(sn,true);
			fb.setmail(mail);
			Reporter.log(mail,true);
			fb.setconmail(mail);
			Reporter.log(mail,true);
			Thread.sleep(3000);
			fb.setsurname(pw);
			Reporter.log(pw,true);
			Thread.sleep(2000);
			fb.days();
			fb.months();
			fb.years();
			fb.clickmale();
			Thread.sleep(2000);
			fb.clickcreatebutton();
		}
	}
	@Test(priority=1)
	public void facebooklogin() {
		FacebookLogin fl=new FacebookLogin (driver);
		int rc=Excel.getRowcount(INPUT_PATH, "Login");
		for(int i=1;i<=rc;i++) {
			String un=Excel.getCellData(INPUT_PATH,"Login", i, 0);
			String pw=Excel.getCellData(INPUT_PATH, "Login", i, 1);
			fl.setmail(un);
			Reporter.log(un,true);
			fl.setpass(pw);
			Reporter.log(pw,true);
			fl.clicklogin();
		}
		
	}

}
