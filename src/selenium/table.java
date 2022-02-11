package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

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
		//js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement>list =driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td[3]"));
		System.out.println(list.size());
		int sum=0;
		for(int i=0;i<list.size();i++)
		{
			int sum1=sum=sum+ Integer.parseInt(list.get(i).getText());
			
			
		}
		int total=sum;
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//table[@name='courses']/tbody/tr/td[3]

	}

}
