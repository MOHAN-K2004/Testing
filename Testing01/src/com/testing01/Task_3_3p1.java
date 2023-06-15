package com.testing01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_3_3p1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeOptions co =new ChromeOptions();
       co.addArguments("--remote-allow-origins=*");
       System.setProperty("Webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	   String url="https://demo.opencart.com/index.php?route=account/register&language=en-gb";
       WebDriver driver =new ChromeDriver(co);
//      driver.get("https://maverickss.netlify.app/");
	   driver.navigate().to(url);
	   driver.manage().window().maximize();
//	   driver.navigate().refresh();//it is refreshing a website
      System.out.println("WebTitle Name :) "+driver.getTitle());// it is getting the web titile
      WebElement firstname=driver.findElement(By.id("input-firstname"));
      firstname.sendKeys("Mohan");
      WebElement lastname= driver.findElement(By.name("lastname"));
      lastname.sendKeys("K");
      WebElement email=driver.findElement(By.name("email"));
      email.sendKeys("mohan398433@gmail.com");
      WebElement password=driver.findElement(By.name("password"));
      password.sendKeys("727821tucs129");
      Thread.sleep(3000);
       driver.findElement(By.xpath("//label[@for=\"input-newsletter-yes\"]")).click();	
 
	}

}
