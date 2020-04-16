package com.practise.Base;

import org.testng.annotations.AfterMethod;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practise.PageActions.TopNavigation;
import com.practise.utilities.ExcelReader;
import com.practise.utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base {

	public static  WebDriver driver;
	public static WebDriverWait wait;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\resources\\Excel\\testdata.xlsx");
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public TopNavigation top;
	public static void initConfigurations()
	{
		if (Constant.browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", "/src/executables/geckodriver_1.exe");
			driver = new FirefoxDriver();
			driver.get(Constant.url);
			wait= new WebDriverWait(driver, 10);
		}
	}
	
	@AfterMethod
	public static void tearDown()
	{
		driver.quit();
	}
}
