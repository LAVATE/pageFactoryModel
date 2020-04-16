package com.practise.rough;

import org.testng.annotations.Test;

import com.practise.Base.Base;
import com.practise.PageActions.HomePageAction;

public class ClickLogin {
	@Test
	public void clickLogin() {
		Base.initConfigurations();
		HomePageAction homePageAction = new HomePageAction();
		homePageAction.gotoLogin();
		System.out.println("clicking login");
		Base.tearDown();
		System.out.println("clicked");
	}

}
