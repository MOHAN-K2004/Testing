package PracticeAtHome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scenario3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.firstcry.com/shirts/6/220?scat=220@~3518@@@@@@@@@1@0@20@@@@@@@@@@&gender=boy,unisex");
		driver.manage().window().maximize();
	   JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement one=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/ul/li[3]/a/span"));
		 one.click();
//		Thread.sleep(4000);
		WebElement two=driver.findElement(By.xpath("//*[@id=\"fltagefrm\"]/div[2]/div[2]/ul/li[2]/a/div/span[1]"));
		two.click();
		js.executeScript("window.scrollBy(0,850)", "");
//		Thread.sleep(4000);
		WebElement three=driver.findElement(By.xpath("//*[@id=\"fltmrp\"]/div[2]/div[2]/ul/li[3]/a/span[2]"));
		three.click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.navigate().refresh();
//	   if(one.isSelected()&& two.isSelected() && three.isSelected()) {
//		   System.out.println("The filler is present");
//			
//		}
//		else
//		{
//			System.out.println("The filler is not present");
//			
//		}
	}

}
