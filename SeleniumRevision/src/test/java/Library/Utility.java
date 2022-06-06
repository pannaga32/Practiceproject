package Library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	
	public static void capturescreenshot(WebDriver driver) {
		try
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshot/practice.png"));
		System.out.println("Screenshot taken");
		//driver.close();
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		}
		
	}
	
	
	
}
