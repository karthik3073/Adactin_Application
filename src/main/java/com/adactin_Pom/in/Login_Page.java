package com.adactin_Pom.in;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {

	@FindBy(xpath = "//input[@type='text']")
	private WebElement login_btn;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	public WebElement getLogin_btn() {
		return login_btn;
	}

	public WebElement getPassword() {
		return password;
	}

}
