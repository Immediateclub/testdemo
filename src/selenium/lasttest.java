package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lasttest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("[id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='HBX']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='COK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[6]/a")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();					
		
		
		
		
		
		
		
		

	}

}
