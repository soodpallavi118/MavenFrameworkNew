package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeMultipleDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
	WebElement dropdown	= driver.findElement(By.name("selenium_commands"));
	
	Select select = new Select(dropdown);
	
	select.selectByVisibleText("Browser Commands");
	select.selectByVisibleText("Switch Commands");
	
	  List<WebElement> options =select.getOptions();
	  
	  System.out.println(options.size());
	  
//	  for (WebElement option : options)
//	  {
//		  System.out.println(option.getAttribute("text"));
//	  }
		
		
		
		
		

	}

}
