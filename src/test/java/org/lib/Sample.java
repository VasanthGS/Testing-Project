package org.lib;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Sample extends LibGlobal {
	@BeforeClass
	public static void beforeclass() {
	launchBrowser("chrome");
	loadUrl("https://adactinhotelapp.com/");

	}
	
	@Before
	public void beforeExecution() {
		Date d = new Date();
				System.out.println(d);

	}
	
	@Test
	public void Findid() throws IOException, InterruptedException {
		WebElement txtusername = findLocatorbyId("username");
		String name = getDataFromExcel("TC_001", 1, 0);
		setText(txtusername, name);
		String attribute = getAttribute(txtusername);
		Assert.assertEquals("verify username",name, attribute);
		
		WebElement txtpassword = findLocatorbyId("password");
		String pass = getDataFromExcel("TC_001", 1, 1);
		setText(txtpassword, pass);
		String userpass = getAttribute(txtpassword);
		Assert.assertEquals("verify password",pass, userpass);
		
		
		WebElement btnlogin = findLocatorbyId("login");
		click(btnlogin);

		WebElement location = findLocatorbyId("location");
		String find = getDataFromExcel("TC_002", 1, 0);
		setText(location, find);
		String chooselocation = getAttribute(location);
		Assert.assertEquals("verify location",find, chooselocation);
		
		WebElement hotel = findLocatorbyId("hotels");
		String find2 = getDataFromExcel("TC_002", 1, 1);
		setText(hotel, find2);
		String selecthotel = getAttribute(hotel);
		Assert.assertEquals("verify hotel",find2, selecthotel);
		
		WebElement roomtype = findLocatorbyId("room_type");
		String find3 = getDataFromExcel("TC_002", 1, 2);
		setText(roomtype, find3);
		String selectroom = getAttribute(roomtype);
		
		WebElement namedata = findLocatorbyId("username_show");
		String att = getAttribute(namedata);
		
		
		
		
		
		
		
		WebElement roomnos = findLocatorbyId("room_nos");
		String find4 = getDataFromExcel("TC_002", 1, 3);
		setText(roomnos, find4);
		String roomnostype = getAttribute(roomnos);
		
		
		
		WebElement datepick = findLocatorbyId("datepick_in");
		String find5 = getDataFromExcel("TC_002", 1, 4);
		setText(datepick, find5);
		String datein = getAttribute(datepick);
		
		
		WebElement dateout = findLocatorbyId("datepick_out");
		String find6 = getDataFromExcel("TC_002", 1, 5);
		setText(dateout, find6);
		String date = getAttribute(dateout);
		
		
		
		WebElement adult = findLocatorbyId("adult_room");
		String adultcount = getDataFromExcel("TC_002", 1, 6);
		setText(adult, adultcount);
		String adulttype = getAttribute(adult);
		
		
		
		WebElement child = findLocatorbyId("child_room");
		String childcount = getDataFromExcel("TC_002", 1, 7);
		setText(child, childcount);
		String childtype = getAttribute(child);
		
		
		WebElement submit = findLocatorbyId("Submit");
		click(submit);

		
		WebElement radiobtn = findLocatorbyId("radiobutton_0");
		click(radiobtn);
		
		
		WebElement continueclick = findLocatorbyId("continue");
		click(continueclick);
		
		
		
		WebElement first = findLocatorbyId("first_name");
		String selectfirst = getDataFromExcel("TC_003", 1, 0);
		setText(first, selectfirst);
		String firstName = getAttribute(first);
		
		
		WebElement last = findLocatorbyId("last_name");
		String selectlast = getDataFromExcel("TC_003", 1, 1);
		setText(last, selectlast);
		String lastName = getAttribute(last);
		
		
		WebElement address = findLocatorbyId("address");
		String selectaddress = getDataFromExcel("TC_003", 1, 2);
		setText(address, selectaddress);
		String addresstype = getAttribute(address);
	
		
		WebElement ccnumber = findLocatorbyId("cc_num");
		String selectccnum = getDataFromExcel("TC_003", 1, 3);
		setText(ccnumber, selectccnum);
		String cc = getAttribute(ccnumber);
		
		
		
		WebElement cctype = findLocatorbyId("cc_type");
		String cvv = getDataFromExcel("TC_003", 1, 4);
		setText(cctype, cvv);
		String cvvnumber = getAttribute(cctype);
	
		
		WebElement expmonth = findLocatorbyId("cc_exp_month");
		String month = getDataFromExcel("TC_003", 1, 5);
		setText(expmonth, month);
		String expiraymonth = getAttribute(expmonth);
		
		
		WebElement expyear = findLocatorbyId("cc_exp_year");
		String year = getDataFromExcel("TC_003", 1, 6);
		setText(expyear, year);
		String expirayyear = getAttribute(expyear);
		
		
		WebElement cvvnum = findLocatorbyId("cc_cvv");
		String cvnumber = getDataFromExcel("TC_003", 1, 7);
		setText(cvvnum, cvnumber);
		String cvvno = getAttribute(cvvnum);
		
		
		
		WebElement booking = findLocatorbyId("book_now");
		click(booking);
		
		Thread.sleep(5000);
		
		WebElement ordernumber = findLocatorbyId("order_no");
		String orderid = getAttributeValue(ordernumber, "value");
		System.out.println(orderid);
		
		writeDatacell("TC_003", 1, 8, orderid);
		
	}
	@After
	public void afterExecution() {
		Date d = new Date();
		System.out.println(d);

	}
	@AfterClass
	public static void afterClass() {
		quitBrowser();

	}
	
	

}
