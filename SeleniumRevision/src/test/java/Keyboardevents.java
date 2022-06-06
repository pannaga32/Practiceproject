import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboardevents {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		

	
		
		
		
		
		
		
		
		
		/*driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Pannaga");
		driver.findElement(By.xpath("//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[1]/p[2]/input[1]")).sendKeys("Jamadagni");;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/form[1]/fieldset[2]/div[1]/label[1]")).click();
		
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/form[1]/fieldset[3]/div[1]/label[2]")).click();
		
		driver.findElement(By.name("phone")).sendKeys("8197025222");
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.name("username")).sendKeys("pannaga_johny");
		act.sendKeys(Keys.TAB)
	
		.sendKeys("pannaga_22@yahoo.co.in")
		.build()
		.perform();
		
		driver.findElement(By.xpath("//body/section[@id='wrapper']/div[1]/div[1]/div[1]/form[1]/fieldset[9]/input[1]"))
		.sendKeys("C:\\Users\\user1\\Desktop\\New folder\\sample doc.docx");*/
	}

}
