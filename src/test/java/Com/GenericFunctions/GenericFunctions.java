package Com.GenericFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Com.ReadExcel.ReadExcel;

public class GenericFunctions extends ReadExcel {
	
	public static WebDriver driver;
	
	
		public static boolean Launch_App()
		{
			boolean status=true;
			
			try
			{
			driver= new FirefoxDriver();
			driver.get(getCommonTestData("url"));
			System.out.println("Application launched successfully");
			//driver.get(getCommonTestData("Url"));
			
			}
			
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("unable to launch application");
				status=false;
			}
			
			return status;
			
			
		
	}
	
	

}
