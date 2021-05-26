package com.adactin.runner;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.help.FileReaderManager;

import baseClass.Baseclass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature",glue="com\\adactin\\stepdefinition",
monochrome = false,
strict = true,
dryRun = false,
plugin={"com.cucumber.listener.ExtentCucumberFormatter:Report//CucumberExtentReport.html"})
public class Runner {


	public static WebDriver driver;
		
@BeforeClass
public static void setUp() throws Exception {
	
	//driver= Baseclass.browserLaunch("IE");
	String browser = FileReaderManager.getInstance().getCrInstance().getBrowser();
	driver=Baseclass.browserLaunch(browser);
}



@AfterClass
public static void tearDown() {
driver.quit();

}	


}