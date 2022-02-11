package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sere {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String url="https://jqueryui.com/autocomplete/";
		driver.get(url);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		 driver.switchTo().frame(0);
		//driver.findElement(By.className("ds-input")).sendKeys("ddd");
	    driver.findElement(By.id("tags")).sendKeys("e");

	    List<WebElement> options=driver.findElements(By.className("ui-menu-item-wrapper"));

	    for(WebElement option :options)
	    
	    {
	    	
	    	if(option.getText().equalsIgnoreCase("Erlang"))
	    	          {
	    		
	    	        	option.click();
	    	        	break;
	    	        	
	    	
	    	          }
	    	        }
	    
	   

		
				
		
		
			
		
		
		
		
		
		
		
		
		
		
		

	}
}

