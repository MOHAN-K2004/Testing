package com.classEx;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	@DataProvider(name="test-getdata")

	public Object[][] getdata() {
		return new Object[][] { { "Mohan", 18 }, { "Yogesh", 05 } };
	}
	@Test(dataProvider = "test-getdata")
	public void testmethod(String name, int age) {
		System.out.println("Name : " + name+"\n"+ " Age : " + age);
	}
}
