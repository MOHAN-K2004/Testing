package com.Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.amazon.in/");

		//implict wait :-

		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		//explicit wait :-
		
		//driver.manage().window().maximize();
		//WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div"));
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.elementToBeClickable(logo));
		//logo.click();
		
		//FluentWait:-
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(5))
	    .pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		WebElement ele=wait.until(new Function <WebDriver,WebElement>()
		{
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("myElement"));
			}
		});
	ele.click();

	}


}
