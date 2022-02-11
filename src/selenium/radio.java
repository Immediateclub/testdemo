package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    String url="https://rahulshettyacademy.com/dropdownsPractise/";
	    driver.get(url);
	    System.out.println(driver.getTitle());
	    //driver.switchTo().frame(0);
	   Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
	   
	    driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
	    Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
	    
	    
	    
	    	
	    	

	}

}
