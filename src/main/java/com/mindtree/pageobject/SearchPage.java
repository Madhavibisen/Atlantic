package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.SearchPageUI;

public class SearchPage {
	
	public WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}

	
	
	public WebElement getSearchbox() {
		return driver.findElement(SearchPageUI.SearchBox);
	}
	
	
}
