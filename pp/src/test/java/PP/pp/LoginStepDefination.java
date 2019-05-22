package PP.pp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
	WebDriver driver;
	
	
	@Given("User nevigate to gmail login page")
	public void user_nevigate_to_gmail_login_page()
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Works\\ChromeDriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://myaccount.google.com/");
	    driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/a")).click();
	    
	}
		
	@When("user type userid and password")
	public void user_type_userid_and_password() {
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("rknayon@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/div")).sendKeys("33333");
	   
	}

	@When("user click in login button")
	public void user_click_in_login_button() {
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div[2]")).click();
	   
	}

	@Then("user should see profile page")
	public void user_should_see_profile_page() {
	   
	}


	
	

}
