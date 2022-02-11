package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testguru {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("name");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("11");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		WebElement Btn = driver.findElement(By.className("signInBtn"));
		Btn.click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.quit();	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
