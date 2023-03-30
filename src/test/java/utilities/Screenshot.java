package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import test.BaseTest;


public class Screenshot extends BaseTest implements ITestListener{

	
	@Override
	public void onTestFailure(ITestResult result) {
		screenShot(result.getName());
		
	}

	
	
	

}
