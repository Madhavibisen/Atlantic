package com.mindtree.utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusablecomponent.WebdriverHelper;

public class TakeSS {
	
	//WebdriverHelper wd = new WebdriverHelper();
	
	
	public void getScreenshot(String result) throws IOException {
		
		WebDriver driver =	WebdriverHelper.driver;

		Date d = new Date();
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(".\\Test\\" + result + ".png")); 
		System.out.print("ss taken");
	}


}
