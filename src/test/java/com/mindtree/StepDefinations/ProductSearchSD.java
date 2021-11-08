package com.mindtree.StepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.pageobject.ProductSearch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class ProductSearchSD {
	static WebDriver driver;
	public ProductSearch ps;

    @Given("^getting driver from the Search Page of the application$")
    public void getting_driver_from_the_search_page_of_the_application() throws Throwable {
    	driver = SearchPageSD.getDriver();
    }

    @When("^User finds the desired product$")
    public void user_finds_the_desired_product() throws Throwable {
    	ps = new ProductSearch(driver);
    	ps.getBook();
    }

    @And("^click on it$")
    public void click_on_it() throws Throwable {
    	ps.getBook().click();
    }
    
    public static WebDriver getDriver() {
    	return driver;
    }

}