package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id=\'txtUsername\']")).sendKeys("Admin");
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("admin123").perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).perform();
	
		

	}

}
