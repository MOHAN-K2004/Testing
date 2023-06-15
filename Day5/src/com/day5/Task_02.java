package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();	
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(co);
        driver.get("https://j2store.net/free/");
        driver.manage().window().maximize();
        String url=driver.getCurrentUrl();
        if(url.equals("https://j2store.net/free/")) {
        	System.out.println("The CurrentUrl is Matched");
        }
        else
        {
        	System.out.println("The CurrentUrl is not matched");
        }
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
        String url1=driver.getCurrentUrl();
        if(url1.equals("https://j2store.net/free/index.php/shop?filter_catid=11")) {
        	System.out.println("The url1 is matched");
        }
        else
        {
        	System.out.println("The url1 is not matched");
        }
        
	}

}
