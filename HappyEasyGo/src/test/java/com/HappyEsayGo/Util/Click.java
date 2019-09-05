package com.HappyEsayGo.Util;

import java.util.concurrent.TimeUnit;

import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import com.selenium.java.ReadingXlsxFile;

public class Click {
	public static WebElement element;

	public static void clickOnElementById(WebDriver driver, String Id) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id(Id)).click();

	}
	// driver.findElement(By.xpath(xpath)).click();
	public static void SendkeysOnElement(WebDriver driver, String xpath, int number) throws Exception {
		ReadingXlsxFile xlsx = new ReadingXlsxFile();
		// int i = 1;
		String value[] = xlsx.xlxsvalReturn();
		// System.out.println(value.toString());

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(xpath)).sendKeys(value[number]);

		// System.out.println(val[i]);

	}

	public static void selectDropdown(WebDriver driver,String xpath, String visibleText) {
		element = driver.findElement(By.xpath(xpath));
		Select noOfpeople = new Select(element);
		noOfpeople.selectByVisibleText(visibleText);

	}
	public static void ClickElement(WebDriver driver,String xpath) {
		 driver.findElement(By.xpath(xpath)).click();

	}
	
	   public static void ClickOnElement(WebDriver driver,  final String xpath) {
	   	FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver).pollingEvery(1, TimeUnit.SECONDS)
	   	.withTimeout(30, TimeUnit.SECONDS).ignoring(ElementNotInteractableException.class);
	   	wait.until(new Function<WebDriver, Boolean>() {
	   	public Boolean apply(WebDriver driver) {
	    driver.findElement(By.xpath(xpath)).click();
	   	return true;
	   	}
	});
	   }
}

/*
 * //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) .withTimeout(30,
 * TimeUnit.SECONDS) .pollingEvery(5, TimeUnit.SECONDS)
 * .ignoring(NoSuchElementException.class); WebElement clickseleniumlink =
 * wait.until(new Function<WebDriver, WebElement>(){
 * 
 * public WebElement apply(WebDriver driver ) { return
 * driver.findElement(By.xpath(xpath)); } }); clickseleniumlink.click();
 */