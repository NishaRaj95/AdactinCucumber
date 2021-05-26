package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {

	private WebDriver driver;

	/* DESCRIPTION
	To keep our method in a confidential manner we prefer POM 
	We have to use @FindBy annotation and specify all the webelement with the private access modifier 
	*/
	
	public LoginPagePOM(WebDriver driver1) {
		this.driver= driver1;
		PageFactory.initElements(driver1, this);
		
	}

	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(id= "username")
	private WebElement username;
	
	@FindBy(id= "password")
	private WebElement password;
	
	@FindBy(id= "login")
	private WebElement loginButton;
	
	
}
