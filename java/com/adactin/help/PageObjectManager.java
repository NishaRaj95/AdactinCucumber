package com.adactin.help;

/* .*****DESCRIPTION*****
 * To reduce the memory waste and to utilize everything in single object we go for page object manager class.
 * In this case we have to initialize the objects for the LoginpagePOM,HotelsearchPOM and HotelBookingPOM as private
 * And we are using a single constructor class with return type as the object of this class.
 * Then generating get methods for the 3 objects that has been created and returning those by loading the driver.
 * In SP of the 3 class we have to initialize the Page Object Manager class to access the methods from those classes.
 */

import org.openqa.selenium.WebDriver;

import com.adactin.pom.HotelBookingPOM;
import com.adactin.pom.HotelsearchPOM;
import com.adactin.pom.LoginPagePOM;

public class PageObjectManager {
	
	
	public static WebDriver driver;
	
	private LoginPagePOM lp;
	private HotelsearchPOM hsp;
	private HotelBookingPOM hbp;

	public PageObjectManager(WebDriver driver2) {
		PageObjectManager.driver= driver2;
		
	}

	public LoginPagePOM getLp() {
		
		lp= new LoginPagePOM(driver);
		return lp;
	}

	public HotelsearchPOM getHsp() {
		
		hsp= new HotelsearchPOM(driver);
		return hsp;
	}

	public HotelBookingPOM getHbp() {
		hbp= new HotelBookingPOM(driver);
		return hbp;
	}
	
	
}



	


