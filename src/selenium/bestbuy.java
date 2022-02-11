package selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bestbuy {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url = "https://www.bestbuy.com/site/promo/laptop-and-computer-deals";
		Thread.sleep(3000);
		driver.get(url);
		int a=0;
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@class='us-link']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='sku-title']"));
		String [] name= { "Logitech - M325 Wireless Optical Mouse with Ambidextrous design - Silver","Samsung - 980 PRO 2TB PCIe Gen 4 x4 NVMe Gaming Internal Solid State Drive","WD - Easystore 2TB External USB 3.0 Portable Hard Drive - Black"};
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			
			///make the List<WebElement> a string 
			String web=list.get(i).getText();
			
			List list1=Arrays.asList(name);
			
			if (list1.contains(web)) {
				a++;
				driver.findElements(By.xpath("//button[@style='padding:0 8px']")).get(i).click();
				if (a==web.length()){
					break;
				}
				
				
			}
		}
		
		
	
		
	
	}	
			
			
	
		
					
///,InterruptedException

		
			
			
			
			
		}	

		


	

