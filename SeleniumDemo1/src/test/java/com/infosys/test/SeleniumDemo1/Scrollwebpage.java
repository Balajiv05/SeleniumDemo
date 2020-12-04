package com.infosys.test.SeleniumDemo1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scrollwebpage {

	    WebDriver driver;
	    @Test
	    public void ByScrollWebPageMethod() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver_win3\\chromedriver.exe");
	        driver = new ChromeDriver();

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");

	        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
	        driver.manage().window().maximize();

	        // This  will scroll down the page by  1000 pixel vertical		
	        js.executeScript("window.scrollBy(0,1000)");
	        
	        Thread.sleep(5000);
	        
	        driver.close();
	    }
 }
