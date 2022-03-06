package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pet_Docs {
public WebDriver driver;
	
	public pet_Docs(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_on_yes=By.xpath("//div[text()='Yes, please require the following fields']");
	By click_on_addnewDocs=By.xpath("//button[text()='Add new doc']");
	By enter_docs=By.xpath("//label[text()='Other info required']/following::input");
	By click_on_add=By.xpath("//button[text()='Add']");
	By click_next=By.xpath("//button[text()='Next']");
	
	public WebElement user_click_on_yes()
	{
		return driver.findElement(click_on_yes);
	}
	public WebElement user_click_on_addnewDocs()
	{
		return driver.findElement(click_on_addnewDocs);
	}
	public WebElement user_enter_docs()
	{
		return driver.findElement(enter_docs);
	}
	
	public WebElement user_click_on_add()
	{
		return driver.findElement(click_on_add);
	}
	public WebElement user_click_next()
	{
		return driver.findElement(click_next);
	}

}
