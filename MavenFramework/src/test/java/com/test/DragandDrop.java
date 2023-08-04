package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement from=driver.findElement(By.xpath("//a[text()=' BANK ']"));		
		
		WebElement to =driver.findElement(By.xpath("//ol[@id='bank']")); 
		
		act.dragAndDrop(from, to).perform();
		
		
		
		
		
		Thread.sleep(10000);
		driver.quit();
	
		 

	}

}
