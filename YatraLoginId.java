package com.testing.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YatraLoginId {
	WebDriver driver;
	public YatraLoginId(WebDriver driver)
	{
		this.driver = driver;
	}
	public void waitforLoginPagetoLoad()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-form-container")));
	}
	public WebElement getEmailIdTextBox()
	{
	 return driver.findElement(By.id("login-email"));
	}
	public WebElement getContinueButton()
	{
	 return driver.findElement(By.xpath("//button[text() = 'Continue']"));
	}
	public WebElement getPasswordTextBox()
	{
	 return driver.findElement(By.id("login-password"));
	}
	public WebElement getLoginButton()
	{
	 return driver.findElement(By.xpath("//button[text() = 'Login']"));
	}
	

}
