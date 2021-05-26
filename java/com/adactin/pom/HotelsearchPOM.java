package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsearchPOM {

	public static WebDriver driver;

	public HotelsearchPOM(WebDriver driver2) {
	this.driver= driver2;
	PageFactory.initElements(driver2, this);
	}
	@FindBy(id="location" )
	private WebElement location;
	
	@FindBy(id= "hotels")
	private WebElement hotelName;
	
	@FindBy(id= "room_type")
	private WebElement roomType;
	
	@FindBy(id= "room_nos")
	private WebElement roomNumber;
	
	@FindBy(id= "datepick_in")
	private WebElement fromDate;
	
	@FindBy(id= "datepick_out")
	private WebElement toDate;
	
	@FindBy(id= "adult_room")
	private WebElement adultNum;
	
	@FindBy(id= "child_room")
	private WebElement childNUm;
	
	@FindBy(id= "Submit")
	private WebElement submitBtn;
	

	
	public WebElement getLocation() {
		return location;}
		
	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNumber() {
		return roomNumber;
	}

	public WebElement getFromDate() {
		return fromDate;
	}

	public WebElement getToDate() {
		return toDate;
	}

	public WebElement getAdultNum() {
		return adultNum;
	}

	public WebElement getChildNUm() {
		return childNUm;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
	
}

