package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.help.PageObjectManager;
import com.adactin.pom.HotelBookingPOM;
import com.adactin.runner.Runner;

import baseClass.Baseclass;
import cucumber.api.java.en.*;

public class HotelBookingSD extends Baseclass{
	
	public static WebDriver driver= Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^User navigates to hotel booking page$")
	public void user_navigates_to_hotel_booking_page() throws Throwable {
	    clickElement(pom.getHbp().getRadioButton());
	    clickElement(pom.getHbp().getContinueButton());
	}
	@When("^User clicks the hotel name to book that hotel$")
	public void user_clicks_the_hotel_name_to_book_that_hotel() throws Throwable {
	    userDetails(pom.getHbp().getFirstName(), "Nisha");
	    userDetails(pom.getHbp().getLastName(), "Raj");
	    userDetails(pom.getHbp().getAddress(), "No 10 Ragavan street,mogappair");
	}

	@And("^User booking with the personal info along with the payment details$")
	public void user_booking_with_the_personal_info_along_with_the_payment_details() throws Throwable {
	   
		input(pom.getHbp().getCreditCardNumber(), "1234567897413256");
		dropDown(pom.getHbp().getCcType(), "MAST");
		dropDown(pom.getHbp().getCcMonth(), "4");
		dropDown(pom.getHbp().getCcYear(), "2022");
		input(pom.getHbp().getCvvNumber(), "123");
	}

	@And("^User clicking the book now tab$")
	public void user_clicking_the_book_now_tab() throws Throwable {
	    clickElement(pom.getHbp().getBookNow());
	}
}
