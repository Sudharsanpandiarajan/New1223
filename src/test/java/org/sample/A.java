package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A  {
	
	
	@Parameters("browser")
	@Test
	private void lanching(String name) {
	
		WebDriver driver;
		
		if (name.equals("ChromeBrowser")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();

			
		}
		else if (name.equals("FirefoxBrowser")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
		}
		else {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			
		}
		
		

	}
	
	
	
		
	}
	
	

	

