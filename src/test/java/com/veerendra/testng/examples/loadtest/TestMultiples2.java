package com.veerendra.testng.examples.loadtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestMultiples2 {

	  private WebDriver driver;

	
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matias\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      driver = new ChromeDriver();
	  }

	  @AfterClass
	  public void afterClass() {
	      driver.quit();
	  }

		
	@Test()	
	public void loadTestNorthernTrust() {

		driver.get("http://www.ntrs.com");
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Northern Trust | Wealth Management, Asset Management & Asset Servicing", driver.getTitle());

	}

	

}