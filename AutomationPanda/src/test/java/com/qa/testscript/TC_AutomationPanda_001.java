package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_AutomationPanda_001 extends TestBase{
	
	@Test
	public void ContactTest() throws InterruptedException {
		AP.getContact().click();
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.)
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		String actualtitle="Contact | Automation Panda";
		Assert.assertEquals(actualtitle, title, "Title matched");
		AP.getNameField().sendKeys("Ranjith");
		AP.getEmailField().sendKeys("Ranjith@gmail.com");
		AP.getMsgField().sendKeys("Good morning");
		AP.getClkContactMe().click();
		boolean msg=driver.getPageSource().contains("Your message has been sent");
		Assert.assertTrue(msg, actualtitle);
	}
}
