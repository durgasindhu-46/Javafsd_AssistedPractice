package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
	String driverPath="C:\\Users\\durgasindhu\\Downloads\\chromedriver_win32/chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException{
  driver.get("http://www.google.com/");
  System.out.println("the title of the page is:"+driver.getTitle());
  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\durgasindhu\\\\Downloads\\\\chromedriver_win32/chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  System.out.println("after tesing");
  }
}
