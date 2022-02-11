package selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cartstore2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "https://www.saucedemo.com/inventory.html";
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
		int a=0;
		driver.findElement(By.cssSelector("input[placeholder=Username]")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[placeholder=Password]")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		String [] items= {"Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Test.allTheThings() T-Shirt (Red)","Sauce Labs Onesie","Sauce Labs Fleece Jacket"};
		
		for (int i=0;i<list.size();) {
			
		String items2=list.get(i).getText();
		
		List items1=Arrays.asList(items);
		
		if(items1.contains(items2)) {
			a++;
			driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).get(i).click();
			
			if (a==items.length) {
				break;
			}
		}
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
