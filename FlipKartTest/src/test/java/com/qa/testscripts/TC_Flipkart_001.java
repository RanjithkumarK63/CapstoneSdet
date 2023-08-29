package com.qa.testscripts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Flipkart_001 extends TestBase{

	@Test
	public void flipkartCheck() throws InterruptedException {
		FP.getClose().click();
		Assert.assertTrue(FP.getImage().isDisplayed(), "Flipkart Is present in top");
		System.out.println("Flipkart Logo is presented");	
		FP.getSearchBox().sendKeys("“iphone 14"+Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> list=FP.getSearchItems();
		System.out.println(list.size());
		String parent=driver.getWindowHandle();
		list.get(0).click();
		Set<String> li=driver.getWindowHandles();
		for(String str:li) {
			if(!str.equals(parent))
				driver.switchTo().window(str);
		}
		Thread.sleep(2000);
		String title="APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com";
		Assert.assertEquals(title, driver.getTitle(), "Title was matched");
	}
}