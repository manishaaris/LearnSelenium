package com.example.demo;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
//import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class loginTest {
	private WebDriver driver;
	
	@BeforeMethod
	  public void setUp() {
		try {
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("no driver");
		}
	
		
	  }
	
  @Test
  public void f() {
	  
	 try {
		 
		 String actualString = driver.findElement(By.xpath("//h2['class=inlineBlock _3ma _6n _6s _6v']")).getText();
System.out.println(actualString);
		 String expectedString = "Connect with friends";

		 assertTrue(actualString.contains(expectedString));
		 
		 //assert.assertEquals(" Connect with friends and the", driver.getPageSource().contains(" Connect with friends and the"), message);
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maanishaaris2");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("maanishaaris2");
		//driver.findElement(By.cssSelector("input.login_form_input_box")).sendKeys("maanishaaris2");
		//driver.findElement(By.cssSelector("input#email[data-testid=royal_email]")).sendKeys("maanishaaris2");
		//driver.findElement(By.cssSelector("input:contains('login_form_input_box')")).sendKeys("maanishaaris2");
		driver.findElement(By.name("pass")).sendKeys("G00dWeek");
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("loginbutton"))));
		 driver.findElement(By.id("loginbutton")).click();
		 //driver.g
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  

  @AfterMethod
  public void CleanUp() {
	
		    driver.quit();
  }
  
 
  

}
