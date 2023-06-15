package com.classEx;

import org.testng.ISuite;
import org.testng.ISuiteListener;


public class ISuiteListener1 implements ISuiteListener {

@Override
public void onStart(ISuite suite) {
	System.out.println("Starting : "+suite.getName());
}

@Override
public void onFinish(ISuite suite) {
	System.out.println("Finished : "+suite.getName());
}
}
