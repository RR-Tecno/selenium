package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDEfination {
	WebDriver driver;
	

	@Given("user put the url google.com")
	public void user_put_the_url_google_com()
	{
	  System.setProperty("webdriver.gecko.driver","C:\\\\Works\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.google.com");
			  
	}

	@When("user enter{string}sraech box And click Search button")
	public void user_enter_sraech_box_And_click_Search_button(String Item) 
	{
	    driver.findElement(By.name("q")).sendKeys(Item);
	   
	}

	@Then("user can see the search Result And user can select any ressult")
	public void user_can_see_the_search_Result_And_user_can_select_any_ressult()
	{

		driver.findElement(By.xpath("//ul[@jsname='erkvQe']//li[3]")).click();
//				List<WebElement>list=driver.findElements(By.xpath("//ul[@jsname='erkvQe']"));
//				Select st=new Select((WebElement) list);
				
//		st.selectByIndex(2);
	   
		 }
	}

