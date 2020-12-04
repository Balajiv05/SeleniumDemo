package com.infosys.test.SeleniumDemo1;



import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;		
	


public class DragandDrop {				

    WebDriver driver;			
    @Test		
    public void DragnDrop()					
    {	
    	 //System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
        System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver_win3\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");	
        driver.manage().window().maximize();
     
	//Element which need to drag.		
        WebElement From=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));	
        
      //Element which need to drop.	
        WebElement To=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
      
        //Using Action class for drag and drop.		
        Actions act=new Actions(driver);					
      
        //Drag and Drop by Pixel.		
        act.dragAndDropBy(From,168, 168).build().perform();	
        
        driver.close();
 }		
}