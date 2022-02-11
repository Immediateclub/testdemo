package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleartrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://me.cleartrip.com/";
		driver.get(url);
		System.out.println(driver.getTitle());
		//driver.findElement(By.className("DayPicker-Day DayPicker-Day--start DayPicker-Day--selected")).click();
		driver.findElement(By.className("bc-neutral-100 bg-transparent"));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
