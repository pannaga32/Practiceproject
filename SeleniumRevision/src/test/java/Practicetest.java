import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practicetest {
	
public static void main(String args[]) throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	
	
	
	driver.get("http://automationpractice.com");
	driver.manage().window().maximize();
	
	
	/*/ drop down 
	driver.findElement(By.linkText("Sign in")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("email_create")).sendKeys("pannaga_22@yahoo.co.in");
	driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")).click();
	Thread.sleep(5000);
			

	WebElement element=driver.findElement(By.id("days"));
	Select s1=new Select(element);
	s1.selectByIndex(17);
	
	WebElement element2=driver.findElement(By.id("months"));
	Select s2=new Select(element2);
	s2.selectByValue("2");
	
	
	WebElement element3=driver.findElement(By.id("years"));
	Select s3=new Select(element3);
	s2.selectByVisibleText("2021");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*browser navigation method
	driver.findElement(By.name("q")).sendKeys("Optus 5g");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	
	driver.navigate().back();
	System.out.println("Back is working");
	Thread.sleep(5000);
	driver.navigate().forward();
	System.out.println("Forward  is working");
	Thread.sleep(5000);
	
	driver.navigate().refresh();
	System.out.println("refresh  is working");
	Thread.sleep(5000);
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//web driver methods
	/*String title=driver.getTitle();
	System.out.println(title);
	System.out.println(driver.getCurrentUrl());
	
	WebElement unm=driver.findElement(By.id("email"));
	System.out.println(unm.getAttribute(""));
	
	
	
	
	
	/*driver.findElement(By.id("email")).sendKeys("pannaga_22@yahoo.co.in");
	
	driver.findElement(By.id("pass")).sendKeys("Queen@123");
	
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(4000);
	
	//driver.close();*/
	
	
}

}
