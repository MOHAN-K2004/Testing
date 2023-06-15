package com.Testing.classEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_02 {
	WebDriver driver;
  @Test
  public void dragdrop() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
	  driver.switchTo().frame(0);
	  WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  WebElement destination=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	  Actions actions=new Actions(driver);
	  actions.dragAndDrop(source, destination).build().perform();
//	  Thread.sleep(5000);
//	  driver.close();
	  
  }
}
