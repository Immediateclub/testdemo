package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru4 {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         Thread.sleep(2000);
         driver.get(baseUrl);
         System.out.println(driver.getTitle());
         driver.findElement(By.cssSelector("svg")).click();
  		if (driver.getTitle().equals("Facebook - log in or sign up")) {							
             System.out.println("We are back at Facebook's homepage");					
         } else {			
             System.out.println("We are NOT in Facebook's homepage");					
         }	
          
          
        
         
	
	}

}
