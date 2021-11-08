package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.ProductSearchUI;

public class ProductSearch {
	
	public WebDriver driver;
	
	public ProductSearch(WebDriver driver) {
		this.driver = driver;
	}
	

	
	public WebElement getBook() {
		return driver.findElement(ProductSearchUI.book);
	}

}
