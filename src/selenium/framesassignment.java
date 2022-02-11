package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "https://the-internet.herokuapp.com/";
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[@href=\"/nested_frames\"]")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
