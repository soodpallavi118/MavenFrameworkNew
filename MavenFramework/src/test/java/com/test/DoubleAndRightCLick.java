package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleAndRightCLick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));		
		
		act.contextClick(rightclick).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	//	  WebElement doubleclick=driver.findElement(By.
	//	  xpath("//button[text()='Double-Click Me To See Alert']")) ;
		  
		 // act.doubleClick(doubleclick).perform();
		  
		//  Alert alert= driver.switchTo().alert(); 
		  
	//	System.out.println(alert.getText());  
		  
	//	  alert.accept();
		 
		
		
		
		Thread.sleep(10000);
		driver.quit();
	
		 

	}

}
