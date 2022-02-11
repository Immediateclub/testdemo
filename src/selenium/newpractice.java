package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "d:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://rahulshettyacademy.com/seleniumPractise/#/";
		driver.get(url);
		driver.getTitle();
		List<WebElement> list=driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
			
		}
		
		
		

	}

}
