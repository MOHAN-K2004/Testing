package com.Testing.Day10.class_ex;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class test123 {
  @Test
  public void f() {
	 
  }
  @BeforeClass
  public void beforeClass() {
      ChromeOptions co=new ChromeOptions();
      co.addArguments("--remote-allow-origins=*");
      WebDriver driver=new ChromeDriver(co);
      driver.get("https://www.flipkart.com/");
       WebElement search=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
       search.click();
       search.sendKeys("Laptops");
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div[2]/form/div/button"));
       
  }

 

}
