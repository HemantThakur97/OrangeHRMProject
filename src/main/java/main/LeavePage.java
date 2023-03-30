package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage extends BaseClass {
	
	@FindBy(xpath="//span[text()='Leave']")
	WebElement leavebutton;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	WebElement datebutton;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--label-danger']//parent::div")
	WebElement rejectbutton;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--text orangehrm-button-margin']")
	WebElement cancelbutton;
	
	public LeavePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnLeaveButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		leavebutton.click();
	}
	
	public void selectDateButton(){
			datebutton.click();	
	}
	
	public void clickOnRejectButton() {
		rejectbutton.click();
	}
	public void clickOnCancelButton() {
		cancelbutton.click();
	}

}

