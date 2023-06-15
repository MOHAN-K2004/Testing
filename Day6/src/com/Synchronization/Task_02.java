package com.Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.manage().window().maximize();
	    if(driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[1]/div[1]/div[1]/div/span/input")).isDisplayed() &&
	    		driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[1]/div[1]/div[2]/div/span/input")).isDisplayed()) {
	    	System.out.println("The FirstName and User Email text box is displayed.");
	    }
	    else
	    {
	    	System.out.println("The FirstName and User Email text box is not displayed.");
	    	
	    	
	    }
	    WebElement email=driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[1]/div[1]/div[2]/div/span/input"));
	    email.sendKeys("mohan398@gmail.com");
	    WebElement pass=driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
	    pass.sendKeys("mohan@520520");
	    driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button")).click();
	    if(!(driver.findElement(By.xpath("//*[@id=\"ur-submit-message-node\"]")).isDisplayed()))
	    {
	    	System.out.println("Rigistration is Successfully");
	    }
	    else
	    {
	    	System.out.println("Rigistration is not Sucessfully");
	    }
	}

}
