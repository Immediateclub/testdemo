package selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cartstore {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		String url = "http://automationpractice.com/index.php";
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@class='search_query form-control ac_input']")).sendKeys("dress");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();

		int b = 0;

		///// div/a/img[@class='replace-2x img-responsive']

		List<WebElement> l1 = driver.findElements(By.xpath("//h5[@itemprop='name']"));
		String[] list1 = { "Printed Summer Dress", "Printed Summer Dress", "Printed Chiffon Dress", "Printed Dress","Printed Dress", "Faded Short Sleeve T-shirts", "Blouse" };
				
		System.out.println(l1.size());

		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i).getText());
			String webitems = l1.get(i).getText();

			List list2 = Arrays.asList(list1);

			if (list2.contains(webitems))
				

			{

				b++;
				driver.findElements(By.xpath("//div/a[@title='Add to cart']/span")).get(i).click();
				driver.findElement(By.xpath("//div/span[@class='cross']")).click();
				
			if(b==list1.length) {
					driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
				}
					
		
			
				//driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

				{

				}
			}
		}
	}

}
