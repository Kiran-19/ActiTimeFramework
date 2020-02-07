package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	
	//Deceleration
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;

	@FindBy(xpath="//div[text()='Login '] ")
	private WebElement lnbtn;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errorMSG;
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void setuserName(String un) {
		
		unTB.sendKeys(un);
	}
	
   public void setuserPassword(String pwd) {
		
		pwTB.sendKeys(pwd);
	}
	
	public void clickLogin() {
		lnbtn.click();
	}
	
	public void verifyErrorMSG(String expectedMSG)
	{
		String actualMSG = errorMSG.getText();
		Assert.assertEquals(actualMSG, expectedMSG);
	}
}
