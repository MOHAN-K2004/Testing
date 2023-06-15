package com.day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();	
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(co);
        driver.get("https://demo.smart-hospital.in/site/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
        WebElement opd=driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a/span"));
        String opd_name=opd.getTagName();
        System.out.println(opd_name);
        WebElement search_box_size=driver.findElement(By.xpath("//*[@id=\"search-btn\"]/i"));
        System.out.println("Searh box Size : "+search_box_size.getSize());
        System.out.println("Searh box color value : "+search_box_size.getCssValue("color"));
        System.out.println("Task 5 is properly Run Successfully ! ");
	}
}
