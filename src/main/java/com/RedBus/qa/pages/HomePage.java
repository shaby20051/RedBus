package com.RedBus.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RedBus.qa.base.TestBase;



public class HomePage extends TestBase{

	// Page Factory = OR (Object Repository)

	@FindBy(id = "twotabsearchtextbox")
	WebElement search;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/div/input")
	WebElement to;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/label/p[1]/span[1]")
	WebElement date;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[1]/div/p[1]")
	WebElement selectDate;

	@FindBy(id = "nav-search-submit-button")
	WebElement searchbtn;

	// Initializing the page Objects:
	public void searchBus() {

		PageFactory.initElements(driver, this);
		
	}

	// Actions:
	public String ValidatingLoginPageTitle() {
		return driver.getTitle();
	}

	public void search() {
		
		
		search.sendKeys("kindle");
		searchbtn.click();
	}

}
