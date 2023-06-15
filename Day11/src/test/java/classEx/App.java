package classEx;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class App {
 
  public static  void main(String str[]) throws  IOException {
	  WebDriver driver;
	
	  ExtentSparkReporter htmlreporter=new ExtentSparkReporter("extendreport.html");
	  
	  ExtentReports extend =new ExtentReports();
	  extend.attachReporter(htmlreporter);
	  
	  ExtentTest test = extend.createTest("Facebook_Login","Login to the Facebook");
//		test.fail("Testcase is failed");
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mohan@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mohan@520");
	  extend.flush();
	  
	  Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	  
	  ImageIO.write(screenshot.getImage(), "jpg", new File("C:\\Users\\MOHAN K\\eclipse-workspace"));
	  driver.close();
  }
}
