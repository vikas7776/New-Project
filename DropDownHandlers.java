package com.testing.generichandlers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlers {
public static void selectOptionByIndex(WebElement element,int index)
{
 Select sct = new Select(element);
 sct.selectByIndex(index);
}
public static void selectOptionByValue(WebElement element,String value)
{
 Select sct = new Select(element);
 sct.selectByValue(value);
}
public static void selectOptionByVisibleText(WebElement element,String visibleText)
{
 Select sct = new Select(element);
 sct.selectByVisibleText(visibleText);
}

}
