package org.lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement textuser;

	@FindBy(id = "password")
	private WebElement textpass;
	@FindBy(name = "login")
	private WebElement btnlogin;
	
	public WebElement getTextuser() {
		return textuser;
	}
	public WebElement getTextpass() {
		return textpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public void login(String username,String password) {
		setText(getTextuser(), username);
		setText(getTextpass(), password);
		click(getBtnlogin());

	}

}
