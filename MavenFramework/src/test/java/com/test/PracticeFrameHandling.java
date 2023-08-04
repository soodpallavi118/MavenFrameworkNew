package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeFrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		driver.manage().window().maximize();
		
       
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//a[text()=' Background']")).click();
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MyName");
		
		// driver.switchTo().frame(0);
			
		//	driver.findElement(By.linkText(" Background")).click();
		
		
		
		

	}

}
