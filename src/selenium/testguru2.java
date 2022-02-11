package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testguru2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(000);
		System.setProperty("webdriver.chrome.driver","D:\\drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		System.out.println(driver.getTitle());
		Select drp= new Select (driver.findElement(By.name("country"))); 
		
		drp.selectByValue("ARUBA");
		
		
		System.out.println ("this is the country :"+(drp));
		
		//driver.quit();
	}

}
