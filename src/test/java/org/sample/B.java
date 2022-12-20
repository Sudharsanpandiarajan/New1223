package org.sample;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.Baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import og.pojo.LoginPojo;

public class B  {
	
	
	@Test
	private void tc21() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Maven");
		Assert.assertEquals("facebook", "Facebook");
		driver.findElement(By.id("pass")).sendKeys("123242");
		driver.close();

		
	}
	@Test
	private void tc22() {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Jira");
		Assert.assertTrue(false);
		
		driver.findElement(By.id("pass")).sendKeys("hakkjlk");
		driver.close();

		
	}
	@Test
	private void tc23() {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Java");
		driver.findElement(By.id("pass")).sendKeys("hakkjlk");
		driver.close();

		
	}
	
	

	
	
	
	

}
