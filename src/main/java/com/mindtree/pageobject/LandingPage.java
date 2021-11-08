package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.LandingPageUI;

public class LandingPage {
	
	public WebDriver driver;
	
	//By SignIn = By.xpath("//a[text() = 'Sign In']");
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(LandingPageUI.SignIn);
	}
	

}
