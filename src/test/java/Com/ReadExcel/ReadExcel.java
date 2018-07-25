package Com.ReadExcel;

import java.io.File;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import Com.GenerateReports.GenerateReports;

public class ReadExcel extends GenerateReports {
	
	/*
	 * In this class we are converting Excel as Database by using Codid Fillo API
	 * 
	 * API Url:-https://codoid.com/fillo/
	 * 
	 * Classes used in the Framework:Fillo,Connection,Recordset 
	  
	 */
	
	
	public static Fillo fillo;
	
	public static Connection connection;
	
	
	/*
	 *Method Name: connect_To_Excel
	 *
	 *Parameters:NA
	 *
	 *Purpose:This method is called before the Test Exceution at the suite level
	 *		  This method will estlablish a connection with the Excel	
	 * 
	 * Return Type:NA
	 * 
	 * Designer:XYZ
	 * 
	 * Reviewed:
	 * 
	 * Reviewer:
	 * 
	 * Reviewed Date:
	 * 
	 * Modified:
	 * 
	 * Reason:
	 * 
	 */
	public static void connect_To_Excel()
	{
		//get the testdata path
		String testdata_path=System.getProperty("user.dir")+"\\Testdata\\common_testdata.xlsx";
		System.out.println(testdata_path);
		
		try
		{//Verify if the testdata file is exist or not
			File testfile=new File(testdata_path);
			
			if(testfile.exists())
				
			{
				fillo=new Fillo();
				connection=fillo.getConnection(testdata_path);
				System.out.println("Connection is estlablished sucessfully");			
				
			}
			//When there is no file exist, then raise an exception
						
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			
			
		}
		
		
		
	}
	
	public static String getCommonTestData(String column)
	{
		String data="";
		String query="Select "+column+" from commontestdata where Envirinment='QA'";
		
		try {
			Recordset rcrdst=connection.executeQuery(query);
			
			while(rcrdst.next())
			{
				System.out.println(rcrdst.getField(column));
				
				data=rcrdst.getField(column);
				break;
			}
					
		
		} catch (FilloException e) {
			
			System.out.println(e.getMessage());
		}
		
		return data;
		
	}
	
	

}
