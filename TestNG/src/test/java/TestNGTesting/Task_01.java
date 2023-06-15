
package TestNGTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_01 {
	WebDriver driver;
	
  @Test
  public void Task01() {
	  driver.manage().window().maximize();
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Guest Registration Form – User Registration");
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String title=driver.getTitle();
	  System.out.println("Title : "+title);
	 
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
//	  driver.close();
  }
}
