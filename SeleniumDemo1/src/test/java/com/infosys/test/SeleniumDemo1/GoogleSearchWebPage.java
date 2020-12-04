package com.infosys.test.SeleniumDemo1;

	  import org.openqa.selenium.By;
	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.WebElement;
	  import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

	  public class GoogleSearchWebPage {

		   @Test		
		    public void ByGoogleSearchWebPage() throws InterruptedException					
		    {	
		    	// Start chrome browser
		    	  System.setProperty("webdriver.chrome.driver", "F:\\\\Testing\\\\Selenium\\\\chromedriver_win3\\\\chromedriver.exe");
		    	  ChromeDriver driver = new ChromeDriver();
	          driver.manage().window().maximize();
	          driver.get("https://www.google.com/");
	          driver.findElement(By.name("q")).sendKeys("Testing");
	          Thread.sleep(Long.parseLong("1000"));
	          List<WebElement> LIST = driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
	          System.out.println(LIST.size());


	          for (int i = 0; i < LIST.size(); i++)
	          {
	              //System.out.println(LIST.get(i).getText());
	              if (LIST.get(i).getText().contains("testing types"))
	              {
	                  LIST.get(i).click();
	                  break;
	              }
	          }
	      }
	  }
