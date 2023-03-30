package main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage extends BaseClass {
	
	@FindBy(xpath="//a[@class='oxd-main-menu-item active']")
	WebElement buttonPIM ;
	
	@FindBy(xpath="//p[text()='Paul Collings']")
	WebElement welcomename;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	List<WebElement> allcheckbox;
	
	@FindBy(xpath="//input[@type='checkbox']")
	List<WebElement> checkbox;
	
	
	public PimPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void ButtonPIM() {
		buttonPIM.click();
	}
	public boolean WelComeName() {
		return welcomename.isDisplayed();
	}
	public boolean CheckBoxSelect() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return checkbox.get(0).isSelected();
	}
	public void AllCheckBox() {
		allcheckbox.get(0).click();;
	}
	

}
