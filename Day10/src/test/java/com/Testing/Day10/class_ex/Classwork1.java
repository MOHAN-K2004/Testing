package com.Testing.Day10.class_ex;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Classwork1 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @DataProvider
  public void dataprovider() {
	  
  }



  @AfterMethod
  public void afterMethod() {
  }
}





















































//  public Object[][] facebookLogin() {
//	  Object[][] arrayexcel =getExcelData("C:\\Users\\MOHAN K\\eclipse-workspace\\Day10\\day10classwork.xlsx");
//	return arrayexcel;
//	  
//  }
//  private Object[][] getExcelData(String filename,String Sheetname) throws FileNotFoundException {
//        FileInputStream fs=new FileInputStream(filename);
//        Workbook wb=Workbook.getWorkBook(fs);
//        Sheet
//	  
//	  
//	  //   FileInputStream fs=new FileInputStream(filename);
////   Workbook wb=Workbook.getWoorkBook(fs);
////   Sheet sh= wb.getSheet(Sheetname);
////   int totalNoOfrows=sh.
//	return null;
//}
//
//  public void beforeMethod() {
//	  WebDriverManager.chromedriver().setup();
//	  driver=new ChromeDriver();
//	  driver.get("https://www.facebook.com/");
//	  
//  }