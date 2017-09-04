package com.actitime.generic;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils {
	public static void selectByIndex(WebElement element,int n)
	{
		Select sel=new Select(element);
		sel.selectByIndex(n);
	}
	public static void selectByValue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public static void selectByVisibelText(WebElement element,String visibletext)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(visibletext);
	}
	public static void moveToElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public static void dragAndDrop(WebDriver driver,WebElement src,WebElement dst)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst).perform();
	}
	public static void windowHandle(WebDriver driver,String eTitle)
	{
		Set<String> winhandle = driver.getWindowHandles();
		Iterator<String> itr = winhandle.iterator();
		while(itr.hasNext())
		{
			String wh = itr.next();
			driver.switchTo().window(wh);
			if(driver.getTitle().equals(eTitle));
			{
				
				break;
			}
		}
	}
	
	public static void deselectByIndex(WebElement element,int n)
	{
		Select sel=new Select(element);
		sel.deselectByIndex(n);
	}
	public static void deselectByValue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.deselectByValue(value);
	}
	public static void deselectByVisibleText(WebElement element,String visibletext)
	{
		Select sel=new Select(element);
		sel.deselectByVisibleText(visibletext);
	}
	
	

}
