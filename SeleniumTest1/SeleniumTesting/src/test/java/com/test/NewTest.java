package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("tesing");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before tesing method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after tesing method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before tesing");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after tesing");
  }
  
}
