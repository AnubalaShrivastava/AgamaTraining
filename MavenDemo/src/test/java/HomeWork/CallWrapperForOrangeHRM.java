package HomeWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testcases.WrapperMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CallWrapperForOrangeHRM {
      
	WrapperMethod wm ;
	@BeforeTest
	public void launceApp(){
		 wm= new WrapperMethod();
		 wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		
		
	}
	@Test
	public void login() {
		wm.enterbyid("txtUsername", "Admin");
		wm.enterbyid("txtPassword","admin123");
		wm.clickbyxpath("//*[@id=\'btnLogin\']");
		 System.out.println("done login");
		
		
	}
	
	@Test
	public void screenshot() throws IOException{
		wm.takesnap("src/test/resources/ScreenShot/HRMScreenShot.png"); 
		 
	}
	
	@AfterTest
	public void closeOut() {
		 		wm.closeapp();	
	}
	
}
