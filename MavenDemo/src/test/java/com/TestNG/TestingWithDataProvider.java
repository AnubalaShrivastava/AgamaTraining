package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingWithDataProvider {
	WebDriver driver;
	
	@Test(dataProvider="facebooklogin")
	public void loginTofacebook(String username,String password) throws Exception {
		WebDriverManager.chromedriver().setup();

	driver=new ChromeDriver();       
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

	@DataProvider(name="facebooklogin")
	public Object[][] passData() {

	Object[][] data=new Object[5][2];
	 		//username
			data[0][0]="frank";
			//password
			data[0][1]="demo1";

			data[1][0]="joshi";
			data[1][1]="demo123";

			data[2][0]="sathya";
			data[2][1]="demo1234";
			
			data[3][0]="id1";
			data[3][1]="demopass";
			
			data[4][0]="ad2";
			data[4][1]="demppass2";

			return data;
		}

}
