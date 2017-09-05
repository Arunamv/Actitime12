package com.actitime.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BasePage;
import com.actitime.generic.BaseTest;

public class LoginPage extends BasePage

{
	@FindBy(name="username")
	private WebElement untb;
	
	@FindBy(name="pwd")
	private WebElement pwtb;
	
	@FindBy(id="LoginButton")
	private WebElement unbtn;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement unmsg;
	
	@FindBy(xpath="//nobr[contains(.,'v.3')]")
	private WebElement unver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void verifyingTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}
	public  void enterusername(String un)
	{
		untb.sendKeys(un);
	}
	public void enterpossword(String pwd)
	{
		pwtb.sendKeys(pwd);
	}
	public void clickOnLoging()
	{
		unbtn.click();
	}
	public void verifyVersion(String eVersion)
	{
		String aversion=unver.getText();
		Assert.assertEquals(aversion,eVersion);
	}
	public void errorMessage()
	{
		VerifyElementPresent(unmsg);
	}
}
