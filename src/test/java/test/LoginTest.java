package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest{
	
	@Test(priority=4)
	public void verifylogin()  {
		loginpage.loginmethod();
	}
	@Test(priority=1)
	public void verifyLoginText()  {
		
		Assert.assertEquals(loginpage.logintext(),"Login");
	}
	@Test(priority=2)
	public void verifyForgetpasswordText()  {
		
		Assert.assertEquals(loginpage.forgetpasswordtext(),"Forgot your password?");
	}
	@Test(priority=3)
	public void verifyOrangeHRMText()  {
		
		Assert.assertEquals(loginpage.orangeHRMtext(),"OrangeHRM, Inc");
	}
	



}
