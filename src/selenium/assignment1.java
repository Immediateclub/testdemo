package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url = "https://chercher.tech/practice/explicit-wait";
		driver.get(url);
		System.out.println(driver.getTitle());
		WebDriverWait w= new WebDriverWait(driver,5);

		driver.findElement(By.id("populate-text")).click();
		w.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//h2[@id='h2']"),"site"));
		System.out.println(driver.findElement(By.xpath("//h2[@id='h2']")).getText());
		
		
		
		

	}

}
