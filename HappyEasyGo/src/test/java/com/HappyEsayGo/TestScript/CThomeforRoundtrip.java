package com.HappyEsayGo.TestScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CThomeforRoundtrip   {
	protected WebDriver driver;
	@Parameters("selecteddriver")
	@Test(priority = 1)
	public void roundtripbooking(String selecteddriver) throws IOException {
		
		/*
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Actions
		 * actions = new Actions(driver); WebElement elementLocator =
		 * driver.findElement(By.xpath(
		 * "//img[@src='//ui.cltpstatic.com/images/brand/cleartrip_logo_book.png']"));
		 * actions.doubleClick(elementLocator).perform();
		 */
		
		switch (selecteddriver) {
		case "chrome":
			driver = new ChromeDriver();
			driver.get("https://www.cleartrip.com/");
			driver.get("http://www.cleartrip.com");
			driver.manage().window().maximize();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			driver.get("https://www.cleartrip.com/");
			driver.get("http://www.cleartrip.com");
			driver.manage().window().maximize();
			break;	 	  
		}	
	
	}
}
