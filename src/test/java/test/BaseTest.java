package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.BaseClass;
import main.LeavePage;
import main.LoginPage;
import main.PimPage;

public class BaseTest extends BaseClass {
	
	@BeforeClass
	public void browserlaunach() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@BeforeClass
	public void pageobject() {
		loginpage=new LoginPage(driver);
		leavepage=new LeavePage(driver);
		pimpage=new PimPage(driver);
	}
	
	@AfterClass
	public void tearDownEnvirnment() {
		driver.quit();
	}
	public void screenShot(String testname) {
	TakesScreenshot srnshot=(TakesScreenshot)driver;     
		File source=srnshot.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\RAKESH\\Pictures\\BlueStacks\\"+testname+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("screenshot saved");
	}
	
	
		
	


}
