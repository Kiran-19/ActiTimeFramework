package scripts;


import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Excel_Data;
import pages.EnterPage;
import pages.LoginPage;

public class ValidLogin_Test extends BaseTest{
	
	@Test(priority=1,groups= {"login","smoke"})
	public void tesValidlogin() throws InterruptedException {
	
	String un=Excel_Data.getValue(EXCEL_PATH, "Valid Login", 1, 0);
	String pw=Excel_Data.getValue(EXCEL_PATH, "Valid Login", 1, 1);
	String eTitle=Excel_Data.getValue(EXCEL_PATH, "Valid Login", 1, 3);
	LoginPage l=new LoginPage(driver);
	l.setuserName(un);
	Thread.sleep(2000);
	l.setuserPassword(pw);
	Thread.sleep(2000);
	l.clickLogin();

	
	
	
	
	}
}
