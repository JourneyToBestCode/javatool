package org.ysh.tool.aunit.example;

import java.util.Arrays;
import java.util.List;

public class RunnerWithCustomClassLoader extends RunnerWithDefaultClassLoader{

	protected List<String> testCaseList(){
		return Arrays.<String>asList("TestCaseWithAssert", "TestCaseWithNoAssert");
	}
	
	public static void main(String[] args) throws Throwable{
		//Note: Pls change the value of myClassPath to the path in your own labtop
		System.setProperty("myClassPath", "mock");
		Thread.currentThread().setContextClassLoader(new MyClassLoader());
		System.out.println(RunnerWithCustomClassLoader.class.getClassLoader() == Thread.currentThread().getContextClassLoader());
		new RunnerWithCustomClassLoader().run();
	}
	
}
