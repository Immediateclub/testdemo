package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class enabledornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
	    {
	    	System.out.println("ok");
	    	Assert.assertFalse(true);
	    }
	    else
	    {
	    	System.out.println("not ok");
	    	Assert.assertTrue(false);
	    }
		

	}

}
