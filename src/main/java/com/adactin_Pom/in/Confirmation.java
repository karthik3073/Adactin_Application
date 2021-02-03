package com.adactin_Pom.in;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Confirmation {

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radio_btn;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit1;

	public WebElement getSubmit1() {
		return submit1;
	}

	public WebElement getRadio_btn() {
		return radio_btn;

	}

}
