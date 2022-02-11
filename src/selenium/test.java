package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test {

	public static void main(String[] args) {
		// invoking the browser
		//ChromeDriver.exe->value path
        System.setProperty("webdriver.edge.driver", "D:\\drivers/msedgedriver.exe");
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();}
		
		
		
	{ System.setProperty("webdriver.chrome.driver", "D:\\drivers/chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.quit(); 
		

	}

}
