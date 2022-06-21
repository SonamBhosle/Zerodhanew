package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser5;
import POM.ZerodhaForgotUserIDPass;
import POM.ZerodhaPinPage;
import Utility.Parametrization1;

public class ZerodhaForgotUserIDPassTest {
	WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		driver = Browser5.openBrowser();
	}
	
	@Test
	public void ForgotuserIDPass() throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		ZerodhaPinPage zerodhaPinpage = new ZerodhaPinPage(driver);
		zerodhaPinpage.clickOnForgot();	
		Thread.sleep(3000);
		ZerodhaForgotUserIDPass zerodhaForgotuserid = new ZerodhaForgotUserIDPass (driver);
		zerodhaForgotuserid.clickOnForgotUserID();
		Thread.sleep(3000);
		String Pan = Parametrization1.getData("Sheet1", 3, 1);
		zerodhaForgotuserid.clickOnPan(Pan);
		Thread.sleep(3000);
		zerodhaForgotuserid.clickOnsms();
		String Mobno = Parametrization1.getData("Sheet1", 4, 1);
		zerodhaForgotuserid.enterMobno(Mobno);
		Thread.sleep(3000);
		zerodhaForgotuserid.clickOnBacktologin();
	}
			
	}

