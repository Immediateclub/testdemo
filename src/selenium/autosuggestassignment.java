package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autosuggestassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String url = "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
		Actions action=new Actions(driver);
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys("ind");
		
		 action.moveToElement(driver.findElement(By.cssSelector("[class=\"ui-menu-item-wrapper\"]"))).sendKeys(Keys.ARROW_DOWN).build().perform();
		 Thread.sleep(3000);
         
		
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
