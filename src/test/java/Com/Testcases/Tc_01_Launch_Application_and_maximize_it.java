package Com.Testcases;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.GenericFunctions.GenericFunctions;
import Com.Screenshot.Login;

public class Tc_01_Launch_Application_and_maximize_it extends GenericFunctions {
	
@Test
	
	public static void validatelogin_panel()
	{
	boolean status;
	status=Launch_App();
	
	if(status)
	{
		System.out.println("Enter credentials");
	
		connect_To_Excel();
	Login lgn=PageFactory.initElements(driver, Login.class);
	lgn.enterCredentials();
	
	
	
	}
	
	

	
	
	
	
	
	
}

}
