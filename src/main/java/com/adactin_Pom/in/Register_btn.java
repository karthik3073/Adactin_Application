package com.adactin_Pom.in;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_btn {

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location_1;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotel_1;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement room;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement room_no;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement date_pick;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement date_pick1;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult_room;

	@FindBy(name = "child_room")
	private WebElement child_room;

	public WebElement getLocation_1() {
		return location_1;
	}

	public WebElement getHotel_1() {
		return hotel_1;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoom_no() {
		return room_no;
	}

	public WebElement getDate_pick() {
		return date_pick;
	}

	public WebElement getDate_pick1() {
		return date_pick1;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

}
