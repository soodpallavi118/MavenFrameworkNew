package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.ca");
		
		
		
		Actions act = new Actions(driver);
		
		WebElement AccountLists=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		act.moveToElement(AccountLists).perform();
		
	//	driver.findElement(By.xpath("//span[text()='Find a Gift']")).click();
		
		List<WebElement> li = driver.findElements(By.xpath("//a[@class='nav-link nav-item']"));
		
		System.out.println(li.size());
		
		for(int i = 0 ; i<li.size();i++)
		{
			System.out.println(li.get(i).getText());
		}
		
		
		
		
		
		
		
		Thread.sleep(10000);
		driver.quit();
	
		 

	}

}
