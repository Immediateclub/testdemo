package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bil {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String url="https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(url);
		System.out.println(driver.getTitle());
/// drop suggestion
		driver.findElement(By.id("autosuggest")).sendKeys("ar");
		Thread.sleep(2000);
		List<WebElement> dd = driver.findElements(By.className("ui-menu-item"));
		for(WebElement option :dd)
		
		{
			if (option.getText().equalsIgnoreCase("Argentina"))
			{
				option.click();
				break;
			
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
