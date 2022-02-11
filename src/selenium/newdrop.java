package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String url="https://jqueryui.com/autocomplete/";
		driver.get(url);
		System.out.println(driver.getTitle());
/// drop suggestion
		driver.switchTo().frame(0);
		driver.findElement(By.id("tags")).sendKeys("a");
		Thread.sleep(2000);
		List<WebElement> dd = driver.findElements(By.className("ui-menu-item"));
		for(WebElement option :dd)
		
		{
			if (option.getText().equalsIgnoreCase("Asp"))
			{
				option.click();
				break;
			
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
