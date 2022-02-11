package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamicdrops {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url="https://rahulshettyacademy.com/dropdownsPractise/";
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println(driver.getTitle());
		WebElement  bt1= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		System.out.println(("this is the main currency list :  ")+bt1.getText());
		Select drp=new Select (bt1);
		System.out.println(("this is the first option  :  ")+drp.getFirstSelectedOption().getText());
		drp.selectByIndex(3);
		System.out.println(("this is the currency :  ")+drp.getFirstSelectedOption().getText());
		 WebElement aa = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select a1 = new Select (aa);
		WebElement btt1=driver.findElement(By.id("divpaxinfo"));
		WebElement bt2=driver.findElement(By.id("hrefIncAdt"));
		WebElement bt3=driver.findElement(By.id("hrefIncChd"));
		WebElement done=driver.findElement(By.id("btnclosepaxoption"));
		
		btt1.click();
		Thread.sleep(3000);
		
		for (int i=1;i<5;i++)
		{bt2.click();
		}
		
		for (int a=1;a<4;a++)
		{bt3.click();
		}
		
	
		System.out.println(("this is the passenger count : ")+a1.getFirstSelectedOption().getText());
		System.out.println(("this is the child count  : ")+driver.findElement(By.id("childDropdown")).getText());
		System.out.println(("this is the passenger count   : ")+btt1.getText());
		done.click();
		
		
		
		

	}

}
