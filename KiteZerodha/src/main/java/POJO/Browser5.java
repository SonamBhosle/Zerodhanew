package POJO;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser5 {
	
	public static WebDriver openBrowser () {
		System.setProperty("webdriver.chrome.driver", "/Users/swatibhosle/eclipse-workspace/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		return driver;
	}

}
