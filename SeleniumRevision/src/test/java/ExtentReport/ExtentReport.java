package ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ExtentHtmlReporter htmlreporter=new ExtentHtmlReporter("exrentreports.html");
		
		ExtentReports extent=new ExtentReports();
		
		extent.attachReporter(htmlreporter);
		
		ExtentTest test=extent.createTest("createting atest");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		test.pass("invoked the url successfully");
		
		driver.findElement(By.name("firstname")).sendKeys("Pannaga");
		
		
		driver.findElement(By.name("lastname")).sendKeys("Jamadagni");
		
		test.pass("entered the first name and lastname");
		
		driver.findElement(By.id("sex-1")).click();
		test.pass("entered the gender");
		
		driver.findElement(By.id("exp-6")).click();
		test.pass("entered the experience");
		
		driver.findElement(By.id("datepicker")).sendKeys("17/11/1990");
		test.pass("entered the date");
		Thread.sleep(4000);
		
		driver.close();
		test.pass("closed the browser successfully");
		
		extent.flush();
		
		
		
		
		
		
	}
	
	
		
		
		
	}
	
	