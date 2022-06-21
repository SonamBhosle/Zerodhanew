package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaMainPage {
	@FindBy(xpath ="//input[@placeholder=\"Search eg: infy bse, nifty fut, nifty weekly, gold mcx\"]") private WebElement searchbox;
	@FindBy(xpath ="//div[@id=\"app\"]") private WebElement Bb;
	@FindBy(xpath ="//input[@type=\"number\"]") private WebElement quantity;
	@FindBy(xpath ="//label[@for=\"radio-138\"]") private WebElement bse;
	@FindBy(xpath ="//label[@for=\"radio-139\"]") private WebElement intraday;
	@FindBy(xpath ="//div[@class=\"stats-block holdings\"]") private WebElement buy ;
	
	public ZerodhaMainPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnB() {
		Bb.click();
	}
	
}

