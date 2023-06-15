package com.Testing.classEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_03 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
	  WebElement id=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	  id.sendKeys("401");
	  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	  driver.switchTo().alert().dismiss();
	  id.clear();
	  id.sendKeys("402");
	  driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	  driver.switchTo().alert().accept();
	  driver.switchTo().alert().accept();
	  Thread.sleep(5000);
	  driver.close();
  }
}
