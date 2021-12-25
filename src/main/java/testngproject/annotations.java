package testngproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annotations {
  @Test
  public void f() {
	  System.out.println("helloworld");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("saikumar");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("karthik");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("harika");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("vishnavi");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("rammohan");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("lakshmi");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("prabandhana");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("helloworld");
  }
  

}
