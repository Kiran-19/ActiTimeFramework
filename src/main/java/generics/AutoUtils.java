package generics;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class AutoUtils {
	
	
	public static String getPhoto(WebDriver driver, String folder, String filename) {
		
	  try 
	  {  
	String dateTime = new Date().toString().replace(":","_");
	String path=folder+filename+dateTime+".png";
	TakesScreenshot t=(TakesScreenshot)driver;
	File sourceFile=t.getScreenshotAs(OutputType.FILE);
	File destinationFile=new File(path);
	FileUtils.copyFile(sourceFile, destinationFile);
	  }
	  catch(Exception e) {
		  
	  }
	
	    return filename;
	}
	
	
	public static String getProperty(String path, String key) {
		
		String v="";
		try 
		{
			
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		v=p.getProperty(key);
		}
		catch(Exception e) {
			
		}
		return v;
	}

}
