package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class fluentwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url = "https://the-internet.herokuapp.com/dynamic_loading/1";
		driver.get(url);
		System.out.println(driver.getTitle());
		WebDriverWait w= new WebDriverWait(driver,5);
		if(driver.getTitle().equalsIgnoreCase("The Internet"))
	    
			
			
		{
			System.out.println("good job");
		}

		else
		{
			System.out.println("wrong");
		}
		//the system does not know that wait is a driver you shoult tell it  its ad river and then point to driver
		//Wait<WebDriver>wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("[id=start] button")).click();
		w.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"finish\"]/h4"),"Hello World!"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).getText());
		
		
		
		
		//[id='finish']
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
