package com.practise.rough;

import org.testng.annotations.Test;

import com.practise.Base.Base;
import com.practise.PageActions.HomePageAction;
import com.practise.PageActions.LoginPageAction;

public class SignIn {
	@Test
	public void signIn() throws Exception {
		Base.initConfigurations();
		HomePageAction homePageAction = new HomePageAction();
		homePageAction.gotoLogin();
		LoginPageAction login = new LoginPageAction();
		login.doLogin();

	}

}
