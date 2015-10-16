package com.wipro.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTestClass {
	@Test
	public void testCaseHomepage() {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get(System.getProperty("url"));

		WebElement e1 = driver.findElement(By.xpath("//span [@id='output']"));

		driver.findElement(By.xpath("//input [@name='fname']")).sendKeys(
				"AngularJS");
		driver.findElement(By.xpath("//input [@name='lname']")).sendKeys(
				"Quickstarter");
		
		driver.findElement(By.xpath("//*[@id='submit']")).click();

		String expectedName = "AngularJS Quickstarter";

		try {
			Assert.assertEquals(e1.getText(), expectedName);
		} finally {
			driver.close();
			driver.quit();
		}
	}
}
