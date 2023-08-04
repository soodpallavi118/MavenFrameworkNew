package com.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiTest {

	WebDriver driver;

	@BeforeClass
	public void Initalization() {
		driver = new ChromeDriver();

		driver.get("https://www.amazon.ca");
		driver.manage().window().maximize();
		System.out.println("OpeningBrowser");
	}

	@Test
	public void SelectDropDown() {

		WebElement seldropdown = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(seldropdown);

		sel.selectByIndex(2);

		sel.selectByValue("search-alias=stripbooks");
		sel.selectByVisibleText("Kindle Store");

	}

	@Test
	public void MouseHovering() {

		Actions act = new Actions(driver);

		WebElement AccountLists = driver.findElement(By.xpath("//span[text()='Account & Lists']"));

		act.moveToElement(AccountLists).perform();

		// driver.findElement(By.xpath("//span[text()='Find a Gift']")).click();

		List<WebElement> li = driver.findElements(By.xpath("//a[@class='nav-link nav-item']"));

		System.out.println(li.size());

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
		}

	}

	@AfterClass
	public void cleanUp() {
		driver.quit();
	}

}
