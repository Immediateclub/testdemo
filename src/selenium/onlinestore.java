package selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class onlinestore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "https://www.dickssportinggoods.com/search/SearchDisplay?searchTerm=NIke&storeId=15108&catalogId=12301&langId=-1&sType=SimpleSearch&resultCatEntryType=2&showResultsPage=true&fromPage=Search&searchSource=Q&pageView=&beginIndex=0&DSGsearchType=Keyword&pageSize=48";
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
		Actions action = new Actions(driver);
		int a=0;
		driver.findElement(By.xpath("//label[@id='5495_facet_value_Women_s']")).click();
		List<WebElement> items=driver.findElements(By.xpath("//a[@class='rs_product_description d-block']"));
		String[]names= {"Nike Women's Pro 3” Shorts","Nike Men's Air Max SC Shoes","Nike Women's Air Zoom Pegasus 38 Running Shoes","Nike Kyrie Low 4 Basketball Shoes","Nike Men's Therma Pants"};
		for (int i=0;i<items.size();i++) {
			
			String items1=items.get(i).getText();
			System.out.println(items.get(i).getText());
			
			List names1=Arrays.asList(names);
			
			if(names1.contains(items1)) {
				
				a++;
				driver.findElements(By.xpath("//span[@class='dsg-flex align-items-center']")).get(i).click();
				
				if(a==names.length) {
					
					break;
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}

		
		
		
		
		
		
		
		
		//driver.findElements(By.xpath("//span[@class='dsg-flex align-items-center']")).click();
		
		
		
		
		//mngr379569
		//Ajejade
		
		
		
		

	}

}
