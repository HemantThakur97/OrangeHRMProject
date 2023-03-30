package test;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeaveTest extends BaseTest{
	
	@BeforeClass
	public void verifylogin() {
		loginpage.loginmethod();
	}
	@Test(priority=0)
	public void verifyLeaveButton() {
		leavepage.clickOnLeaveButton();
	}
	@Test(priority=1)
	public void verifyClickOnDateButton() {
		leavepage.selectDateButton();
		}
	@Test(priority=2)
	public void verifClickOnRejectButton() {
		leavepage.clickOnRejectButton();
	}
	@Test(priority=3)
	public void verifyClickOnCancelButton() {
		leavepage.clickOnCancelButton();
	}
	
	

}
