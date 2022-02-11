package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "d:\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		String url = "https://www.amazon.com/";
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
		int a=0;
		//driver.findElement(By.cssSelector("input[type='search']")).sendKeys("sofa");
		//driver.findElement(By.cssSelector("#frmQuickSearch > section > button > svg")).click();
		//span[class='description-spn']
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("span[class='nav-line-2 ']"))).build().perform();
		action.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("play").keyUp(Keys.SHIFT).doubleClick().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
