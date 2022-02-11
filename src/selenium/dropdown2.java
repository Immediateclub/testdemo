package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url=("https://rahulshettyacademy.com/dropdownsPractise/");
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		System.out.println(driver.getTitle());
		
		  driver.findElement(By.id("divpaxinfo")).click();
		  Thread.sleep(2000);
		  WebElement sel=driver.findElement(By.id("hrefIncAdt"));
		  WebElement sel1=driver.findElement(By.id("hrefIncChd"));
		  WebElement done=driver.findElement(By.id("btnclosepaxoption"));
		  System.out.println(("number of adults : ")+driver.findElement(By.id("divpaxinfo")).getText());
		  //int i=1;
		  //another waay of doing that is For  (int i=1;i<5;i++)
		//while (i<5)
		  for (int i=1;i<5;i++)
		{		  sel.click();
				  //i++;
				  
		}		  
		  System.out.println(("number of adults : ")+driver.findElement(By.id("divpaxinfo")).getText());
	
		//sel1.clear();
		//done.click();
		
		
		
		

	}

}
