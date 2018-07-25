package Com.Screenshot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Com.GenericFunctions.GenericFunctions;
import Com.ReadExcel.ReadExcel;

public class Login extends ReadExcel {
	
	@FindBy(how=How.ID, using="txtUsername")
	public static WebElement Edi_login_username;
	
	@FindBy(how=How.ID, using="txtPassword")
	public static WebElement Edi_login_Password;
	
	@FindBy(how=How.ID, using="btnLogin")
	public static WebElement Edi_login_Login;
	
	public static Boolean enterCredentials()
	{
		boolean status=true;
		
		try
		{
			Edi_login_username.sendKeys(getCommonTestData("username"));
			Edi_login_Password.sendKeys(getCommonTestData("password"));
			Edi_login_Login.click();
			
		
			
			
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("unable to login");
			
		}
		
		return status;
	}

		
	
	

}
