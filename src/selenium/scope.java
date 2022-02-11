package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElements(By.tagName("a")).size());
		//System.out.println(driver.findElements(By.xpath("//*[@id=\"gf-BIG\"] //li/a")).size());
		WebElement  footer= driver.findElement(By.id("gf-BIG"));
		 System.out.println(footer.findElements(By.tagName("a")).size());
		 WebElement  footer1= driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		 System.out.println(footer1.findElements(By.tagName("a")).size());
		 Actions action=new Actions(driver);
		 for(int i=1;i<(footer1.findElements(By.tagName("a")).size());i++)
		 {
			 String clickon=Keys.chord(Keys.CONTROL,Keys.ENTER);
			 footer1.findElements(By.tagName("a")).get(i).sendKeys(clickon);
			 Thread.sleep(5000);
		 }
			 Set<String>window=driver.getWindowHandles();
			 Iterator<String>it=window.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		 }
		
		
		
		
		
		
		//*[@id="gf-BIG"] //li/a
		
		
		
		
		
		
		
		
		

	}


