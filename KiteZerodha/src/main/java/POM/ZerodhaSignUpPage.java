package POM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {
    @FindBy(xpath = "//input[@oninvalid=\"if (this.value != '') {setCustomValidity('Please enter a valid mobile number')}\"]") private WebElement phoneno;
    @FindBy(xpath = "//button[@type='submit']") private WebElement continueb;
	
	public ZerodhaSignUpPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPhoneno(String num) {
		phoneno.sendKeys(num);
		 
	}
	public void clickOnContinue() {
		continueb.click();
		 
	}
	public void Switchwindowsigninpage(WebDriver driver) throws InterruptedException {
		Set<String> hii = driver.getWindowHandles();
		Iterator<String> i = hii.iterator();
		Thread.sleep(2000);
	    while(i.hasNext()) {
		String address =  i.next();
		driver.switchTo().window(address);
		if(driver.getTitle().equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha"));  
		{
	}
	
		
}}}
