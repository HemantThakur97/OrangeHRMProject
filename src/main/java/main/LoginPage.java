package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//*[text()=' Login ']")
	WebElement btnlogin;
	
	
	@FindBy(xpath="//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
	WebElement logintxt;
	
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	WebElement forgetpasswordtxt;
	
	@FindBy(xpath="//a[text()='OrangeHRM, Inc']")
	WebElement OrangeHRMtxt;
	
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void loginmethod(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		btnlogin.click();
		}
	public String logintext() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return logintxt.getText();	
	}
	public String forgetpasswordtext() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return forgetpasswordtxt.getText();	
	}
	public String orangeHRMtext() {
		return OrangeHRMtxt.getText();	
	}
	



}
