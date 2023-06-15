package com.Testing.classEx;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Task_01 {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get("https://demoqa.com/droppable/");
	  driver.manage().window().maximize();
	  WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  WebElement destination=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	  Actions actions=new Actions(driver);
	  actions.dragAndDrop(source, destination).build().perform();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
