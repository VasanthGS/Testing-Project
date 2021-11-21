package org.adactin;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.lib.BookHotel;
import org.lib.LibGlobal;
import org.lib.LoginPage;
import org.lib.SearchHotel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingHotel extends LibGlobal{
	@BeforeClass
	public static void browserSetup() {
		WebDriver browser = launchBrowser("chrome");
		loadUrl("https://adactinhotelapp.com/");

	}
	@Before
	public void startTime() {
		Date date = new Date();
		System.out.println(date);

	}
	@Test
	// Login
	public void LoginHotel() throws IOException, InterruptedException {
		String username = getDataFromExcel("TC_001", 1, 0);
		String password = getDataFromExcel("TC_001", 1, 1);
		LoginPage lg = new LoginPage();
		lg.login(username, password);
		
		//search hotel
		String location = getDataFromExcel("TC_002", 0, 0);
		String hotels = getDataFromExcel("TC_002", 1, 1);
		String roomtype = getDataFromExcel("TC_002", 1, 2);
		String roomnos = getDataFromExcel("TC_002", 1, 3);
		String datepick = getDataFromExcel("TC_002", 1, 4);
		String dateout = getDataFromExcel("TC_002", 1, 5);
		String adultroom = getDataFromExcel("TC_002", 1, 6);
		String childroom = getDataFromExcel("TC_002", 1, 7);
		SearchHotel searchhotel = new SearchHotel();
		searchhotel.search(location, hotels, roomtype, roomnos, datepick, dateout, adultroom, childroom);
		
		
		//select hotel
		WebElement radiobtn = findLocatorbyId("radiobutton_0");
		click(radiobtn);
		WebElement continuebtn = findLocatorbyId("continue");
		click(continuebtn);
		
		//book Hotel
		String TypeFirstName = getDataFromExcel("TC_003", 1, 0);
		String typeLastName = getDataFromExcel("TC_003", 1, 1);
		String typeAddress = getDataFromExcel("TC_003", 1, 2);
		String cardNumber = getDataFromExcel("TC_003", 1, 3);
		String cardType = getDataFromExcel("TC_003", 1, 4);
		String expiryMonth = getDataFromExcel("TC_003", 1, 5);
		String expiryYear = getDataFromExcel("TC_003", 1, 6);
		String ccvnumber = getDataFromExcel("TC_003", 1, 7);
		BookHotel booking = new BookHotel();
		booking.book(TypeFirstName, typeLastName, typeAddress, cardNumber, cardType, expiryMonth, expiryYear, ccvnumber);
		
		Thread.sleep(5000);
		WebElement ordernumber = findLocatorbyId("order_no");
		String text = getAttributeValue(ordernumber, "value");
		System.out.println(text);
		writeDatacell("TC_003", 1, 8, text);		
	}
	@After
	public void endTime() {
		Date date = new Date();
		System.out.println(date);

	}
	@AfterClass
	public static  void closeAllwindow() {
		quitBrowser();

	}
	
	

}
