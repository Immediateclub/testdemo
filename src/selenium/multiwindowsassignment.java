package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multiwindowsassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "https://the-internet.herokuapp.com/";
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.cssSelector("a[href$='/windows']"))).click().build().perform();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Set<String>window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		String parentId=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
