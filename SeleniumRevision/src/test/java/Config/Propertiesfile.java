package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Propertiesfile {

	public static void main(String[] args) {
		
		getproperties();
		setproperties();
		//getproperties();

	}
	public static void getproperties()
	{
		Properties prop=new Properties();
		try
		{
		String projectpath=System.getProperty("user.dir");
		
		InputStream input=new FileInputStream(projectpath+"/src/test/java/Config/Config.Properties");
		prop.load(input);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
		
		
		
	}
	
	public static void setproperties()
	{
		Properties prop=new Properties();
		try
		{
		String projectpath=System.getProperty("user.dir");
		OutputStream output= new FileOutputStream(projectpath+"/src/test/java/Config/Config.Properties");
		prop.setProperty("browser","firefox");
		prop.store(output,null);
		
	}
		 catch(Exception e)
			{
				e.printStackTrace();
				e.getCause();
				e.getMessage();
			}
	
}
}


