package com.infosys.test.SeleniumDemo1.Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetAttribute {
	 @Test		
	    public void GetAttributeMethods() throws InterruptedException					
	    {	
	    	// Start chrome browser
	    	  System.setProperty("webdriver.chrome.driver", "F:\\\\Testing\\\\Selenium\\\\chromedriver_win3\\\\chromedriver.exe");
	    	  ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup");

		WebElement searchTextBox= driver.findElement(By.id("firstName"));

		// retrieving html attribute value using getAttribute() method
		String typeValue=searchTextBox.getAttribute("class");
		System.out.println("Value of type attribute: "+typeValue);

		String autocompleteValue=searchTextBox.getAttribute("autocomplete");
		System.out.println("Value of autocomplete attribute: "+autocompleteValue);

		// Retrieving value of attribute which does not exist
		String nonExistingAttributeValue=searchTextBox.getAttribute("nonExistingAttribute");
		System.out.println("Value of nonExistingAttribute attribute: "+nonExistingAttributeValue);
		  driver.close();
		}
		}