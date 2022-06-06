package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POMPracticePage {


	static WebElement element=null;


	public static WebElement First_Name(WebDriver driver)
	{

		element=driver.findElement(By.name("RESULT_TextField-1"));
		return element;
	}

	public static WebElement Last_Name(WebDriver driver)
	{

		element=driver.findElement(By.name("RESULT_TextField-2"));
		return element;
	}

	public static WebElement Mobile(WebDriver driver)
	{

		element=driver.findElement(By.id("RESULT_TextField-3"));
		return element;
	}

	public static WebElement Country(WebDriver driver)
	{

		element=driver.findElement(By.id("RESULT_TextField-4"));
		return element;
	}

	public static WebElement City(WebDriver driver)
	{

		element=driver.findElement(By.id("RESULT_TextField-5"));
		return element;
	}
	public static WebElement Email(WebDriver driver)
	{

		element=driver.findElement(By.id("RESULT_TextField-6"));
		return element;
	}
	
	public static WebElement Upload(WebDriver driver)
	{

		element=driver.findElement(By.id("RESULT_FileUpload-10"));
		return element;
	}
	
	





}













































/*driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.switchTo().frame("frame-one1434677811");

		Thread.sleep(5000);

		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Pannaga");

		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("Jamadagni");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("0123456789");

		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");

		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Mysore");

		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("pannaga_22@yahoo.co.on");

		//WebDriverWait wait=new WebDriverWait(driver,30);
		//WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.id("RESULT_RadioButton-7_1")));

Thread.sleep(5000);

		WebElement element=driver.findElement(By.id("RESULT_RadioButton-9"));

		Select obj=new Select(element);
		obj.selectByValue("Radio-1");
		System.out.println("drop down selected");

		Thread.sleep(5000);

		driver.findElement(By.id("RESULT_FileUpload-10")).sendKeys("C:\\Users\\user1\\Documents\\sample.docx");


		//driver.findElement(By.id("RESULT_CheckBox-8_2")).click();*/




