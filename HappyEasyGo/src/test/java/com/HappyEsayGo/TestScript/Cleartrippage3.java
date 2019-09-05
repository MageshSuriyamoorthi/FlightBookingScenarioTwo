package com.HappyEsayGo.TestScript;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.java.ReadPropFile;

public class Cleartrippage3 extends Cleartrippage2 {
	@Test(priority=3)
public void page3() throws FileNotFoundException, InterruptedException {
	ReadPropFile fp=new ReadPropFile();
	driver.findElement(By.xpath(fp.readPropertiesFileTwo("Iternitystep.Insurance.txt"))).click();

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("Iternitystep.ContinueDetails.txt"))).click();

	Thread.sleep(5000);

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("Emailaddressstep.EmailId.txt")))
			.sendKeys("BBBCCC@gmail.com");

	Thread.sleep(5000);

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("Emailaddressstep.Continue.txt"))).click();

	Thread.sleep(5000);

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("travellers.Title.txt"))).click();
	
	Thread.sleep(5000);

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("travellers.FirstName.txt"))).sendKeys("BBB");

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("travellers.LastName.txt"))).sendKeys("CCC");

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("locators.textarea.Title"))).click();

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("locators.textarea.FirstName"))).sendKeys("DDD");

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("locators.textarea.LastName"))).sendKeys("CCC");

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("travellers.Day.txt"))).click();

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("travellers.Month.txt"))).click();

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("travellers.year.txt"))).click();

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("travellers.Mobileno.txt"))).sendKeys("9999999999S");

	driver.findElement(By.xpath(fp.readPropertiesFileTwo("travellers.Continue.txt"))).click();

}
}
