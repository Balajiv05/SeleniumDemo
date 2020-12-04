package com.infosys.test.SeleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SetSizeOfBrowserWindow {


    WebDriver driver;
    @Test
    public void ByPixel() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver_win3\\chromedriver.exe");
        driver = new ChromeDriver();
        
        String url = "https://www.tutorialspoint.com/index.htm";
        
        driver.get(url);
  	  driver.manage().window().maximize();
  	  
        // maximize the browser
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        // fetching the current window size with getSize()
        System.out.println(driver.manage().window().getSize());
        //Create object of Dimensions class
        Dimension dm = new Dimension(450,630);
        //Setting the current window to that dimension
        driver.manage().window().setSize(dm);
        driver.close();
        }
}
