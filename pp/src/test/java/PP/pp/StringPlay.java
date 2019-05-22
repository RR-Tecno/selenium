package PP.pp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StringPlay
{
	
	@Test
	public void login() throws InterruptedException
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\Works\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
System.setProperty("webdriver.chrome.driver","C:\\\\Works\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		WebDriver driver = new ChromeDriver(options);
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
	
	
	
	
	
	
	
	
	
	
	public void countCharacter(String word)
	{
		int count=1;
		HashMap<Character, Integer> hp=new HashMap<Character, Integer>();
		for(Character c:word.toCharArray())
		{
			if(hp.containsKey(c))
			{
			hp.put(c,++count);
			}
			else
			{
				hp.put(c, 1);
			}
		}
		Iterator i=hp.entrySet().iterator();
		while(i.hasNext())
		{
			Entry e=(Entry)i.next();
			System.out.println("key is "+e.getKey()+" value is "+e.getValue());
		}
	}

	@Test
	public void test1()
	{
		countCharacter("hello");
	}
}
