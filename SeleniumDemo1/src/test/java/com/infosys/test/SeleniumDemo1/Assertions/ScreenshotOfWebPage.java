package com.infosys.test.SeleniumDemo1.Assertions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotOfWebPage {
	  @Test		
	    public void ScreenshotMethod() throws InterruptedException					
	    {	
	    	// Start chrome browser
	    	  System.setProperty("webdriver.chrome.driver", "F:\\\\Testing\\\\Selenium\\\\chromedriver_win3\\\\chromedriver.exe");
	    	  ChromeDriver driver = new ChromeDriver();
        
        //navigate to url
        driver.get("https://api.jquery.com/dblclick/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
       //Take the screenshot
        
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\Dell\\git\\SeleniumDemo1\\SeleniumDemo1\\Screenshot\\Home.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        //closing the webdriver
        driver.close();
    }
}