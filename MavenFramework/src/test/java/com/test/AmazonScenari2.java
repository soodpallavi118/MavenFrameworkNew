package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class AmazonScenari2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//int a =10;
		
//		List<WebElement> li = driver.findElements(By.xpath("//div[div[h2[text()='Gaming accessories']]]//div[contains(@class,'a-section a-spacing-none quadrant-container')]"));
//		
//		for(int i = 0 ; i<li.size();i++)
//		{
//			li = driver.findElements(By.xpath("//div[div[h2[text()='Gaming accessories']]]//div[contains(@class,'a-section a-spacing-none quadrant-container')]"));
//			li.get(i).click();
//			Thread.sleep(2000);
//			driver.navigate().back();
		
		
	
//		}
		
		//int i =10;
		
		WebElement headset=driver.findElement(By.xpath("//img[@alt='Headsets']"));
		WebElement Keyboard= driver.findElement(By.xpath("//img[@alt='Keyboards']"));
		WebElement Mice = driver.findElement(By.xpath("//img[@alt='Computer mice']"));
	    WebElement Chairs=	driver.findElement(By.xpath("//img[@alt='Chairs']"));
	
		
	 
	    headset.click();
		driver.navigate().back();
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		Keyboard.click();
		driver.navigate().back();
		
		driver.navigate().refresh();
		Mice.click();
		driver.navigate().back();
		
		driver.navigate().refresh();
		Chairs.click();
		driver.navigate().back();
		
		
		Thread.sleep(1000);
		driver.quit();
		
		

	}
	}



