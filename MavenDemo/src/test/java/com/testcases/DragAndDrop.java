package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	@Test
	public void actionOn() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
	    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	    
	    WebElement drag = driver.findElement(By.id("draggable"));
	    Thread.sleep(3000);
	    WebElement drop = driver.findElement(By.id("droppable"));
	    System.out.println(drop.getText());
	  // WebElement drag= driver.findElement(By.xpath("//*[@id='draggable']"));
	  // WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
	  // WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
	   //WebElement droppable= driver.findElement(By.xpath("//div[@id='droppable']"));
	   Actions action = new Actions(driver);
	   Thread.sleep(3000);
	   action.dragAndDrop(drag, drop).build().perform();
	
	  
	}
	

}
