package com.practise.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocator {

	@FindBy(css="#login_id")
	public WebElement email;
	
	@FindBy(css="#nextbtn")
	public WebElement nextBtn;
	
	@FindBy(css="#password")
	public WebElement password;
	
	
}
