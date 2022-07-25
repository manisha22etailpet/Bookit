package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class petHairLength {
	public WebDriver driver;
	
	public petHairLength(WebDriver driver)
	{
		this.driver=driver;
	}
	By click_add_new_hair_lenght=By.xpath("//button[contains(@class,'link-btn mt-4')]");
	By add_hair_length=By.className("mr-3");
	By click_on_add=By.xpath("//button[text()='Add']");
	By click_on_active=By.className("react-switch-handle");
	By click_on_deactive=By.className("react-switch-handle");
	By click_on_next=By.xpath("//button[text()='Next']");
	
	public WebElement user_click_add_new_hair_lenght()
	{
		return driver.findElement(click_add_new_hair_lenght);
	}
	
	public WebElement user_add_new_hair_lenght()
	{
		return driver.findElement(add_hair_length);
	}
	public WebElement user_click_on_add()
	{
		return driver.findElement(click_on_add);
	}
	public WebElement user_click_on_active()
	{
		return driver.findElement(click_on_active);
	}
	
	public WebElement user_click_on_deactive()
	{
		return driver.findElement(click_on_deactive);
	}
	public WebElement user_click_on_next()
	{
		return driver.findElement(click_on_next);
	}
	
	

}