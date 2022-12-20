package org.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	
	public static WebDriver driver;
	public static Actions act;
	public static JavascriptExecutor js;

	public static void launchTheBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

	}

	public static void maxi() {

		driver.manage().window().maximize();

	}

	public static void urlLaunch(String name) {

		driver.get(name);

	}

	public static void passText(WebElement ele, String name) {

		ele.sendKeys(name);

	}

	public static void clickBtn(WebElement ele) {

		ele.click();

	}
	
	public static String getTitle() {
		
		String title = driver.getTitle();

		return title;
		
		
		
	}

	public static void closeTheBrowser() {

		driver.quit();

	}

	public static void movetoElement(WebElement target) {
		act = new Actions(driver);

		act.moveToElement(target).perform();

	}
	public static void dd(WebElement source,WebElement target) {
		act = new Actions(driver);

		act.dragAndDrop(source, target).perform();

	}

	public static void javascriptpasstext(WebElement ele) {

		js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','selenium')", ele);

	}

	public static void printTheText(WebElement ele) {

		String text = ele.getText();
		System.out.println(text);

	}


	
	

}
