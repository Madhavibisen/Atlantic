package com.mindtree.StepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.mindtree.pageobject.SearchPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class SearchPageSD {
	public SearchPage sp;
	static WebDriver driver;

    @Given("^Getting driver from the Login Page of the application$")
    public void getting_driver_from_the_login_page_of_the_application() throws Throwable {
    	driver = LoginPageSD.getDriver();
    }

    @When("^user clicks on the searchbox$")
    public void user_clicks_on_the_searchbox() throws Throwable {
    	sp = new SearchPage(driver);
    	sp.getSearchbox();
    }

    @Then("^user enters the product as (.+)$")
    public void user_enters_the_product_as(String book) throws Throwable {
    	sp.getSearchbox().sendKeys(book);
    }

    @And("^Hit the enter button$")
    public void hit_the_enter_button() throws Throwable {
    	sp.getSearchbox().sendKeys(Keys.ENTER);
    }
    
    public static WebDriver getDriver() {
    	return driver;
    	
    }

}