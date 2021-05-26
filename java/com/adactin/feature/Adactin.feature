Feature: Adactin application login functionality

Scenario: User loginng in Adactin hotel application with valid username and valid password
    Given User launches Adactin hotel application with the given URL 
    When User enters the credentials with username as "SowmiyaSri" 
    And User enters password as "Sowmiya05"
    And User is clicking login button

Scenario: User searching the hotel with options given
		Given User navigates to search webpage once credentials are passed
		When User selects the location for the hotel booking
		And User selects hotel name and room type and Number of Rooms and Checkindate and Checkoutdate and AdultsperRoom and ChildrenperRoom
		And User is clicking search option

Scenario: User reserving  a hotel room in Adactin application
		Given User navigates to hotel booking page
		When User clicks the hotel name to book that hotel
		And User booking with the personal info along with the payment details 
		And User clicking the book now tab 
		

		
		



		
		