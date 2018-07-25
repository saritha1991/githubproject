package Com.TestNgListerners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Com.GenerateReports.GenerateReports;
import Com.ReadExcel.ReadExcel;

public class TestNGListerners implements ITestListener,IInvokedMethodListener {
	
	public static String crntclassname;
	

	@Override
	public void onFinish(ITestContext arg0) {
	
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
		ReadExcel.connect_To_Excel();		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
	
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestStart(ITestResult classname) {
		String tcname=classname.getInstanceName().toString();
		int lastpos_dot=tcname.lastIndexOf(".")+1;
		crntclassname=tcname.substring(lastpos_dot);
		GenerateReports.intializeReport(crntclassname);
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
	
		GenerateReports.flushReport();
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		GenerateReports.startTest( crntclassname);
		
	}

}
