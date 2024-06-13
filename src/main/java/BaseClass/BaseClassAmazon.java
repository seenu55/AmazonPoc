package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassAmazon {
	public static WebDriver driver;
	
	public static void BroswerLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	public static void getURL(String url) {
		driver.get(url);
	}

}
