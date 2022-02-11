package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url=("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.get(url);
		System.out.println(driver.getTitle());
		WebElement drop= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drop1=new Select(drop);
		drop1.selectByIndex(3);
		System.out.println(drop1.getFirstSelectedOption().getText());
		drop1.selectByVisibleText("INR");
		System.out.println(drop1.getFirstSelectedOption().getText());

		
		
	}

}
