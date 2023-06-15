package Class_Exercise_Lab;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task_01 {
	@DataProvider(name="test-getdata")
	public Object[][] getdata(){
		return new Object[][] {
			{10,20,'+',30},
			{1000,100,'-',900},
			{5,60,'*',300},
			{100,20,'/',5},
	
		};
		
	}
	@Test(dataProvider = "test-getdata")
	public void calculating(int a,int b,char c,int d) {
		int result=0;
		if(c =='+')
		{
			result=a+b;
			System.out.println("Addition : "+result);
		}
		else if(c== '-')
		{
			result=a-b;
			System.out.println("Subtraction : "+result);
		}
		else if(c== '*') {
			result=a*b;
			System.out.println("Multiplication : "+result);
			
		}
		else if(c=='/') {
			result=a/b;
			System.out.println("Division : "+result);
		}
		Assert.assertEquals(result, d);
	}
 
	
}
