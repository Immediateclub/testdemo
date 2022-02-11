package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class assigment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url= "http://automationpractice.com/index.php";
		driver.get(url);
        System.out.println(driver.getTitle());
        //driver.switchTo().frame(0);
        //Thread.sleep(2000);
        //System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().alert().dismiss();
       // driver.findElement(By.xpath("//button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']")).click();
		//driver.findElement(By.id("dateSelector")).click();
        driver.findElement(By.id("search_query_top")).sendKeys("dress");
        driver.findElement(By.name("submit_search")).click();
        WebElement drp=driver.findElement(By.id("selectProductSort"));
        Select drp1=new Select(drp);
        drp1.selectByValue("price:desc");
        driver.findElements(By.xpath("//*[@id=\"center_column\"]/ul"));
        //List<WebElement> dd= driver.findElements(By.xpath("//*[@id=\"center_column\"]/ul"));
        //for(WebElement option :dd)
        	 //System.out.println(option.
        	//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[2]/div[2]/a[1]/span[1]")).click();
        //data-id-product=6
        	Thread.sleep(3000);
        	//driver.findElement(By.className("icon-chevron-right right")).click();
        	driver.findElement(By.xpath("//a[@id='color_13']")).click();
        	driver.findElement(By.className("icon-plus")).click();
        	WebElement  sz = driver.findElement(By.id("group_1"));
        	int a=6;
        	Select sz1= new Select(sz);
        	sz1.selectByValue("2");
        	driver.findElement(By.id("add_to_cart")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//div[@id='layer_cart'] //span[@class='cross']")).click();
        	Thread.sleep(3000);
        	driver.navigate().back();
        	driver.navigate().back();
        	//driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
        	//driver.findElement(By.className("icon-plus")).click();
        	//driver.switchTo().alert().dismiss();
        	driver.findElement(By.id("color_34")).click();
        	WebElement  sz2 = driver.findElement(By.id("group_1"));
        	Select sz3= new Select(sz2);
        	sz3.selectByValue("3");
        	driver.findElement(By.className("icon-plus")).click();
        	
        	driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
        	
        	//*[@id="add_to_cart"]/button/span
        	
        	/////span[text()='$26.00']
        
      //a[@title='Printed Summer Dress']
        		
        		//ul[@class='product_list grid row'] //a[@title='Printed Summer Dress']
        

        	
		
		
		
		
		
		
		
		
		
	}

}
