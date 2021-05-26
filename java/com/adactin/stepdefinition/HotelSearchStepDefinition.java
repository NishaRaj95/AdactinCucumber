package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.help.PageObjectManager;
import com.adactin.runner.Runner;

import baseClass.Baseclass;
import cucumber.api.java.en.*;

public class HotelSearchStepDefinition extends Baseclass {
	public static WebDriver driver= Runner.driver;

	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^User navigates to search webpage once credentials are passed$")
	public void user_navigates_to_search_webpage_once_credentials_are_passed() throws Throwable {
		
	}

	@When("^User selects the location for the hotel booking$")
	public void user_selects_the_location_for_the_hotel_booking() throws Throwable {
	  dropDown(pom.getHsp().getLocation(), "London");
	  
	}

	@And("^User selects hotel name and room type and Number of Rooms and Checkindate and Checkoutdate and AdultsperRoom and ChildrenperRoom$")
	public void user_selects_hotel_name_and_room_type_and_Number_of_Rooms_and_Checkindate_and_Checkoutdate_and_AdultsperRoom_and_ChildrenperRoom() throws Throwable {
		dropDown(pom.getHsp().getHotelName(), "Hotel Sunshine");
		dropDown(pom.getHsp().getRoomType(), "Deluxe");
		dropDown(pom.getHsp().getRoomNumber(), "2");
		clearElement(driver.findElement(By.id("datepick_in")));
		input(pom.getHsp().getFromDate(), "13/05/2021");
		clearElement(driver.findElement(By.id("datepick_out")));
		input(pom.getHsp().getToDate(), "14/05/2021");
		dropDown(pom.getHsp().getAdultNum(), "2");
		dropDown(pom.getHsp().getChildNUm(), "1");
		
	  
	}

	@And("^User is clicking search option$")
	public void user_is_clicking_search_option() throws Throwable {
		clickElement(pom.getHsp().getSubmitBtn());
	    
	}



	
}
