package classEx;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SampleTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mohan@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mohan@520");
//	  driver.findElement(By.xpath("//*[@id=\"u_0_5_kC\"]")).click();
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
			  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
