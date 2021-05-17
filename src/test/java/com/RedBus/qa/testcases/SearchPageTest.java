package com.RedBus.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.RedBus.qa.base.TestBase;
import com.RedBus.qa.pages.HomePage;

public class SearchPageTest extends TestBase {

	HomePage HomePage;

	public SearchPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		HomePage = new HomePage();
		
	}
	
	
	@Test
	public void homePageTitle() {
	String title =	HomePage.ValidatingLoginPageTitle();
	
	System.out.println(title);
	}
	
	@Test
	public void search() {
		
		HomePage.search();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
