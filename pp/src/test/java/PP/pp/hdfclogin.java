package PP.pp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hdfclogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Works\\chromedriver.exe");
//System.setProperty("webdriver.gecko.driver","C:\\Works\\geckodriver.exe");
		
		//ChromeOptions options = new ChromeOptions();
	//	options.addArguments("disable-infobars");
		
		//WebDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver();
//WebDriver driver = new FirefoxDriver();
	driver.get("http://hdfcbank.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("/html/body/div[2]/div/img")).click();
		
	//if(driver.findElement(By.xpath("/html/body/div[2]/div/img")).isDisplayed())
	//	{
		//driver.navigate().refresh();
		driver.findElement(By.xpath("/html/body/div[2]/div/img")).click();
	//}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='loginsubmit'])[1]")).click();
		//homeloginbtn
		
		int i = 1;
		Set<String> cwin=driver.getWindowHandles();
		for(String win:cwin)
		{
			if(i==2)
			{
				driver.switchTo().window(win);
				System.out.println(driver.getTitle());
			} else {
				i++;
			}
		}
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("abcd");
		
	}
	

	

}