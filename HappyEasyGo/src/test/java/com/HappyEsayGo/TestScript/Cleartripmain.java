package com.HappyEsayGo.TestScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cleartripmain {
	protected WebDriver driver;

	@Parameters("selecteddriver")
	@Test(priority = 0)
	public void setBrowser(String selecteddriver) throws IOException {

		switch (selecteddriver) {
		case "chrome":
			driver = new ChromeDriver();
			driver.get("https://www.cleartrip.com/");
			break;

		case "firefox":
			driver = new FirefoxDriver();
			driver.get("https://www.cleartrip.com/");
			break;
		}

	}

}
