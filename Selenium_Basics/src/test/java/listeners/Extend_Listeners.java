package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Automation_Core.Base;
import Extend_Report.ExtentManager;

public class Extend_Listeners extends Base implements ITestListener
{
	private static final ExtentReports extent = ExtentManager.createInstance();
	private static final ThreadLocal <ExtentTest> test= new ThreadLocal();
	
	public synchronized void onStart(ITestContext context)
	{
		System.out.println("Extent Reports version 3 TestSuite started.");
	}
	public synchronized void onFinish(ITestContext context)
	{
		System.out.println("Extent Reports version 3 TestSuite is Ending.");
	}
	public synchronized void onTestStart(ITestResult result)
	{
		System.out.println((result.getMethod().getMethodName()+"started!"));
		ExtentTest extentTest=extent.createTest(result.getMethod().getMethodName(),result.getMethod().getDescription());
		test.set(extentTest);
	}
	public synchronized void onTestSuccess(ITestResult result)
	{
		System.out.println((result.getMethod().getMethodName()+"passes!"));
		test.get().pass("Test passed");		
	}
	public synchronized void onTestSkipeed(ITestResult result)
	{
		System.out.println((result.getMethod().getMethodName()+"Skipped!"));
		test.get().skip(result.getThrowable());		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println(("onTestFailedButWithinSuccessPercentage for"+result.getMethod().getMethodName()));
		
	}
	
}
