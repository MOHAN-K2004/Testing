package TestNGTesting;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;

public class Task_02 {
	WebDriver driver;
  @Test
  public void add() {
	   int a=10;
	   int b=20;
	   int c=0;
	    c=a+b;
	    System.out.println("Addition :"+c);
	   
    Assert.assertEquals(30, c);
  }
  @Test
  public void subtraction() {
	  int a=20;
	  int b=10;
	  int c=0;
	  c=a-b;
	  System.out.println("Subtraction :"+c);
	  
	  Assert.assertEquals(10, c);
  }
  @Test
  public void Multiple() {
	  int a=10;
	  int b=20;
	  int c=0;
	  c=a*b;
	  System.out.println("Multiplication :"+c);
	  
	  Assert.assertEquals(200, c);
  }
  @Test
  public void Division() {
	  int a=100;
	  int b=20;
	  int c=0;
	  c=a/b;
	  System.out.println("Division :"+c);
	  
	  Assert.assertEquals(5, c);
  }
  @BeforeMethod
  public void beforeMethod() {
	
  }

  @AfterMethod
  public void afterMethod() {
  }

}
