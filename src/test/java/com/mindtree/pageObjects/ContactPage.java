package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.ContactPageUI;

public class ContactPage 
{

	public WebDriver driver;
	public ContactPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getName()
	{
		return driver.findElement(ContactPageUI.name);
	}
	public WebElement getEmail()
	{
		return driver.findElement(ContactPageUI.email);
	}
	public WebElement getMessage()
	{
		return driver.findElement(ContactPageUI.message);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(ContactPageUI.submit);
	}
	
}
