package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ZerodhaPinPage {
	
	@FindBy(xpath = "//input[@type='password']") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement submit;
	@FindBy(xpath = "//a[@href='/forgot']") private WebElement forgotpin;
	@FindBy(xpath = "//a[@class='text-light']") private WebElement signup;
	
	public ZerodhaPinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//public void enterPin(String pinno) {
	//pin.sendKeys(pinno);
	//}
	
	//public void enterPin(String pinno, WebDriver driver) {
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000)); //explicit
	//	wait.until(ExpectedConditions.visibilityOf(pin));
	//	pin.sendKeys(pinno);
	//}
	
	public void enterPin(String pinno, WebDriver driver) {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofMillis(20000));//total wait time
			wait.pollingEvery(Duration.ofMillis(2000));//polling time or rechecking time
			wait.ignoring(Exception.class);//exception ignore
			wait.until(ExpectedConditions.visibilityOf(pin));
			pin.sendKeys(pinno);
		}
	
	public void clickOnSubmit() {
		submit.click();
	}
	
	public void clickOnForgot() {
		forgotpin.click();
	}
	
	public void clickOnSignup() {
		signup.click();
	}
}
