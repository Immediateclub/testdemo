package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html";
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("[id='datepicker']")).click();
		List<WebElement> dates=driver.findElements(By.cssSelector("[data-handler='selectDay']"));
		while(!driver.findElement(By.cssSelector("[class='ui-datepicker-month']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		
		int count= driver.findElements(By.cssSelector("[data-handler='selectDay']")).size();
		
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.cssSelector("[data-handler='selectDay']")).get(i).getText();
			if (text.equalsIgnoreCase("21"))
			{
				driver.findElements(By.cssSelector("[data-handler='selectDay']")).get(i).click();
				break;
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	[data-handler='selectDay']

	}

}
