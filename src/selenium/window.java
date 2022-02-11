package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "https://rahulshettyacademy.com/loginpagePractise/#/";
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.cssSelector("a[class='blinkingText']"))).click().build().perform();
		Set<String>window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		String parentId=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		String email=(driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0]);
		
		System.out.println(email);
		
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(email);
		WebElement type =driver.findElement(By.cssSelector("select[class='form-control']"));
		Select user= new Select(type);
		user.selectByValue("consult");
		System.out.println(user.getFirstSelectedOption().getText());
		
		
		
		
		
		
		
		
		
		
		

	}

}
