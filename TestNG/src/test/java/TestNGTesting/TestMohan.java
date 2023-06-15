package TestNGTesting;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestMohan {
	WebDriver driver;
  @Test
  public void DemoTesting() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
