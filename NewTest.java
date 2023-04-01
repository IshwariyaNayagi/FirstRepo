package com.testng.programme;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	private Object keys;
	
	
  @Test
 public void openbrowser() {
  
 driver.findElement( By.xpath("//input[@id='userName']")).sendKeys("harshad",Keys.ENTER);
 driver.findElement( By.xpath("//input[@id='userEmail']")).sendKeys( "ish@gmail.com",Keys.ENTER);
 driver.findElement( By.xpath("//textarea[@id='permanentAddress']")).sendKeys("adyar",Keys.ENTER);
 driver.findElement( By.xpath("//textarea[@id='currentAddress']")).sendKeys("adyar",Keys.ENTER);
 driver.findElement(By.xpath("//id=['submit']")).sendKeys( Click);
 
	  
  }
  @BeforeTest
  public void openBrowser() {
	  System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");  
	  driver=new EdgeDriver();
	  driver.manage().window ().maximize();
	  driver.get("https://demoqa.com/text-box");
  }
  
  

  @AfterTest
  public void afterTest() {
  }

}
