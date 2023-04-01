package com.testng.programme;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class UsingTestNG<webdriver> {
	  EdgeDriver driver;
	  
	  @BeforeTest
	  public void openBrowser() {
		  System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");  

	
		
			  driver=new EdgeDriver();
			  driver.manage().window ().maximize();
			  driver.get("https://demoqa.com/elements");
	  }
			  		
	
	@Text
	
	public void testBox1() throws InterruptedException {
	
	driver.findElement( By.xpath(" //span[.='Test Box']")).click();
	driver.findElement( By.xpath(" //input[@id='userName']")).sendKeys( "ishwariya",Keys.ENTER);
	driver.findElement( By.xpath(" //input[@id='userEmail']")).sendKeys("ishu2@gmail.com",Keys.ENTER);
	driver.findElement( By.xpath(" //text area[@id='currentAddress']")).sendKeys(" adyar",Keys.ENTER);
	driver.findElement( By.xpath(" //text area[@id='permanentAddress']")).sendKeys(" adyar",Keys.ENTER );
	
	Thread.sleep(3000);
	Actions action= new Actions( driver);
	WebElement e= driver.findElement( By.xpath("//button [ class='btn- primary']"));
	JavascriptExecutor js=( JavascriptExecutor)driver;
	js.executeScript( "window.scrollby(0,200)");
	action.moveToElement( e).click().build().perform();
	}
	@Test
	public void checkBox() {
		driver.findElement( By.xpath("// span [.='Check Box']")).click();
		driver.findElement( By.xpath("//span[@class=' rct- checkbox']"));
	}
	@Test
	
	public void radioButton() throws InterruptedException {
		driver.findElement( By.xpath("//span[.='Radio Button']")).click();
		Thread.sleep(2000);
		Actions action= new Actions( driver);
		WebElement e1= driver.findElement(By.xpath("//input[@id='yesRadio']"));
		action.moveToElement(e1).click().build().perform();
	}
	
	public void testBox() throws InterruptedException {
		
		driver.findElement( By.xpath(" //span[.=Test Box']")).click();
		driver.findElement( By.xpath(" //span[']")).sendKeys( "ishwariya",Keys.ENTER);
		driver.findElement( By.xpath(" //span[.=Test Box']")).sendKeys("ishu2@gmail.com",Keys.ENTER);
		driver.findElement( By.xpath(" //span[.=Test Box']")).sendKeys(" adyar",Keys.ENTER);
		driver.findElement( By.xpath(" //span[.=Test Box']")).sendKeys(" adyar",Keys.ENTER );
			
	}	
	public void webTables() throws InterruptedException {
	
	driver.findElement( By.xpath(" //span[.='Web Tables']")).click();
	driver.findElement( By.xpath(" //span[@id='firstName']")).sendKeys( "ishwariya",Keys.ENTER);
	driver.findElement( By.xpath(" //span[@id='lastName']")).sendKeys( "vaithya",Keys.ENTER);
	driver.findElement( By.xpath(" //input[@id='userEmail']")).sendKeys("ishu2@gmail.com",Keys.ENTER);
	driver.findElement( By.xpath(" //input[@id='age']")).sendKeys("50",Keys.ENTER);
	driver.findElement( By.xpath(" //input[@id='salary']")).sendKeys("5000",Keys.ENTER );
	driver.findElement( By.xpath(" //input[@id='department']")).sendKeys("testing",Keys.ENTER);	
			                     
	driver.findElement( By.xpath(" //button[.='submit']")).click();
	}

	@Test
public void links() {
	Actions action= new Actions( driver);
	WebElement e5= driver.findElement( By.xpath("//span [.='Links']"));
	JavascriptExecutor js=( JavascriptExecutor)driver;
	js.executeScript( "window.scrollby(0,200)");
	action.moveToElement( e5).click().build().perform();
	driver.findElement( By.xpath(" //a[.='Home']")).click();
	driver.findElement( By.xpath(" //a[@[id='dynamicLink']")).click();
	
	
	}
	public void brokenlinks() throws InterruptedException {
		Actions action= new Actions( driver);
		WebElement e6= driver.findElement( By.xpath("//span [.=' Broken Links-Images']"));
		JavascriptExecutor js=( JavascriptExecutor)driver;
		js.executeScript( "window.scrollby(0,200)");
		action.moveToElement( e6).click().build().perform();
		driver.findElement( By.xpath(" //a[.='Click Here for vaid link']")).click();
		Thread.sleep(2000);
		driver.findElement( By.xpath(" //a[@hreg='http://the-internet.herokuapp.com/status_codes/500']")).click();
		
			
	
			  	
			  
	}
		  
		  
		  
		  
		  
		  
	  }
