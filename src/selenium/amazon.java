package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String url="https://www.amazon.com/";
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);

		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		

		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("ali");
		
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		//List<WebElement> aa= driver.findElements(By.cssSelector("div[id='nav-flyout-searchAjax']"));
		//for (WebElement option :aa)
		//
		//if (option.getText().equalsIgnoreCase("alimentum formula"));
	//	{
		//	option.click();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
