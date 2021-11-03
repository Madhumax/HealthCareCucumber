package com.mindtree.reUsableComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHelper 
{

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver baseFile() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\java\\com\\mindtree\\resources\\config.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		return driver;
		
	}
}
