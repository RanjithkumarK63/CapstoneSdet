package com.qa.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.pages.AutomationPandaPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	WebDriver driver;
	AutomationPandaPages AP;
	@Parameters({"Url"})
	@BeforeTest
	public void setUp(String Url) {
		WebDriverManager.edgedriver().setup();
		
				driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		AP=new AutomationPandaPages(driver);
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
