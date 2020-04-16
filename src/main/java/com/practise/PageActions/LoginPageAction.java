package com.practise.PageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practise.Base.Base;
import com.practise.PageLocator.LoginPageLocator;

public class LoginPageAction extends Base {

	LoginPageLocator loginPageLocator;

	public LoginPageAction() {
		this.loginPageLocator = new LoginPageLocator();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(driver, this.loginPageLocator);
		
	}

	public void doLogin() throws Exception {
		
		loginPageLocator.email.sendKeys("shwetalavate7@gmail.com");
		wait.until(ExpectedConditions.visibilityOf(loginPageLocator.nextBtn));
		loginPageLocator.nextBtn.click();
		wait.until(ExpectedConditions.visibilityOf(loginPageLocator.password));
		loginPageLocator.password.sendKeys("Zoho@123");
		wait.until(ExpectedConditions.visibilityOf(loginPageLocator.nextBtn));
		loginPageLocator.nextBtn.click();
		Thread.sleep(1000);
		System.out.println("logged in");

	}
}
