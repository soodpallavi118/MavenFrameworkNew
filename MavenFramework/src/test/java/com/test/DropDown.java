package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.ca");
		driver.manage().window().maximize();
		
	WebElement seldropdown = 	driver.findElement(By.id("searchDropdownBox"));
	
	Select sel = new Select(seldropdown);
	
	sel.selectByIndex(2);
	
	sel.selectByValue("search-alias=stripbooks");
	sel.selectByVisibleText("Kindle Store");
	
	List<WebElement> options =sel.getOptions();
	  
	  System.out.println(options.size());
	  
	  for(int i = 0 ; i<options.size();i++)
	  {
		  options.get(i).click();
		  
		  System.out.println(options.get(i).getText());
		  
		  System.out.println("Drag and Drop work");
	  }
	

	}

}
