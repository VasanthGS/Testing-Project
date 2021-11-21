package org.adactin;

import java.io.IOException;

import org.lib.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adactin {
	public static void main(String[] args) throws IOException, InterruptedException {
		LibGlobal lib = new LibGlobal();
		WebDriver browser = lib.launchBrowser("chrome");
		lib.loadUrl("https://adactinhotelapp.com/");
		
		//Login
		WebElement txtname = lib.findLocatorbyId("username");
		lib.setText(txtname, lib.getDataFromExcel("TC_001", 1, 0));
		WebElement txtpass = lib.findLocatorbyId("password");
		lib.setText(txtpass, lib.getDataFromExcel("TC_001", 1, 1));
		WebElement btnlogin = lib.findLocatorbyId("login");
		lib.click(btnlogin);

		//search hotel
		WebElement findLocatorbyId = lib.findLocatorbyId("location");
		lib.setText(findLocatorbyId, lib.getDataFromExcel("TC_002", 0, 0));
		WebElement selecthotel = lib.findLocatorbyId("hotels");
		lib.setText(selecthotel, lib.getDataFromExcel("TC_002", 1, 1));
		WebElement roomtype = lib.findLocatorbyId("room_type");
		lib.setText(roomtype, lib.getDataFromExcel("TC_002", 1, 2));
		WebElement roomnos = lib.findLocatorbyId("room_nos");
		lib.setText(roomnos, lib.getDataFromExcel("TC_002", 1, 3));
		WebElement datepick = lib.findLocatorbyId("datepick_in");
		lib.setText(datepick, lib.getDataFromExcel("TC_002", 1, 4));
		WebElement dateout = lib.findLocatorbyId("datepick_out");
		lib.setText(dateout, lib.getDataFromExcel("TC_002", 1, 5));
		WebElement adult = lib.findLocatorbyId("adult_room");
		lib.setText(adult, lib.getDataFromExcel("TC_002", 1, 6));
		WebElement child = lib.findLocatorbyId("child_room");
		lib.setText(child, lib.getDataFromExcel("TC_002", 1, 7));
		WebElement search = lib.findLocatorbyId("Submit");
		lib.click(search);
		
		//select hotel
		WebElement clickradiobtn = lib.findLocatorbyId("radiobutton_0");
		lib.click(clickradiobtn);
		WebElement clickcontinue = lib.findLocatorbyId("continue");
		lib.click(clickcontinue);
		
		//book hotel
		WebElement firstname = lib.findLocatorbyId("first_name");
		lib.setText(firstname, lib.getDataFromExcel("TC_003", 1, 0));
		WebElement lastname = lib.findLocatorbyId("last_name");
		lib.setText(lastname, lib.getDataFromExcel("TC_003", 1, 1));
		WebElement address = lib.findLocatorbyId("address");
		lib.setText(address, lib.getDataFromExcel("TC_003", 1, 2));
		WebElement cardnumer = lib.findLocatorbyId("cc_num");
		lib.setText(cardnumer, lib.getDataFromExcel("TC_003", 1, 3));
		WebElement cardtype = lib.findLocatorbyId("cc_type");
		lib.setText(cardtype, lib.getDataFromExcel("TC_003", 1, 4));
		WebElement expirymonth = lib.findLocatorbyId("cc_exp_month");
		lib.setText(expirymonth, lib.getDataFromExcel("TC_003", 1, 5));
		WebElement expiryyear = lib.findLocatorbyId("cc_exp_year");
		lib.setText(expiryyear, lib.getDataFromExcel("TC_003", 1, 6));
		WebElement cvvnumber = lib.findLocatorbyId("cc_cvv");
		lib.setText(cvvnumber, lib.getDataFromExcel("TC_003", 1, 7));
		WebElement booking = lib.findLocatorbyId("book_now");
		lib.click(booking);

		Thread.sleep(5000);
		WebElement  id= lib.findLocatorbyId("order_no");
		
		String  value= lib.getAttribute(id);
		lib.writeDatacell("TC_003", 1, 8, value);
		
		
		

	}

}
