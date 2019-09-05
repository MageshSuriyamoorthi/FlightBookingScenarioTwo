package com.HappyEsayGo.TestScript;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.HappyEsayGo.Util.Click;

public class CThomeforRoundtrip4 extends CThomeforRoundtrip3 {
	@Test(priority=4)
public void roundtripbooking4() throws FileNotFoundException {
	
	Click.ClickOnElement(driver, propread.readPropertiesFileThree("Itinerarystep.Insurance.values"));

	Click.ClickOnElement(driver, propread.readPropertiesFileThree("Itinerarystep.ContinueDetails.values"));

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath(propread.readPropertiesFileThree("emailstep.EmailId.values")))
			.sendKeys("AAABBB@gmail.com");
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].click();",driver.findElement(By.xpath(propread.readPropertiesFileThree("emailstep.Continue.values"))));

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	void formfilling() throws FileNotFoundException {
	
	Click.selectDropdown(driver, propread.readPropertiesFileThree("locators.Title.values"), "Mr");
	
	driver.findElement(By.xpath(propread.readPropertiesFileThree("locators.FirstName.values"))).sendKeys("AAA");
	
	driver.findElement(By.xpath(propread.readPropertiesFileThree("locators.LastName.values"))).sendKeys("BBB");
	
	Click.selectDropdown(driver, propread.readPropertiesFileThree("locators.textarea.Title"), "Mstr");
	
	driver.findElement(By.xpath(propread.readPropertiesFileThree("locators.childFirstName.values")))
			.sendKeys("CCC");
	driver.findElement(By.xpath(propread.readPropertiesFileThree("locators.childLastName.values")))
			.sendKeys("DDD");
	Click.selectDropdown(driver, "locators.textarea.Day.values", "21");
	Click.selectDropdown(driver, "locators.textarea.Month.values", "Feb");
	Click.selectDropdown(driver, "locators.textarea.year.values", "2016");
	driver.findElement(By.xpath(propread.readPropertiesFileThree("locators.textarea.Mobileno.values")))
			.sendKeys("9999999999");
	driver.findElement(By.xpath(propread.readPropertiesFileThree("locators.textarea.Continue.values"))).click();

}
}
