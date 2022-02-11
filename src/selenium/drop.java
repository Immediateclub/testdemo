package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///child parent lesson 
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String url="https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		//driver.findElement(By.id("glsctl00_mainContent_ddl_originStation1_CTNR")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GWL']")).click();
		driver.findElement(By.xpath("//*[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value='BOM']")).click();
		
		
		
		

	}

}
