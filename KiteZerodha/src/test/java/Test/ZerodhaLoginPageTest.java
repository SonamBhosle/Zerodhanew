package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import POJO.Browser5;
import POM.ZerodhaLoginPage;
import Utility.Parametrization1;

@Listeners(TestListeners.class)

public class ZerodhaLoginPageTest extends BaseTest{
	
	ExtentReports reports;
	ExtentTest test;
	
	public void extentReports(){
		reports = Report.createReport();
	}
	
	@BeforeMethod
	public void browser() {
		driver = Browser5.openBrowser();
	}
	@Test
	public void loginWithValidCredentials() throws EncryptedDocumentException, IOException {
		test = reports.createTest("loginWithValidCredentials");
		ZerodhaLoginPage zerodhaLoginpage = new ZerodhaLoginPage(driver);
		String username = Parametrization1.getData("Sheet1", 0, 1);
		String password = Parametrization1.getData("Sheet1", 1, 1);
		zerodhaLoginpage.enteruserID(username);
		zerodhaLoginpage.enterPassword(password);
		zerodhaLoginpage.clickOnLogin();
	}
	

		@Test
	public void forgotPassword() {
			test = reports.createTest("forgotPassword");
		ZerodhaLoginPage zerodhaLoginpage = new ZerodhaLoginPage(driver);
		zerodhaLoginpage.clickOnForgot();
	}
	
		@Test
		public void loginWithoutDataTest() throws EncryptedDocumentException, IOException{
			test = reports.createTest("loginWithoutDataTest");
			ZerodhaLoginPage zerodhaLoginpage = new ZerodhaLoginPage(driver);
			zerodhaLoginpage.clickOnLogin();
			String text = zerodhaLoginpage.getErrorText();
			String expectedText = "User ID should be minimum 6";
		  //  Assert.assertEquals(text, expectedText);	//hard assert
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(text, expectedText);
			
			String username = Parametrization1.getData("Sheet1", 0, 1);
			String password = Parametrization1.getData("Sheet1", 1, 1);
			zerodhaLoginpage.enteruserID(username);
			zerodhaLoginpage.enterPassword(password);
			zerodhaLoginpage.clickOnLogin();
			softAssert.assertAll();
		}
		
		@AfterMethod
		public void closeBrowser(ITestResult result) {
		if (result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		} else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
		} else {
			test.log(Status.SKIP, result.getName());
		}
		}
			
		@AfterTest
		public void flushResult() {
		reports.flush();
		}
		
		
	@Test(dependsOnMethods = {"loginWithoutDataTest"})
	public void signUp() {
		test = reports.createTest("signUp");
		ZerodhaLoginPage zerodhaLoginpage = new ZerodhaLoginPage(driver);
		zerodhaLoginpage.clickOnSignup();
	}
}

