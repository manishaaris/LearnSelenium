package com.example.demo;

import org.testng.annotations.Test;


import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;

import org.junit.Before;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

 

public class wait {

       // created reference variable for WebDriver

       WebDriver drv;

       @Test

       public void setup() throws InterruptedException {

 

              drv=new ChromeDriver();

              // launching gmail.com on the browser

              drv.get("https://gmail.com");

              // maximized the browser window

              drv.manage().window().maximize();

              drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       }
 

/*
       @Test

       public void test() throws InterruptedException {

 

              // saving the GUI element reference into a "username" variable of WebElement type

              WebElement username = drv.findElement(By.id("Email"));

 

              // entering username

              username.sendKeys("shruti.shrivastava.in");

 

              // entering password

              drv.findElement(By.id("Passwd")).sendKeys("password");

 

              // clicking signin button
         drv.findElement(By.id("signIn")).click();
 

              // explicit wait - to wait for the compose button to be click-able

              WebDriverWait wait = new WebDriverWait(drv,30);

 

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

              // click on the compose button as soon as the "compose" button is visible

       drv.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();

       }*/

 

       @After

       public void teardown() {

       // closes all the browser windows opened by web driver

   drv.quit();     

       }

}
