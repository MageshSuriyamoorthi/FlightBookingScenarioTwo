package com.HappyEsayGo.TestScript;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.HappyEsayGo.Util.Click;
import com.selenium.java.ReadPropFile;


public class Cleartrippage1 /* extends Cleartripmain */ {
	WebDriver driver = new FirefoxDriver();
	ReadPropFile propread = new ReadPropFile();

	@Test(priority=1)
	public void Ctrip() throws FileNotFoundException, InterruptedException {

		ReadPropFile fp = new ReadPropFile();

		Click click = new Click();

		driver.get(fp.readPropertiesFileTwo("url"));

		driver.manage().window().maximize();

		driver.findElement(By.xpath(fp.readPropertiesFileTwo("searchpage.From.txt"))).sendKeys("Chennai");
        Thread.sleep(5000);
		driver.findElement(By.xpath(fp.readPropertiesFileTwo("searchpage.From.txt"))).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath(fp.readPropertiesFileTwo("searchpage.To.txt"))).sendKeys("Bangalore");
		Thread.sleep(5000);
		driver.findElement(By.xpath(fp.readPropertiesFileTwo("searchpage.To.txt"))).sendKeys(Keys.ENTER);

		Click.ClickOnElement(driver, fp.readPropertiesFileTwo("searchpage.departondate"));
		Thread.sleep(5000);
		Click.ClickOnElement(driver, fp.readPropertiesFileTwo("searchpage.Departon.txt"));

		click.selectDropdown(driver, fp.readPropertiesFileTwo("searchpage.Adults.txt"), "1");

		click.selectDropdown(driver, fp.readPropertiesFileTwo("searchpage.Children.txt"), "1");

		driver.findElement(By.xpath(fp.readPropertiesFileTwo("searchpage.searchFlight.txt"))).click();

			}
}
/*
 * (dataProvider = "SearchProvider",dataProviderClass =
 * ReadingFileOnObject.class)
 */
