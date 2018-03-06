package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.Loginpage;
import POM.newuser;
import genric.Basetest;
import genric.Excel;

public class Registerpage extends Basetest {
	@Test
	
	public void RegisterAppliaction() throws Exception {
		int rc=Excel.getRowcount(INPUT_PATH, "Registerpage");
		for (int i=1;i<=rc;i++) {
			String un=Excel.getCellData(INPUT_PATH, "Registerpage", i, 0);
			String mailid=Excel.getCellData(INPUT_PATH, "Registerpage", i, 1);
			String pw=Excel.getCellData(INPUT_PATH, "Registerpage", i, 2);
			String no=Excel.getCellData(INPUT_PATH, "Registerpage", i, 3);
			//String path=Excel.getCellData(INPUT_PATH, "Registerpage", i, 4);
			newuser n=new newuser(driver);
			n.clickprofessional();
			Thread.sleep(3000);
			n.setname(un);
			Reporter.log(un,true);
			Thread.sleep(1000);
			n.setmailid(mailid);
			Reporter.log(mailid,true);
			n.setpassword(pw);
			Reporter.log(pw,true);
			n.setmobileno(no);
			Reporter.log(no,true);
			Thread.sleep(1000);	
			n.selectexp();
			Thread.sleep(2000);
			n.selectmonth();
			Thread.sleep(2000);
			
			n.clickregisterbutton();
			Thread.sleep(5000);	
		}
			
		}
}
