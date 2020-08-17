package HomeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		driver.findElement(By.xpath("//button")).click();
		Alert prompt = driver.switchTo().alert();
		Thread.sleep(3000);
		prompt.sendKeys("Anubala ");
		prompt.accept();
		driver.switchTo().defaultContent();
		

	}

}
