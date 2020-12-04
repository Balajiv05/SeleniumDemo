package com.infosys.test.SeleniumDemo1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithoutUsingSendKeys {

	   
		WebDriver driver;
	    @Test
	    public void ByWithoutUsingSendKey() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver_win3\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://www.google.com");
	        driver.manage().window().maximize();
	        JavascriptExecutor myExecutor = ((JavascriptExecutor) driver);
	        myExecutor.executeScript("document.getElementsByName('q')[0].value='Balaji Biradar'");
	        Thread.sleep(5000);
	        driver.quit();
	        }

	        
 }
