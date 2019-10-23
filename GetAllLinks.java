package com.example.demo;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class GetAllLinks {
	
	WebDriver driver;
  @Test
  public void f() {
	  String url = "";
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println("Total no. of images are " + links.size());
	  

		for(int i=0; i< links.size(); i++){		 
					  
		 url= links.get(i).getAttribute("href");}
		
		if(url == null || url.isEmpty()){
			System.out.println("URL is either not configured for anchor tag or it is empty");}
			
			                
			            else{
			            	System.out.println("URL-Good");
			            	};
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://www.fonts.com/");
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	 
	  Object obj = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("logo")));
	  //Assert.assertEquals(obj, By.className("logo"));
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();   
  }

}
