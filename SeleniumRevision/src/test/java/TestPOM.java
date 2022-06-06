import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.POMPracticePage;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestPOM {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.switchTo().frame("frame-one1434677811");

		Thread.sleep(5000);
		POMPracticePage.First_Name(driver).sendKeys("Pannaga");
		POMPracticePage.Last_Name(driver).sendKeys("Jamadagni");
		POMPracticePage.Mobile(driver).sendKeys("0123456789");
		POMPracticePage.Country(driver).sendKeys("India");
		POMPracticePage.City(driver).sendKeys("Mysore");
		
		POMPracticePage.Email(driver).sendKeys("pannaga32@yahoo.com");
		
		//POMPracticePage.Upload(driver).sendKeys("C:\\Users\\user1\\Documents\\sample.docx");
		
	}

		

	}


