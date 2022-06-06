package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMPracticePage2 {
	static WebDriver driver=null;
	
	
	
	
	
	 public POMPracticePage2(WebDriver driver) {
		 
				this.driver=driver;
			}
	


	By First_Name=By.name("RESULT_TextField-1");
	By Last_Name=By.name("RESULT_TextField-2");
	By Mobile=By.id("RESULT_TextField-3");
	By Country=By.id("RESULT_TextField-4");
	By City=By.id("RESULT_TextField-5");
	By Email=By.id("RESULT_TextField-6");
	By Upload=By.id("RESULT_FileUpload-10");
	
	
	
	
	public  void firstname(String text1)
	{
		driver.findElement(First_Name).sendKeys(text1);
		
	}
	
	public  void lastname(String text2)
	{
		driver.findElement(Last_Name).sendKeys(text2);
		
	}
	
	public  void number(String num)
	{
		driver.findElement(Mobile).sendKeys(num);
		
	}
	
	public  void place(String text4)
	{
		driver.findElement(Country).sendKeys(text4);
		
	}
	
	public  void town(String text5)
	{
		driver.findElement(City).sendKeys(text5);
		
	}
	
	public  void mail(String text6)
	{
		driver.findElement(Email).sendKeys(text6);
		
	}
	

}
