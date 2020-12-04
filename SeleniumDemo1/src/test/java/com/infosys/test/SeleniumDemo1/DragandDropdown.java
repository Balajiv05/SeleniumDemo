package com.infosys.test.SeleniumDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragandDropdown {

	 public static void main(String [] args) throws InterruptedException{
         //System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
         System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver_win3\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
         driver.manage().window().maximize();
         Thread.sleep(5000);
         System.out.println("Selenium Webdriver Script in Chrome browser | Software Testing Material");
         driver.close();
  }
}
