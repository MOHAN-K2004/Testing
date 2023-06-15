package com.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeOptions co=new ChromeOptions();
      co.addArguments("--remote-allow-origins=*");
      System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver(co);
      driver.get("https://www.amazon.in/");
//      driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
      driver.manage().window().maximize();
      WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div"));
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
      wait.until(ExpectedConditions.elementToBeClickable(logo));
      logo.click();
      
	}

	
}
