package HomeWork;



import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// opening browser
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Handling Popuo
		/*
		 * try{
		 * //driver.findElement(By.xpath("//*[@id=\'SW\']/div[1]/div[1]/ul/li[6]/div[3]"
		 * )).click(); driver.switchTo().alert().dismiss(); // If it reaches here, it
		 * found a popup } catch(Exception e){ System.out.println("no pop up"); }
		 * //Login in popup try {
		 * driver.findElement(By.xpath("//div[@id=\'SW\']/div[1]")).click();
		 * driver.findElement(By.id("username")).sendKeys("shrivastavaanubala@gmail.com"
		 * ); driver.findElement(By.xpath(
		 * "//*[@id=\'SW\']/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
		 * } catch(Exception e) { System.out.println("No pop up"); }
		 */
	
		
		//selecting Chennai as from city
		WebElement fromCity = driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
		fromCity.sendKeys("Chennai");
		Thread.sleep(2000);
	    Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ENTER).perform();
		
		//Selecting Mumbai to destination
		WebElement toCity = driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		toCity.sendKeys("Mumbai");
		action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ENTER).perform();
		
		// moving to next month
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
		
		//selecting date 14
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[2]/div/p[1]")).click();
		
		//click on return
//		driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox')]/div/label/span[contains(@class,'lbl_input')]")).click();
		//moving to next month
//		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
		//select 11 oct 
//		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[1]/div/p")).click();
		
		//click on search
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		//click to ascending by price
		driver.findElement(By.xpath("//div[@id=\'sorting-togglers\']/div[5]/span[@class= \'pointer\']/span[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='fli_list_item_330df112-bb5f-4e4b-af5f-6ff6eae0eb2b']/div/div[1]/div[@class='fli-list-body-section']/div[@class='dept-options']/div/div[4]/button")).click();
		
		
		
		
		
	

	}

}
