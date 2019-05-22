package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebookStepDefination {
	
	WebDriver driver;
	
	@Given("user enter url facebook.com")
	public void user_enter_url_facebook_com() {
		System.setProperty("webdriver.gecko.driver","C:\\Works\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		
	}
	@When("user enter{string}")
	public void user_enter(String[] s) {
	     driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(s);
	}
	
	@And("user enter{string}")
	public void user_enter(String s1) {
	
	 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(s1);
	}
	
	@And("user click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		
	}
	
	@Then("user able to login successfully")
	public void user_able_to_login_successfully() {
	    driver.getTitle();
	}

}
