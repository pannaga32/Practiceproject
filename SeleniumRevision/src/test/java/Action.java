import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		
	WebElement source=driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
	
	WebElement dest=driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
		
	act.clickAndHold(source)
	.moveToElement(dest)
	.release()
	.build()
	.perform();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*right clcik
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[contains(text(),'right click me')]"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/ul[1]/li[5]")).click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		//double click
		Actions act=new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"))).perform();
	
		
		driver.switchTo().alert().accept();*/
		
		
		
		
		
		
		
		
		
		
	}

}
