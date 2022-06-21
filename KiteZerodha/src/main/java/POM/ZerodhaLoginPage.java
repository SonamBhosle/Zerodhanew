package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	
	@FindBy(xpath = "//input[@type='text']") private WebElement userID;
	@FindBy(xpath = "//input[@type='password']") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement login;
	@FindBy(xpath = "//a[@class='text-light forgot-link']") private WebElement forgot;
	@FindBy(xpath = "(//a[@target='_blank'])[3]") private WebElement signup;
	@FindBy(xpath = "(//span[@class=\"su-message\"]") private WebElement userIDerror;
	
	public ZerodhaLoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enteruserID(String userid) {
		userID.sendKeys(userid);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
	  login.click();
	}
	
	public void clickOnForgot() {
		  forgot.click();
	}
	
	public void clickOnSignup() {
		signup.click();
	}
	
	public String getErrorText() {
		String text = userIDerror.getText();
		return text;
	}
}

//Kite  login credentials 
//User name : OKP335
//Password:QAZ123456
//Pin:456789