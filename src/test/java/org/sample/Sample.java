package org.sample;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utility.Baseclass;

import og.pojo.LoginPojo;

public class Sample extends Baseclass {

	@BeforeClass
	private void preCond() {

		launchTheBrowser();
		maxi();

	}

	@BeforeMethod
	private void StartingDateandTime() {

		Date d = new Date();

		System.out.println(d);

	}


	@Test
	private void tc1() {

		driver.get("https://www.facebook.com/");

		LoginPojo l = new LoginPojo();
		
		
		
		
		String title = getTitle();// Facebook login  or signup
		
		
		Assert.assertEquals(title, title);
		

		passText(l.getEmailbox(), "Selenium");

		passText(l.getPassBox(), "!#354");

		
	}
	
	@Test
	private void tc2() {

		driver.get("https://www.facebook.com/");

		LoginPojo l = new LoginPojo();
		
		String title = getTitle();
		
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(title, title, "Check the page title");
		
		

		passText(l.getEmailbox(), "java");

		passText(l.getPassBox(), "1123");
		
		s.assertAll();
		

	}

	@AfterMethod
	private void endingDateAndTime() {

		Date d = new Date();
		System.out.println(d);

	}
	
	@AfterClass
	private void postCondition() {
		
		closeTheBrowser();

	}
	
	

}
