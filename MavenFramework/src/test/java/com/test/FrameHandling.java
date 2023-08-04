package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement support=driver.findElement(By.xpath("//a[text()='Support ']"));
		
		act.moveToElement(support).perform();
		
		driver.findElement(By.xpath("//a[text()='Talk To Us']")).click();
		
		driver.switchTo().frame("iframeChatBot");
		
		driver.findElement(By.xpath("//button[text()='Cancellation']")).click();
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("chatbot_close_button")).click();
		
		
		
		

	}

}
