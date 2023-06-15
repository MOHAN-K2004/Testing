package com.Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
//		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
		firstname.sendKeys("Mohan");
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
		lastname.sendKeys("K");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email.sendKeys("mohan@gmail.com");
		WebElement password=driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		password.sendKeys("mohan520");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
//		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
	}

}
