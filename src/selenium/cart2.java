package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://automationpractice.com/index.php";
		driver.get(url);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@class='search_query form-control ac_input']")).sendKeys("dress");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		List<WebElement> l1=driver.findElements(By.xpath("//h5[@itemprop='name']"));
		String [] list1 = {"Printed Summer Dress","Printed Summer Dress","Printed Chiffon Dress","Printed Dress","Printed Dress","Faded Short Sleeve T-shirts","Blouse"};
		//here is the new namelist with names its a condition 
		          int j=0;
				for (int i=0;i<l1.size();i++) 
					//System.out.println(l1.get(i).getText());
					Thread.sleep(3000);
		

		System.out.println(driver.findElement(By.xpath("//a[@title='Add to cart']")).isDisplayed());
		
	   for (int a=0;a<l1.size();a++) {
			String name=l1.get(a).getText();
			String name2=name;
			
		
		//convert list to arraylist
		List list2=Arrays.asList(list1);
		
		//center_column
		
		if (list2.contains("Blouse"))
		{
			//j++;
		 driver.findElement(By.xpath("//a[@title='Add to cart']")).click();
		//*[@id="center_column"]/ul/li[7]/div/div[2]/div[2]/a[1]
		//*[@id=\"center_column\"]/ul/li[7]/div/div[2]/div[2]/a[1]/span
			//div[@class='button-container']
			//a[@title='Add to cart']
	   //*[@id="center_column"]/ul/li[1]/div/div[2]/div[2]/a[1]/span
		 //if (j==list1.length) 
			 
		 {	 
		break;
		}
		     
			
			
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		}

	}

}
