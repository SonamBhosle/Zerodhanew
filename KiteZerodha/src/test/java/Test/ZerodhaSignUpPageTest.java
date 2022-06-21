package Test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser5;
import POM.ZerodhaLoginPage;
import POM.ZerodhaSignUpPage;
import Utility.Parametrization1;

public class ZerodhaSignUpPageTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		driver = Browser5.openBrowser();
	}
	
	@Test
	public void SignUp() throws EncryptedDocumentException, IOException, InterruptedException {
		
		ZerodhaLoginPage zerodhaLoginpage = new ZerodhaLoginPage(driver);
		zerodhaLoginpage.clickOnSignup();
		
		ZerodhaSignUpPage zerodhaSignuppage = new ZerodhaSignUpPage(driver);
		zerodhaSignuppage.Switchwindowsigninpage(driver);
			
	String phonee = Parametrization1.getData("Sheet1", 4, 1);
    zerodhaSignuppage.clickOnPhoneno(phonee);
    zerodhaSignuppage.clickOnContinue();
	    }}
		
