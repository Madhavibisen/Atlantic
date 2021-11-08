package com.mindtree.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue = "com.mindtree.StepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests {

}



