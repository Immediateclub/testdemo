package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test888 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="https://rahulshettyacademy.com/dropdownsPractise/";
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXJ']")).click();
		
		

		
		
		
		
		
		
		
		
		
	}

}
