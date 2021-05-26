package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.help.PageObjectManager;
import com.adactin.runner.Runner;

import baseClass.Baseclass;

import cucumber.api.java.en.*;

/* DESCRIPTION 
 * Initially we have to create a class of Login page for POM and initialize that class in the SD so that we can access getters from that POM login class 
com.adactin.stepdefinition.AdactinLoginStepDefinition */


public class AdactinLoginStepDefinition extends Baseclass {

	public static WebDriver driver= Runner.driver;
	
	
	PageObjectManager pom= new PageObjectManager(driver);
	
	@Given("^User launches Adactin hotel application with the given URL$")
	public void user_launches_Adactin_hotel_application_with_the_given_URL() throws Throwable {
		
		getUrl("https://adactinhotelapp.com/"); 
	}

	@When("^User enters the credentials with username as \"([^\"]*)\"$")
	public void user_enters_the_credentials_with_username_as(String arg1) throws Throwable {
		userDetails(pom.getLp().getUsername(), arg1);
	
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String arg1) throws Throwable

	{
		userDetails(pom.getLp().getPassword(),arg1);
	
	}

	@When("^User is clicking login button$")
	public void user_is_clicking_login_button() throws Throwable {
		clickElement(pom.getLp().getLoginButton());
	
	}

	
	 /* @Then("^User checks whether the application is launched with the valid credentials$"
	  ) public void user_checks_whether_the_application_is_launched_with_the_valid_credentials() throws Throwable{
	 }*/
	 


}
