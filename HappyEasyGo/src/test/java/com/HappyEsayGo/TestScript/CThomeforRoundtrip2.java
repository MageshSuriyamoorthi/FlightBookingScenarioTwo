package com.HappyEsayGo.TestScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.HappyEsayGo.Util.Click;
import com.selenium.java.ReadPropFile;

public class CThomeforRoundtrip2 extends CThomeforRoundtrip {
	ReadPropFile propread = new ReadPropFile();
	@Test(priority = 2)
	public void Search() throws IOException {

		Click.ClickOnElement(driver, propread.readPropertiesFileThree("locators.rtrip.values"));

		driver.findElement(By.xpath(propread.readPropertiesFileThree("locators.from.values"))).sendKeys("chennai");

		driver.findElement(By.xpath(propread.readPropertiesFileThree("locators.from.values"))).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath(propread.readPropertiesFileThree("locators.to.values"))).sendKeys("hyderabad");

		driver.findElement(By.xpath(propread.readPropertiesFileThree("locators.to.values"))).sendKeys(Keys.ENTER);

		Click.ClickOnElement(driver, propread.readPropertiesFileThree("locators.depart.locator"));

		Click.ClickOnElement(driver, propread.readPropertiesFileThree("locators.depton.values"));

		Click.ClickOnElement(driver, propread.readPropertiesFileThree("locators.returntab.values"));

		Click.ClickOnElement(driver, propread.readPropertiesFileThree("locators.returndate.values"));

		Click.selectDropdown(driver, propread.readPropertiesFileThree("locators.Adults.values"), "1");

		Click.selectDropdown(driver, propread.readPropertiesFileThree("locators.Children.values"), "1");

		Click.selectDropdown(driver, propread.readPropertiesFileThree("locators.Infants.values"), "0");

		Click.ClickOnElement(driver, propread.readPropertiesFileThree("locators.searchFlight.values"));
	}
}
