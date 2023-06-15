package com.Testing.reclass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver dr;
  @Test
  public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-orgins=*");
	  WebDriverManager.chromedriver().setup();
	  dr =new ChromeDriver();
	  dr.get("https://www.amazon.in/");
	  dr.manage().window().maximize();
	  System.out.println("url ;"+dr.getTitle());
	   WebElement  search=dr.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	  search.sendKeys("speaker");
	  dr.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	  
	  

	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
