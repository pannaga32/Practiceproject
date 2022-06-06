import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) throws InterruptedException 
	{
	

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me to start timer')]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));


		//wait.until(ExpectedConditons.visiblityofElementLocated(By.xpath("")));
		//WebElement element=driver.findElement(By.xpath("//p[text()='WebDriver']"));
		boolean status=element.isDisplayed();
		if(status)
		{
			System.out.println("element is displayed");
		}
		else
		{
			System.out.println("element is not displayed");
		}	
		}
		
		
		
		

	}


