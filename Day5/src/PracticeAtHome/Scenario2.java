package PracticeAtHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.firstcry.com/shirts/6/220?scat=220@~3518@@@@@@@@@1@0@20@@@@@@@@@@&gender=boy,unisex");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/ul/li[3]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fltagefrm\"]/div[2]/div[2]/ul/li[2]/a/div/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fltmrp\"]/div[2]/div[2]/ul/li[3]/a/span[2]")).click();
	}

}
