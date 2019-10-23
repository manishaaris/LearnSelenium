

package com.example.demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class assert {
 
 @Test(expectedExceptions ={IOException.class})
 public void assertion(){
 //Instantiation of driver object. To launch Firefox browser
 WebDriver driver = new FirefoxDriver();
 //To open the URL
 driver.get("https://www.softwaretestingmaterial.com");
 //Actual title is "Software Testing Material - A site for Software Testers" 
 //We took title as "Software Testing Material" to make the test fail
 String Title = "Software Testing Materials";
 String GetTitle = driver.getTitle();
 System.out.println("Assertion starts here...");
 try{
 Assert.assertEquals(Title, GetTitle);
 }catch (Throwable t){
 System.out.print(t);
 }
 driver.quit();
 }
 
}


