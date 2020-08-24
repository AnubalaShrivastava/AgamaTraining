package HomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderOrangeHRM {
	WebDriver driver;
	/*
	 * @BeforeTest public void setup() { WebDriverManager.chromedriver().setup();
	 * driver = new ChromeDriver();
	 * driver.get("https://opensource-demo.orangehrmlive.com");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * 
	 * }
	 */
	
	@Test(dataProvider="orangeHRMloginData")
	public void login(String username,String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id = \'txtUsername\']")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name=\'Submit\' and @id=\'btnLogin\']")).click();
		
	}
	@DataProvider(name="orangeHRMloginData")
	public Object[][] loginData(){
		Object[][] data = new Object[2][2];
		data[0][0] ="Admin";
		data[0][1] ="admin123";
		data[1][0] ="Tom12345"; 
		data[1][1] ="tom12345";
		
		
		return data;
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
