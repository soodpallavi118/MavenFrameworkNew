package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver(); //run Time polymorphism
		
		driver.get("https://www.amazon.ca");
		
		driver.manage().window().maximize();//part nested concept
		
		System.out.println(driver.getTitle());
		
		WebElement accountlist = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(accountlist).perform();
		
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
