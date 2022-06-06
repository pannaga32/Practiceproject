

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.POMPracticePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POMTest {
	static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		
		Test();
		
	}
	
		
		public static void Test() throws InterruptedException
		{
			
			WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
			
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);

			driver.switchTo().frame("frame-one1434677811");
			
			POMPracticePage.First_name(driver).sendKeys("Pannaga");
			POMPracticePage.Last_name(driver).sendKeys("Jamadagni");
			POMPracticePage.Phone(driver).sendKeys("0123456789");
			POMPracticePage.Country(driver).sendKeys("India");
			POMPracticePage.City(driver).sendKeys("Mysore");
			POMPracticePage.Email(driver).sendKeys("pannaga_22@yahoo.co.in");
			
		}
		
	}
	
	
	
	
	


