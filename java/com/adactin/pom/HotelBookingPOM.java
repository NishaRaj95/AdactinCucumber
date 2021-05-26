package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBookingPOM {

	
	@FindBy(xpath= "//*[@id=\"radiobutton_0\"]")
	private WebElement radioButton;
	
	@FindBy(id= "continue")
	private WebElement continueButton;
	
	@FindBy(id= "first_name")
	private WebElement firstName;
	
	@FindBy(id= "last_name")
	private WebElement lastName;

	
	@FindBy(id= "address")
	private WebElement address;
	
	@FindBy(id= "cc_num")
	private WebElement creditCardNumber;
	
	@FindBy(id= "cc_type")
	private WebElement ccType;
	
	
	@FindBy(id= "cc_exp_month")
	private WebElement ccMonth;
	
	@FindBy(id= "cc_exp_year")
	private WebElement ccYear;
	
	@FindBy(id= "cc_cvv")
	private WebElement cvvNumber;
	
	@FindBy(id= "book_now")
	private WebElement bookNow;
	

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcMonth() {
		return ccMonth;
	}

	public WebElement getCcYear() {
		return ccYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public static WebDriver driver;

	public HotelBookingPOM(WebDriver driver3) {
		
		this.driver= driver3;
		PageFactory.initElements(driver3, this);
	
	}


	

}
