package selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rahulcart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
		driver.get(url);
		System.out.println(driver.getTitle());
		// normal array
		//WebDriverWait w= new WebDriverWait(driver,5);
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(""))
		String[] items = { "Cucumber", "Cauliflower", "Beans","Potato" };
		
		additems(driver,items);
		
		//you can calll a method without making an object of thhe same class
		//cart newcart=new cart();
		//newcart.additems(driver, list1);
		//unique css [1] img[alt='Cart']
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//div[@class='action-block']//button[@type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		System.out.println(driver.findElement(By.xpath("//span[@class='totAmt']")).getText());
		System.out.println(driver.findElement(By.xpath("//b[contains(text(),'No. of Items')][1]")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		WebElement sel1 = (driver.findElement(By.xpath("//select[@style='width: 200px;']")));
		Select sel = new Select (sel1);
		
		sel.selectByValue("Bahrain");
		System.out.println(sel.getFirstSelectedOption().getText());
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div")).getText());
		
		
		
			
		
		
		
	}
	public static void additems(WebDriver driver,String[] items)
	{
		int j = 0;
		
		
		List<WebElement> sc = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < sc.size();i++) {
			String[] name = sc.get(i).getText().split("-");
			String name2 = name[0].trim();
			

			/// convert array to list ,list of items
			List list2=Arrays.asList(items);

			if (list2.contains(name2)) 
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j==items.length) 
				{
					break;
				}
			}

		}

	}
	}

	
	
	
	
	