package com.classEx;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ITestListener1 implements ITestListener {

	


	public void onTestStart(ITestResult result) {
		System.out.println("Testcase is  Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase is Successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase is failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is Finished");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Testcase is failed with Sucess");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test is starting");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test is Finished");
	}

}
