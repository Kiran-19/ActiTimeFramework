package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import generics.AutoUtils;
import generics.IAutoConstants;

public class EnterPage {
	
	@FindBy(xpath="//div[contains(text(),'Help')]")
	private WebElement help;
	
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutAT;
	
	@FindBy(xpath="//span[@class='productVersion']")
	private WebElement version;
	
	public EnterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public void clickhelp() {
		help.click();
	}
	
	public void clickAboutActTime() {
		aboutAT.click();
	}
	
	public void verifyProductVersion(String ExpectedVersion) {
		
		String ActualVersion=version.getText();
		Assert.assertEquals(ActualVersion, ExpectedVersion);
	}
	
	 
	}
