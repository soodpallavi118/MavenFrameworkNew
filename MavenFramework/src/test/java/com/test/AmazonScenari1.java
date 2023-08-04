package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class AmazonScenari1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.ca");
		
		driver.manage().window().maximize();
		
		WebElement option=driver.findElement(By.xpath("//a[span[text()='Account & Lists']]"));
	
		Actions act = new Actions(driver);
		
		act.moveToElement(option).perform();
		
		 List <WebElement> li =driver.findElements(By.xpath("//div[@class='nav-title']|//a[@class='nav-link nav-item']"));
		
	//	 List<WebElement> sub = driver.findElements(By.xpath("//a[@class='nav-link nav-item']"));
		 
		for (int i=0; i<li.size(); i++)
		{
		System.out.println(li.get(i).getText());
		
		}		
		
		Thread.sleep(1000);
		driver.quit();
		
		

	}
	}



