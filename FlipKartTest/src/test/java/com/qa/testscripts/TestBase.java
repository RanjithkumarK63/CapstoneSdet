package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.pages.FlipkartPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	WebDriver driver;
	FlipkartPages FP;
	
	@Parameters({"Url"})
	
	@BeforeTest
	public void setUp(String Url) {
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\RANJITHKARUPPUSAMY\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		FP=new  FlipkartPages(driver);		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}