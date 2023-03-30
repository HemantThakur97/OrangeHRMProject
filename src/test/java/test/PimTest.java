package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PimTest extends BaseTest {
	
	@BeforeClass
	public void verifylogin() {
		loginpage.loginmethod();
	}
	@Test(priority=1)
	public void VerifyPIMButton() {
		pimpage.ButtonPIM();
	}
	@Test(priority=2)
	public void VerifyWelcomeName() {
		pimpage.WelComeName();
		Assert.assertEquals(pimpage.WelComeName(),true);
	}
	@Test(priority=3)
	public void SelectCheckBox() {
		pimpage.AllCheckBox();
		Assert.assertEquals(pimpage.CheckBoxSelect(), true);
	}

}
