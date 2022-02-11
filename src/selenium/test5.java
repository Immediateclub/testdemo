package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //set the driver path
		System.setProperty("webdriver.chrome.driver", "D:\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open the url
		driver.get("https://demoqa.com/login");
		//maximize window
		driver.manage().window().maximize();
		//retrive title page
		String title = driver.getTitle();
		//
		System.out.println("the title of this page : " +title);
		
		
		WebElement user = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id='login']"));
		
		user.sendKeys("testuser");
		pass.sendKeys("password@123");
		loginBtn.click();
		
		
		
try {
			
			//Locating web element
			WebElement logoutBtn = driver.findElement(By.xpath("//button[@id='submit']"));
			//Validating presence of element				
			if(logoutBtn.isDisplayed()){
				
				//Performing action on web element
				logoutBtn.click();
				System.out.println("LogOut Successful!");
			}
}
		 
		catch (Exception e) {
			
			System.out.println("Incorrect login....");
			
		
		}
		
		
		
		
		//Closing browser session
		driver.quit();
			 
			 

		}
		
	   
}
	

	
