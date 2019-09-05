package com.HappyEsayGo.TestScript;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.HappyEsayGo.Util.Click;
import com.HappyEsayGo.Util.Util;
import com.selenium.java.ReadPropFile;
import com.selenium.java.ReadingXlsxFile;

public class HEGHSite1 extends Util {

	ReadPropFile prop = new ReadPropFile();
	ReadingXlsxFile rxlxs = new ReadingXlsxFile();

	@Test(priority = 1)
	void Url() throws Exception {
		// String[] value = null;

		driver.get("https://www.happyeasygo.com/");

		driver.manage().window().maximize();

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.button.clickflight"));

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.rbutton.roundtrip"));

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.rbutton.oneway"));

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.rbutton.roundtrip"));

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.textbox.from"));

		Click.SendkeysOnElement(driver, prop.readPropertiesFile("locators.textbox.from"), 1);
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.readPropertiesFile("locators.textbox.from"))).sendKeys(Keys.ENTER);

		Click.SendkeysOnElement(driver, prop.readPropertiesFile("locators.textbox.to"), 2);

		driver.findElement(By.xpath(prop.readPropertiesFile("locators.textbox.to"))).sendKeys(Keys.ENTER);

		Click.ClickOnElement(driver, prop.readPropertiesFile("locators.searchflight.button"));
	}
}

