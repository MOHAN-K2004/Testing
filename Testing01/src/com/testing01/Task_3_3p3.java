package com.testing01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_3_3p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions co=new ChromeOptions();	
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(co);
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id=\"content\"]/h3"));
    
	}

}
