package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		System.out.println("number of culums: " +driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size());
		System.out.println("number of rows: " +driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
