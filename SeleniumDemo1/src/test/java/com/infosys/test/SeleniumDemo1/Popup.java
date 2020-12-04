package com.infosys.test.SeleniumDemo1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popup {
	
	
    @Test		
    public void ByPopup() throws InterruptedException					
    {	
	// Start chrome browser
		  System.setProperty("webdriver.chrome.driver", "F:\\\\Testing\\\\Selenium\\\\chromedriver_win3\\\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
	    driver.get("http://popuptest.com/goodpopups.html");
	    driver.manage().window().maximize();
	  // This step will result in an alert on screen
	    driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
	    
	    
	    String MainWindow=driver.getWindowHandle();		
	    // To handle all new opened window.				
	        Set<String> s1=driver.getWindowHandles();		
	    Iterator<String> i1=s1.iterator();				
	    while(i1.hasNext())			
	    {		
	        String ChildWindow=i1.next();		
	        		
	        if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	        {    		
	                // Switching to Child window
	                driver.switchTo().window(ChildWindow);	
	                Thread.sleep(2000);
	                // Closing the Child Window.
	                  driver.close();		
	        }		
	    }		
	    // Switching to Parent window i.e Main Window.
	        driver.switchTo().window(MainWindow);
	        Thread.sleep(5000);
	        // Closing the Child Window.
	          driver.close();
	    
	  }
}
