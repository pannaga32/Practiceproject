package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class PropertiesDemo {

	
	
public static void main(String[] args) {

		/*String projectpath=System.getProperty("user.dir");
		System.setProperty("webDriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");*/
		
	

String projectpath=System.getProperty("user.dir");
System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.naukri.com");
driver.manage().window().maximize();

}
}
