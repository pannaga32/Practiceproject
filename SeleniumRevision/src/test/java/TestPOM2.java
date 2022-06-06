import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.POMPracticePage2;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPOM2 {
	static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		POMtest();
		
	}
	
	public static void POMtest() throws InterruptedException
	{
WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame-one1434677811");

		Thread.sleep(5000);
		
		
		POMPracticePage2 Obj=new POMPracticePage2(driver); 
		Obj.firstname("Pannaga");
		Obj.lastname("Jamadagni");
		Obj.number("9880300340");
		Obj.place("Karnataka");
		Obj.town("Mysore");
		Obj.mail("pannaga32@yahoo.com");
	
		
	}

}
