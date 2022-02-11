package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class javaexecuterscroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String url = "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement>list =driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		System.out.println(list.size());
		int sum=0;
		for(int i=0;i<list.size();i++)
		{
			
			sum=sum+ Integer.parseInt(list.get(i).getText());
			
		}
		System.out.println(sum);
			int total=Integer.parseInt(driver.findElement(By.cssSelector("[class=\"totalAmount\"]")).getText().split(":")[1].trim());
			
			Assert.assertEquals(sum, total);
			
			
			
			
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


