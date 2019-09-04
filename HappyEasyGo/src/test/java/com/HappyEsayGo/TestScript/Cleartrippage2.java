package com.HappyEsayGo.TestScript;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.java.ReadPropFile;

public class Cleartrippage2 extends Cleartrippage1 {
	@Test(priority=2)
	public void page2() throws InterruptedException, FileNotFoundException {
		ReadPropFile fp=new ReadPropFile();
		Thread.sleep(5000);

		driver.findElement(By.xpath(fp.readPropertiesFileTwo("selectflight.book.txt"))).click();
	}
}
