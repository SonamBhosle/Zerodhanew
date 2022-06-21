package Test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import POJO.Browser5;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization1;

@Listeners(TestListeners.class)

public class ZerodhaPinPageTest {
		WebDriver driver;
		
		@BeforeMethod
		public void browser() {
			driver = Browser5.openBrowser();
		}
		
		@Test
		public void loginWithValidCredentials() throws EncryptedDocumentException, IOException, InterruptedException {
			ZerodhaLoginPage zerodhaLoginpage = new ZerodhaLoginPage(driver);
			String username = Parametrization1.getData("Sheet1", 0, 1);
			String password = Parametrization1.getData("Sheet1", 1, 1);
			zerodhaLoginpage.enteruserID(username);
			zerodhaLoginpage.enterPassword(password);
			zerodhaLoginpage.clickOnLogin();			
			ZerodhaPinPage zerodhaPinpage = new ZerodhaPinPage(driver);
			String pin = Parametrization1.getData("Sheet1", 2, 1);
			System.out.println(pin);
			zerodhaPinpage.enterPin(pin, driver);
			zerodhaPinpage.clickOnSubmit();	
			String homepage = driver.getTitle();
			String requiredTitle = "Dashboard / Kite";
			Assert.assertEquals(homepage, requiredTitle);
		}
}
