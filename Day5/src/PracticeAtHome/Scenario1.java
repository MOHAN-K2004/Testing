package PracticeAtHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"search_box\"]"));
		search.clear();
		search.sendKeys("Toys");

		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/form/span")).click();
	}

}
