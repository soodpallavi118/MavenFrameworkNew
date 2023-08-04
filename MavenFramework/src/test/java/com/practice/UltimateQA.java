package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UltimateQA {

	WebDriver driver;
	
	
	
	@BeforeClass
	public void OpenApp() 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://ultimateqa.com/automation");
		driver.manage().window().maximize();
		System.out.println("Opening Of Browser");
	}
	
	@Test
	public void HoverLearning()
	{		
		WebElement learn=driver.findElement(By.xpath("(//a[text()='Learning'])[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(learn).perform();
		
		List <WebElement> list=driver.findElements(By.xpath("(//li[a[text()='Learning']])[1]//li"));
   //   Using For Loop 
		for (int i=0;i<list.size();i++)
      {
    	 System.out.println(list.get(i).getText());
      }
		/* Using ForEach Loop
		  for (WebElement li : list)        		
	        {
	        	System.out.println(li.getText());
	        } */
			
		
		
	}
	

	public void Fill_Form()
	{
		
		driver.findElement(By.xpath("")).click();
		
		//Entering Form Data
		driver.findElement(By.xpath("(//p[label[text()='Name']])[1]")).sendKeys("FN");
		driver.findElement(By.xpath("(//p[label[text()='Email Address']])[1]")).sendKeys("EmailAddress");
		driver.findElement(By.xpath("(//p[label[text()='Message']])[1]")).sendKeys("Message");
		
		
	}
	
	@AfterClass 
	public void Close()
	{
		driver.quit();
	}
}



