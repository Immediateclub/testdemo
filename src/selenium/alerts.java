package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("enter-name")).sendKeys("bilal");
		//for css  first[] then attrbute =value 
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		// switch from browser to alerts
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		
		
		

	}

}
