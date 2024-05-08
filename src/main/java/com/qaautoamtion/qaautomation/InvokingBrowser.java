package com.qaautoamtion.qaautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokingBrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Firfox Launch
//		System.setProperty("webdriver.gecko.driver", "./Browsers/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "./Browsers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();

	}

}
