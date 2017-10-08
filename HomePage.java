package com.testing.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void waitforLoginPagetoLoad()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("themeBeetle")));
	}
	public WebElement getOriginCityTextBox()
	{
	 return driver.findElement(By.id("BE_flight_origin_city"));
	}
	public WebElement getDestiantionCityTextBox()
	{
	return driver.findElement(By.id("BE_flight_arrival_city"));
	}
	public WebElement getDepartureDate()
	{
		return driver.findElement(By.id("a_2018_2_22"));
	}
	
	public WebElement getNonStopFlightCheckbox()
	{
		return driver.findElement(By.xpath("(//a/i[@class='ico ico-checkbox'])[1]"));
	}
	
	public WebElement getSearchButton()
	{
		return driver.findElement(By.xpath("//div/input[@value='Search']"));

	}
	public WebElement getAccountbutton()
	{
	
		WebElement myAccount = driver.findElement(By.xpath(".//*[@id='userSignInStrip']/a"));
		return myAccount;
	}
	
	
	public WebElement getLoginButton()
	{
		WebElement getLoginButton= driver.findElement(By.linkText("Login"));
		return getLoginButton;
	}
	public WebElement getSignInButton()
	{
		return driver.findElement(By.xpath(".//*[@id='SignUpBtn']"));
	}
}
