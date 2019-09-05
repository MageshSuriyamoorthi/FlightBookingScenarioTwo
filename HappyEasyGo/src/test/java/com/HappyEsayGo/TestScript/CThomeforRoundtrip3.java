package com.HappyEsayGo.TestScript;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.HappyEsayGo.Util.Click;

public class CThomeforRoundtrip3 extends CThomeforRoundtrip2 {
	@Test(priority = 3)
	public void roundtripbooking3() throws IOException, InterruptedException {
	Thread.sleep(30000);
		driver.findElement(By.xpath("(//button[text()='Book'])[2]")).click();
			// driver.findElement(By.xpath(propread.readPropertiesFileThree("selectflightpage.book.values"))).click();
		}

		/*
		 * public static void roundtripbooking3(WebDriver driver, final String xpath) {
		 * FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver).pollingEvery(1,
		 * TimeUnit.SECONDS) .withTimeout(30,
		 * TimeUnit.SECONDS).ignoring(ElementNotInteractableException.class);
		 * wait.until(new Function<WebDriver, Boolean>() { public Boolean
		 * apply(WebDriver driver) {
		 * driver.findElement(By.xpath("(//button[text()='Book'])[2]")).click(); return
		 * true; } });
		 */
	}


