package org.jt.aunit.example;

import org.jt.aunit.Assert;
import org.jt.aunit.annotation.After;
import org.jt.aunit.annotation.AfterClass;
import org.jt.aunit.annotation.Before;
import org.jt.aunit.annotation.BeforeClass;
import org.jt.aunit.annotation.Test;

public class TestCaseWithAssert{
	@BeforeClass
	public void setUpClass(){
		//System.out.println("------------ setUpClass() -----------");
	}
	
	@Before
	public void setUp(){
		//System.out.println("------------ setUp() -----------");
	}
	
	@Test
	public void test1(){
		//System.out.println("------------ test1() -----------");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2(){
		//System.out.println("------------ test2() -----------");
		Assert.assertTrue(false, "Some error message");
	}
	
	@After
	public void tearDown(){
		//System.out.println("------------ tearDown() -----------");
	}
	
	@AfterClass
	public void tearDownClass(){
		//System.out.println("------------ tearDownClass() -----------");
	}
	
	@Test
	public void test3(){
		//System.out.println("------------ test3() -----------");
		Assert.assertEquals(1, 2, "does not equals");
	}
}
