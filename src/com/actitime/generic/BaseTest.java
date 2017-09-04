package com.actitime.generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConstant 
{
	public WebDriver driver=null;
	@BeforeMethod
	public void preConditions()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	}
	@AfterMethod
	public void postConditions()
	{
		driver.close();
	}

}
