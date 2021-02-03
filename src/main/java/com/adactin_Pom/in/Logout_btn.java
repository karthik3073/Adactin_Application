package com.adactin_Pom.in;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_btn {

	@FindBy(xpath = "(//input[@type='button'])[3]")
	private WebElement logout_btn;

	public WebElement getLogout_btn() {
		return logout_btn;
	}

}
