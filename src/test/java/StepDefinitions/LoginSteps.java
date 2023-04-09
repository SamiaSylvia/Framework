package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Cmmon.facebookBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.FbPage;

public class LoginSteps  extends facebookBase{
	FbPage fb;
	
	WebDriver driver;
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page()  {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    
	}

	@When("^user enters <username> and <password>$")
	public void user_enters_username_and_password(String name)  {
		/*WebElement Username;
		Username = driver.findElement(By.id("email"));
		
		Username.sendKeys(name);*/
		
		fb = new FbPage(driver);
		fb.username(name);
		
		
		
		
	    
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button()   {
		fb.PBox(toString());
		
		
		
	   

	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page()  {
	    

	}


}
