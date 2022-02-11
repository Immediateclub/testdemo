package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "https://jqueryui.com/droppable/";
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		WebElement drag=driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement drop=driver.findElement(By.cssSelector("div[id='droppable']"));
		action.dragAndDrop(drag,drop).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
