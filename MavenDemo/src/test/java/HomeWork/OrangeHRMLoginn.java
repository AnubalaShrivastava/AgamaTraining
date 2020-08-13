package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginn {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//WebDriverManager.iedriver().setup();
		//WebDriver driver = new InternetExplorerDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id = \'txtUsername\']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name=\'Submit\' and @id=\'btnLogin\']")).click();
		//contains and text 
		driver.findElement(By.xpath("//span[contains(text(),'Assign Leave')]")).click();
		
		//starts-with
		driver.findElement(By.xpath("//input[starts-with(@name,'assign')]")).sendKeys("Anubala");
	}

}
