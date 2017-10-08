package com.testing.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void waitforLoginPagetoLoad()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flightSRP")));
	}
	public WebElement getEarlyMorningBox()
	{
		 return driver.findElement(By.className("ytfi-early-morning "));
	}
	public WebElement getNonStopBox()
	{
		return driver.findElement(By.xpath("(//span[@class='full bxs txt-ac'])[1]"));
	}
	public WebElement getRefundableCheckBox()
	{
		return driver.findElement(By.xpath("(//span[@class='checkbox'])[1]"));
	}
	public WebElement getAirAsiacheckbox()
	{
		return driver.findElement(By.xpath("//span[contains(text(),'Air Asia'])"));
	}
	public WebElement getAirIndiacheckbox()
	{
		return driver.findElement(By.xpath("//span[contains(text(),'Air India'])"));
	}
}