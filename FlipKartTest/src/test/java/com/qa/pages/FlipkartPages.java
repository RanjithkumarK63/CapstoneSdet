package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPages {
	WebDriver driver;
	
	@FindBy(xpath="//button[contains(text(),'Request OTP')]//preceding::button[1]")
	WebElement Close;
	public WebElement getClose() {
		return Close;
	}
	
	@FindBy(className="_2xm1JU")
	WebElement Image;
	public WebElement getImage() {
		return Image;
	}
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchbox;
	public WebElement getSearchBox() {
		return searchbox;
	}
	
	@FindBy(xpath="//div[@class='_4rR01T']")
	List<WebElement> SearchItems;
	public List<WebElement> getSearchItems(){
		return SearchItems;
	}
	
	public FlipkartPages(WebDriver driver1) {
		this.driver=driver;
		PageFactory.initElements(driver1, this);
	}
}