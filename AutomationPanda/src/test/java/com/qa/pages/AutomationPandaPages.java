package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPandaPages {
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Contact')]")
	WebElement contact;
	public WebElement getContact() {
		return contact;
	}
	@FindBy(xpath="//strong[text()='Contact Me']")
	WebElement ClkContactMe;
	public WebElement getClkContactMe() {
		return ClkContactMe;
	}
	@FindBy(id="g3-name")
	WebElement NameField;
	public WebElement getNameField() {
		return NameField;
	}
	@FindBy(id="g3-email")
	WebElement EmailField;
	public WebElement getEmailField() {
		return EmailField;
	}
	@FindBy(id="contact-form-comment-g3-message")
	WebElement MsgField;
	public WebElement getMsgField() {
		return MsgField;
	}
	
	public AutomationPandaPages(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}
}
