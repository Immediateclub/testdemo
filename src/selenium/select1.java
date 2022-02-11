package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class select1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://rahulshettyacademy.com/dropdownsPractise/";
		driver.get(url);
		System.out.println(driver.getTitle());
		WebElement drp =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//select practice
		Select drp1=new Select(drp);
		System.out.println(drp1.getFirstSelectedOption().getText());
		drp1.selectByValue("AED");
		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
		System.out.println(drp1.getFirstSelectedOption().getText());
		//Thread.sleep(3000);
		driver.findElement(By.id("divpaxinfo")).click();
		WebElement bt1 = driver.findElement(By.id("hrefIncAdt"));
		WebElement bt2 = driver.findElement(By.id("hrefIncChd"));
		//WebElement bt1 = driver.findElement(By.id("hrefIncAdt"));
		Thread.sleep(3000);
		
		for (int i=1;i<4;i++)
		{bt1.click();}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
		for(int u=0;u<4;u++)
		{bt2.click();}
		
		System.out.println("this the passenger count :  "+(driver.findElement(By.id("divpaxinfo")).getText()));
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BHO']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='HBX']"))).click();
		//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='IXE']
		
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> dd= driver.findElements(By.className("ui-menu-item"));
		
		for (WebElement option :dd)
		
			if (option.getText().equalsIgnoreCase("Indonesia"))
			{
				option.click();
				System.out.println("good job");
				break;
			
		
		
			}
			else {
				System.out.println("try again");
			}
			
		Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
		   
	    driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
	    Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
            }

	}


