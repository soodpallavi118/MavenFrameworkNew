package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropDownWithoutSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://byjus.com/ca/");

		driver.manage().window().maximize();		
		
		WebElement option = driver.findElement(By.xpath("(//div[span[text()='Canada']])[1]"));
		option.click();

		WebElement ul = driver
				.findElement(By.xpath("/html/body/div/div/header/div/div/div[2]/div[2]/div/div[2]/div/div/ul"));
		List<WebElement> list = ul.findElements(By.tagName("li"));

		for (WebElement value : list) {

			System.out.println(value.getAttribute("class"));
		}

	}

}
