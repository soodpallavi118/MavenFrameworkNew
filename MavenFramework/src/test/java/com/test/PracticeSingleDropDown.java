package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeSingleDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		
		driver.manage().window().maximize();
		
	WebElement dropdown	= driver.findElement(By.id("searchDropdownBox"));
	
	Select select = new Select(dropdown);
	
	//select.selectByIndex(1); Thread.sleep(10000);
	//select.selectByValue("search-alias=aps");  Thread.sleep(10000);
	
	 select.selectByVisibleText("Audible Audiobooks");
	 
	 String s =select.getFirstSelectedOption().getAttribute("text");
	 
	 
	 
	 System.out.println(s);
	

	
		
		
		
		
		

	}

}
