package com.projectDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class launchChrome {
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse-workspace/projectDemo/Resources/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("test-type");
	    options.addArguments("start-maximized");
	    options.addArguments("--js-flags=--expose-gc");  
	    options.addArguments("--enable-precise-memory-info"); 
	    options.addArguments("--disable-popup-blocking");
	    options.addArguments("--disable-default-apps");
	    options.addArguments("test-type=browser");
	    options.addArguments("disable-infobars");
	    WebDriver driver = new ChromeDriver(options);
	    driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
	}
}
