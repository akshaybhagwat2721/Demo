package Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ak {
	public static void main( String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
	}

	 
	}


