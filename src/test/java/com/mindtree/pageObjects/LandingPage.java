package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.LandingPageUI;

public class LandingPage 
{
	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getContact()
	{
		return driver.findElement(LandingPageUI.contact);
	}
}
