package org.lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends LibGlobal {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement TypeFirstName;
	@FindBy(id="last_name")
	private WebElement typeLastName;
	@FindBy(id="address")
	private WebElement typeAddress;
	@FindBy(id="cc_num")
	private WebElement cardNumber;
	@FindBy(id="cc_type")
	private WebElement cardType;
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	@FindBy(id="cc_cvv")
	private WebElement ccvnumber;
	@FindBy(id="book_now")
	private WebElement booking;
	public WebElement getTypeFirstName() {
		return TypeFirstName;
	}
	public WebElement getTypeLastName() {
		return typeLastName;
	}
	public WebElement getTypeAddress() {
		return typeAddress;
	}
	public WebElement getCardNumber() {
		return cardNumber;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCcvnumber() {
		return ccvnumber;
	}
	public WebElement getBooking() {
		return booking;
	}
	public void book(String TypeFirstName,String typeLastName,String typeAddress,String cardNumber,String cardType,String expiryMonth,String expiryYear,String ccvnumber ) {
		setText(getTypeFirstName(), TypeFirstName);
		setText(getTypeLastName(), typeLastName);
		setText(getTypeAddress(), typeAddress);
		setText(getCardNumber(), cardNumber);
		setText(getCardType(), cardType);
		setText(getExpiryMonth(), expiryMonth);
		setText(getExpiryYear(), expiryYear);
		setText(getCcvnumber(), ccvnumber);
		click(getBooking());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}



