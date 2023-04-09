package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPage {
	WebDriver driver;
	public FbPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="//input[@type='text']")
	WebElement emailBox;
	
	public void username(String text) {
		emailBox.sendKeys(text);
	
		
	}

	@FindBy(xpath="//input[@type='password']")
	WebElement PassBox;
	public void PBox (String text) {
		PassBox.sendKeys(text);
		
	}
	@FindBy(xpath="//button[@value'1]")
	WebElement Login;
	public void loginBox() {
		Login.click();
		
	}
}
