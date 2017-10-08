package com.testing.generichandlers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.testing.ui.HomePage;

public class MouseHandlers {

	public static void mouseHover(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	public static void contextclick(WebDriver driver,WebElement element,String sendKey)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).contextClick().sendKeys(sendKey).build().perform();
	}
	public static void leftclick(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).click().build().perform();    
	}

}
