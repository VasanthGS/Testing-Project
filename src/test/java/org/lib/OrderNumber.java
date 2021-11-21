package org.lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderNumber extends LibGlobal {
	public OrderNumber() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	 WebElement ordernumber;
	public WebElement getOrdernumber() {
		return ordernumber;
	}

}
