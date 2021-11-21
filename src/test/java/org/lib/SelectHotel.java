package org.lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobal{
	public SelectHotel() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="radiobutton_0")
	private WebElement clickradiobtn;
	@FindBy(id="continue")
	private WebElement clickcontinuebtn;
	public WebElement getClickradiobtn() {
		return clickradiobtn;
	}
	public WebElement getClickcontinuebtn() {
		return clickcontinuebtn;
	}
	public void select( ) {
		click(getClickradiobtn());
		click(getClickcontinuebtn());
		
	}

}
