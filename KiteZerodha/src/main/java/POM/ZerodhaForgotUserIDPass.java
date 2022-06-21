package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotUserIDPass {
	
	@FindBy(xpath = "//label[@for='radio-31']") private WebElement forgotUserID;
	@FindBy(xpath = "//label[@for='radio-36']") private WebElement receiveOnsms;
	@FindBy(xpath = "(//input[@type='text'])[1]") private WebElement panno;
	@FindBy(xpath = "(//input[@type='text'])[2]") private WebElement mobileno;
	@FindBy(xpath = "(//input[@type='text'])[4]") private WebElement captcha;
	@FindBy(xpath = "//button[@type='submit']") private WebElement reset;
	@FindBy(xpath = "(//a[@href='/'])[2]") private WebElement backtologin;
	
	public ZerodhaForgotUserIDPass (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickOnForgotUserID() {
		  forgotUserID.click();
	}
	
	public void clickOnPan(String pan) {
		panno.sendKeys(pan);
	}
	
	public void clickOnsms() {
		  receiveOnsms.click();
	}
	public void enterMobno(String mobno) {
		mobileno.sendKeys(mobno);
	}
	public void enterCaptcha(String Captcha) {
		captcha.sendKeys(Captcha);
	}
	public void clickOnReset() {
		  reset.click();
	}
	public void clickOnBacktologin() {
		  backtologin.click();
	}
}
