package com.Testing.classEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_04 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.abhibus.com/bus-ticket-booking");
	  driver.manage().window().maximize();
	  WebElement leavingfrom=driver.findElement(By.xpath("//*[@id=\"source\"]"));
	  leavingfrom.sendKeys("Bangalore");
	  WebElement goingto=driver.findElement(By.xpath("//*[@id=\"destination\"]"));
	  goingto.sendKeys("Chennai");
	  driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[5]/a")).click();
	  Thread.sleep(5000);
	  
	  
  }
}
