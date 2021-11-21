package org.lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelBooking extends LibGlobal {
	@FindBy(xpath="Booked Itinerary")
	 private WebElement cancel;
	@FindBy(id="btn_id_484354")
	 private WebElement cancelid;
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getCancelid() {
		return cancelid;
	}
	public void cancelBook() {
		click(getCancel());
		click(getCancelid());
	

	}

}
