import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PriorityExample {

	
	
	@Test
	
	
	public static void Two() throws InterruptedException
	{
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Login")).click();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys("pannaga_1234");
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/form[1]/div[3]/input[1]")).sendKeys("Tosca@123");
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/form[1]/div[6]/button[1]")).click();
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.xpath("//div[contains(text(),'My Naukri')]"));
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		driver.close();
		
		
	}
	@Test(priority=1)
	public static void One()
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("uid")).sendKeys("mngr410545");
		driver.findElement(By.name("password")).sendKeys("ejYryhy");
		
		driver.findElement(By.name("btnLogin")).click();
		
		driver.findElement(By.linkText("Log out")).click();
		driver.switchTo().alert().accept();
		driver.close();
		
	}
	
}
