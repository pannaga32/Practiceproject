package ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();

WebDriver driver=new ChromeDriver();


driver.get("http://automationpractice.com/index.php");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.linkText("Sign in")).click();





	}

}
