package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PolicyBazaar_TestNG {    
	
	 WebDriver driver ;
	
	 @BeforeTest
	 public void BeforeTestMEthod()
	 {
		 System.out.println("before test method  getting executed");
	 }
	 
	@BeforeClass
	public void OpenURL()
	{
		driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
	//	driver.manage().window().maximize();
		
	}
    
    @Test  
    public void clickAllProducts() throws InterruptedException
    {
    	driver.findElement(By.xpath("//div[text()='View all products']")).click();
    	Thread.sleep(3000);
     //div[h3[a[text()='Term Insurance']]]//li
    }
    
    @Test
    public void ClickCloseButton()
    {
    	
    	driver.findElement(By.xpath("(//div[@class='close close-more-prd'])[2]")).click();
    	//driver.findElement(By.xpath("//div[p[text()='More Products']]//div[contains(@class,'close-more-prd')]")).click();
    }
  
    
    @AfterClass
    public void Close()
    {
    	driver.quit();
    }
    
    
}
