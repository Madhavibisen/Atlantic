package com.mindtree.runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.mindtree.pageobject.CartPage;
import com.mindtree.pageobject.LandingPage;
import com.mindtree.pageobject.LoginPage;
import com.mindtree.pageobject.ProductSearch;
import com.mindtree.pageobject.SearchPage;
import com.mindtree.reusablecomponent.WebdriverHelper;
import com.mindtree.utility.DataDriven;

public class Atlantic_Page  {
	WebDriver driver;
	public static Logger Log = LogManager.getLogger(WebdriverHelper.class.getName());

	@Test(priority = 1)
	// Here We are intializing the Driver and opening the browser
	public void homePageLanding() throws IOException, InterruptedException {
		WebdriverHelper.LaunchingBrowser();
		driver = WebdriverHelper.getDriver();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\config.properties");
		prop.load(fis);
		// driver.get(prop.getProperty("url"));
		// String link = prop.getProperty("url");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Log.info("Browser has been opened");
	}

	@Test(priority = 2)
	// Here we are logging in, and user will come to the login page
	public void Landing_Page() throws InterruptedException {
		LandingPage LP = new LandingPage(driver); // It is for clicking on Sign In button
		LP.getLogin().click();
		Log.info("Came to the Login Page");
		Thread.sleep(3000);
	}

	@Test(priority = 3, dataProvider = "getData")
	// Here user will fill the credentials and click on the login
	public void Login_Page(String email, String pwd) throws IOException, InterruptedException {
		/*
		 * Properties prop = new Properties(); FileInputStream fis = new
		 * FileInputStream(".\\Test Data\\config.properties"); prop.load(fis);
		 */
		LoginPage log = new LoginPage(driver); // It is for entering the credentials
		// log.getEmail().sendKeys(prop.getProperty(email));
		// log.getPassword().sendKeys(prop.getProperty(pwd));
		Thread.sleep(7000);
		log.getEmail().clear();
		log.getEmail().sendKeys(email);
		log.getPassword().clear();
		log.getPassword().sendKeys(pwd);
		log.getLogin().click();
		Thread.sleep(3000);
		Log.info("Login Successful");
	}

	@Test(priority = 4)
	// Here User will fall into the the main page and can search anything
	public void SearchPageTesting() throws IOException {
		DataDriven d = new DataDriven();
		ArrayList<String> data = d.getData("Purchase");
		SearchPage sp = new SearchPage(driver);
		sp.getSearchbox().sendKeys(data.get(1));
		sp.getSearchbox().sendKeys(Keys.ENTER);
		Log.info("Searched the product");
	}

	@Test(priority = 5)
	// Here User will select the product

	public void ProductPageTesting() throws InterruptedException {
		ProductSearch ps = new ProductSearch(driver);
		ps.getBook().click();
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	// Here User will be adding the product into the cart
	public void CartPageTesting() throws InterruptedException {
		CartPage cp = new CartPage(driver);
		cp.getCart().click();
		Thread.sleep(7000);
		cp.getShoppingcart().click();
		cp.getVeiwCart().click();

		Assert.assertTrue(cp.getTitleAfterAdding().getText().contains("SUMMARY"));

		Log.info("Product added to the cart");
	}

	@AfterTest
	public void closeDriver() {
		driver.close();
	}

	@DataProvider
	public Object[][] getData() {
		// TODO Auto-generated method stub
		Object[][] data = new Object[1][2];

		data[0][0] = "madhavibisen123@gmail.com";
		data[0][1] = "Madhavi@400";

		/*data[1][0] = "Restricted123@gmail.com";
		data[1][1] = "111435";*/

		return data;
	}
}
