package com.day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Task_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();	
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver(co);
        driver.get("https://j2store.net/free/");
        driver.manage().window().maximize();
        String title=driver.getTitle();
       System.out.println("Title : "+title);
       if(title.equals("Home"))
       {
    	   System.out.println("Title is match");
         }
       else
       {
    	   System.out.println("Title is not Match");
         }
       driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
       String title1=driver.getTitle();
       System.out.println("Second TitleName : "+title1);
       if(title1.equals("Shop"))
       {
    	   System.out.println("Title1 is match");
       }
       else
       {
    	   System.out.println("Title1 is not Match");
       }
	}





}
