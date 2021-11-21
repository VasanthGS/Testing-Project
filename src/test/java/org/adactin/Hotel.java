package org.adactin;

import java.io.IOException;

import org.lib.BookHotel;
import org.lib.LibGlobal;
import org.lib.LoginPage;
import org.lib.OrderNumber;
import org.lib.SearchHotel;
import org.lib.SelectHotel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hotel  {
	
	 public static void main(String[] args) throws IOException, InterruptedException {
		
		LibGlobal lb =new LibGlobal();
		WebDriver launchBrowser = lb.launchBrowser("chrome");
		lb.loadUrl("https://adactinhotelapp.com/");
		
		LoginPage lg = new LoginPage();
		lb.setText(lg.getTextuser(),lg.getDataFromExcel("TC_001", 1, 0));
		lb.setText(lg.getTextpass(),lg.getDataFromExcel("TC_001", 1, 1));
		
		lb.click(lg.getBtnlogin());
		
		SearchHotel shp = new SearchHotel();
		lb.setText(shp.getLocation(),shp.getDataFromExcel("TC_002", 0, 0));
		lb.setText(shp.getHotels(),shp.getDataFromExcel("TC_002", 1, 1));
		lb.setText(shp.getRoomtype(),shp.getDataFromExcel("TC_002", 1, 2));
		lb.setText(shp.getRoomnos(),shp.getDataFromExcel("TC_002", 1, 3));
		lb.setText(shp.getDatepick(),shp.getDataFromExcel("TC_002", 1, 4) );
		lb.setText(shp.getDateout(),shp.getDataFromExcel("TC_002", 1, 5));
		lb.setText(shp.getAdultroom(),shp.getDataFromExcel("TC_002", 1, 6) );
		lb.setText(shp.getChildroom(),shp.getDataFromExcel("TC_002", 1, 7));
		lb.click(shp.getSearch());
		SelectHotel sl = new SelectHotel();
		lb.click(sl.getClickradiobtn());
		lb.click(sl.getClickcontinuebtn());
		BookHotel bk = new BookHotel();
		lb.setText(bk.getTypeFirstName(),bk.getDataFromExcel("TC_003", 1, 0));
		lb.setText(bk.getTypeLastName(),bk.getDataFromExcel("TC_003", 1, 1));
		lb.setText(bk.getTypeAddress(),bk.getDataFromExcel("TC_003", 1, 2));
		lb.setText(bk.getCardNumber(), bk.getDataFromExcel("TC_003", 1, 3));
		lb.setText(bk.getCardType(),bk.getDataFromExcel("TC_003", 1, 4));
		lb.setText(bk.getExpiryMonth(),bk.getDataFromExcel("TC_003", 1, 5));
		lb.setText(bk.getExpiryYear(),bk.getDataFromExcel("TC_003", 1,6));
		lb.setText(bk.getCcvnumber(),bk.getDataFromExcel("TC_003", 1, 7));
		lb.click(bk.getBooking());
		Thread.sleep(5000);
		OrderNumber or = new OrderNumber();
		WebElement element = or.getOrdernumber();
	String value = lb.getAttributeValue(element, "value");
	System.out.println(value);
		
		
		
	
	

		
		
		
	}

}
