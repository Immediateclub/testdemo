package selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
	
public class test67 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://best.aliexpress.com/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.xpath("/html/body/div[9]/div/div/img[2]")).click();
		driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div[3]/div[2]")).click();
	 //   driver.findElement(By.id("search-key")).sendKeys("pants");
	 //   driver.findElement(By.className("search-button")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"home-firstscreen\"]/div/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[1]/span")).click();
	
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"batman-dialog-wrap\"]/div/div/div[1]/div[2]/div/div/div/div[3]/span[1]/span[1]/input")).sendKeys("sffsfs@gmail.com");

	    driver.findElement(By.xpath("//*[@id=\"batman-dialog-wrap\"]/div/div/div[1]/div[2]/div/div/div/div[4]/span/span[1]/input")).sendKeys("dsdrere");
	    WebElement Btn = driver.findElement(By.xpath("//*[@id=\"batman-dialog-wrap\"]/div/div/div[1]/div[2]/div/div/div/button/span"));
	    Btn.click();
	    
	   System.out.println(driver.findElement(By.xpath("//*[@id=\"batman-dialog-wrap\"]/div/div/div[1]/div[2]/div/div/div/div[3]/span[2]")).getText());
	    driver.findElement(By.className("fm-email-signin")).click();
		
		

		
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
