package week4.day4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {
   
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");

	}
	
	 @BeforeSuite
		public void beforeSuite() {
			System.out.println("beforeSuite");

		}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");

	}
	@Test
	public void test1() {
		System.out.println("test1");

	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");

	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");

	}
	@Test
	public void test2() {
		System.out.println("test2");

	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");

	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");

	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");

	}
	
	

}