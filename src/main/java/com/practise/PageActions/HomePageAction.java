package com.practise.PageActions;

import org.openqa.selenium.support.PageFactory;

import com.practise.Base.Base;
import com.practise.PageLocator.HomePageLocator;

public class HomePageAction extends Base{

	HomePageLocator homePageLocator;
	
	public HomePageAction()
	{
		this.homePageLocator=new HomePageLocator();
		PageFactory.initElements(driver, this.homePageLocator);
	}
	public HomePageAction  gotoLogin()
	{
	homePageLocator.login.click();
	return this;
	}
	
	public void gotoCustomers()
	{
		
	}
	public void gotoSupport()
	{
		
	}
	public void gotoSales()
	{
		
	}
}
