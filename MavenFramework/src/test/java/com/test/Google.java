package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("testng");
		
	WebElement ul=	driver.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div[2]/div[2]/div[2]/div/div/ul"));
		
			List <WebElement> options =ul.findElements(By.tagName("li"))	;
			
			for (WebElement option : options)
			{
				 String Retreivedvalue =option.getAttribute("text");
				
				if (Retreivedvalue == "testng") 
				{
					System.out.println("MatchFound");
				}
				else
					{
						System.out.println("MatchNotFound");
						
					}
				}
			}
			
			
		
		
	}


