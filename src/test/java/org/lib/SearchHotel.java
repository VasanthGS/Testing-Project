package org.lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends LibGlobal {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement roomnos;
	@FindBy(id="datepick_in")
	private WebElement datepick;
	@FindBy(id="datepick_out")
	private WebElement dateout;
	@FindBy(id="adult_room")
	private WebElement adultroom;
	@FindBy(id="child_room")
	private WebElement childroom;
	@FindBy(id="Submit")
	private WebElement search;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}
	public WebElement getDatepick() {
		return datepick;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSearch() {
		return search;
	}
	public void search(String location,String hotels,String roomtype,String roomnos,String datepick,String dateout,String adultroom,String childroom ) {
		setText(getLocation(), location);
		setText(getHotels(), hotels);
		setText(getRoomtype(), roomtype);
		setText(getRoomnos(), roomnos);
		setText(getDatepick(), datepick);
		setText(getDateout(), dateout);
		setText(getAdultroom(), adultroom);
		setText(getChildroom(), childroom);
		click(getSearch());

	}
	
	
	

}
