package com.infosys.test.SeleniumDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dropdown {
			
	    @Test		
	    public void DragnDrop() throws InterruptedException					
	    {	
	    	// Start chrome browser
	    	  System.setProperty("webdriver.chrome.driver", "F:\\\\Testing\\\\Selenium\\\\chromedriver_win3\\\\chromedriver.exe");
	    	  ChromeDriver driver = new ChromeDriver();
	    	  // start the application
	    	  driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	    	  
	    	  driver.manage().window().maximize();
	    	  // First we have to click on menu item then only dropdown items will
	    	  // display
	    	  driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/button/span")).click();
	    	  // adding 2 seconds wait to avoid Sync issue
	    	  Thread.sleep(2000);
	    	  // Dropdown items are coming in <a> tag so below xpath will get all
	    	  // elements and findElements will return list of WebElements
	    	  List<WebElement> list = driver.findElementsByXPath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/ul/li[4]/a/label");
	    	  // We are using enhanced for loop to get the elements
	    	  for (WebElement ele : list)
	    	  {
	    	   // for every elements it will print the name using innerHTML
	    	   System.out.println("Values " + ele.getAttribute("innerHTML"));
	    	   // Here we will verify if link (item) is equal to Java Script
	    	   if (ele.getAttribute("innerHTML").contains("Selenium")) {
	    	    // if yes then click on link (iteam)
	    	    ele.click();// break the loop or come out of loop
	    	    break;
	    	   }
	    	  }
	    	  driver.close();
	    	
	 }		
	}

