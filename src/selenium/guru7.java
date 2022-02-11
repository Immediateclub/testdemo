package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		String url =("https://www.guru99.com/");
		String url2 =("https://www.microsoft.com");
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println (driver.getTitle());
		driver.navigate().to(url2);
		System.out.println(driver.getTitle());
		//driver.navigate().back();
		
		if (driver.getTitle().equals("Meet Guru99 – Free Training Tutorials & Video for2 IT Courses")) { System.out.println("good job");
		} else {System.out.println("check again idiot");
		
		}
		
		
		
	}

}
