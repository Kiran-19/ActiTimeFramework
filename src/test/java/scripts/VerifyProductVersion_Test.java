package scripts;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Excel_Data;
import pages.EnterPage;
import pages.LoginPage;

public class VerifyProductVersion_Test extends BaseTest{
	
	@Test(priority=3,groups= {"smoke"})
	public void testProductVerson() throws InterruptedException
	{
		int rc=Excel_Data.getRowCount(EXCEL_PATH, "Verify Product Version");
		for(int i=1;i<=rc;i++)
		{
			String un=Excel_Data.getValue(EXCEL_PATH, "Verify Product Version", i, 0);
			String pw=Excel_Data.getValue(EXCEL_PATH, "Verify Product Version", i, 1);
			String version=Excel_Data.getValue(EXCEL_PATH, "Verify Product Version", i, 2);
			LoginPage l=new LoginPage(driver);
			l.setuserName(un);
			l.setuserPassword(pw);
			l.clickLogin();
			Thread.sleep(2000);
			EnterPage e=new EnterPage(driver);
			Thread.sleep(2000);
			e.clickhelp();
			Thread.sleep(2000);
			e.clickAboutActTime();
			Thread.sleep(2000);
			e.verifyProductVersion(version);
		}
	}

}
