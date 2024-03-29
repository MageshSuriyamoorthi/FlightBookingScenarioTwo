package com.selenium.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropFile {
	public String readPropertiesFile(String elements) throws FileNotFoundException {
		Properties prop = new Properties();

		FileInputStream input = new FileInputStream(
				"D:\\new\\eclipse-workspace\\HappyEasyGo\\src\\test\\resources\\locator\\locators.properties");
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}
	public String readPropertiesFileTwo(String elements) throws FileNotFoundException {
		Properties prop = new Properties();

		FileInputStream input = new FileInputStream(
				"D:\\new\\eclipse-workspace\\HappyEasyGo\\src\\test\\resources\\locator\\locators2.properties");
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}
	public String readPropertiesFileThree(String elements) throws FileNotFoundException {
		Properties prop = new Properties();

		FileInputStream input = new FileInputStream(
				"D:\\new\\eclipse-workspace\\HappyEasyGo\\src\\test\\resources\\locator\\locators3.properties");
		try {
			prop.load(input);

		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = prop.getProperty(elements);
		return data;

	}

}
