package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class scopeassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "http://www.qaclickacademy.com/";
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"homepage\"]/div[4]/div[2]/div/div/div/span/div/div[6]/div/div/button")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Practice']")).click();
		driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).click();
		
		Thread.sleep(3000);
		Select drop= new Select(driver.findElement(By.cssSelector("select[id='dropdown-class-example']")));
		drop.selectByVisibleText(driver.findElement(By.cssSelector("label[for='honda']")).getText());
		
			
		
		//1 select one checkbox
		//2 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
