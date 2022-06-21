package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.Screenshot;

public class TestListeners extends BaseTest implements ITestListener{
	WebDriver driver;
	
public void onTestStart(ITestResult result) {
	System.out.println(result.getName() + "test has started");
}
//public void onTestFailure(ITestResult result) {
//	System.out.println(result.getName() + "test has failed");
//}

public void onTestFailure(ITestResult result) {
	try {
		Screenshot.TakeScreenshot(driver, result.getName());
	}
	catch (IOException e) {
		e.printStackTrace();
	}
}

public void onTestSuccess(ITestResult result) {
	System.out.println(result.getName() + "test successful");
}
public void onTestSkipped(ITestResult result) {
	System.out.println(result.getName() + "test has skipped");
}
}
