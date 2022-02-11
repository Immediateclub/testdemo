package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class callender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "https://rahulshettyacademy.com/dropdownsPractise/";
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("button[type='button']")).click();
		//gra common attribute ,,put it into list and iterate
		List<WebElement> date=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr/td/a[@class='ui-state-default']"));
		System.out.println(date.size());
		int count=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr/td/a[@class='ui-state-default']")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr/td/a[@class='ui-state-default']")).get(i).getText();
			if(text.equalsIgnoreCase("28"))
			{
				driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr/td/a[@class='ui-state-default']")).get(i).click();
				break;
				
			}
		}
		
		th[class='ui-datepicker-week-end']
		
		//td[@data-handler='selectDay']
		
		//date//*[@id="ui-datepicker-div"]/div[2]/table/thead/tr/th[1]
		
		//div[@class='ui-datepicker-group ui-datepicker-group-last']
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
