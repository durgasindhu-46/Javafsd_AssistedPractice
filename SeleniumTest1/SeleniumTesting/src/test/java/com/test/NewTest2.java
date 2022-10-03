package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	//public String baseUrl="https://login.yahoo.com/";
	public String baseUrl="http://localhost:8080/SeleniumTesting/";
	String driverPath="C:\\Users\\durgasindhu\\Downloads\\chromedriver_win32/chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException{
  //set the system property for chrome driver
	  System.setProperty("webdriver.chrome.driver",driverPath);
	  //create driver object for chrome browser
	  driver=new ChromeDriver();
	  driver.get(baseUrl);
	  System.out.println("Title of my page="+driver.getTitle());
	  //fetch all input elements from current web page
	  List<WebElement> allInputElements=driver.findElements(By.tagName("input"));
	 // List<WebElement> allInputElements=driver.findElements(By.tagName("div"));//it displays more div classes
	  for(WebElement e:allInputElements)
  System.out.println("Input box id="+e.getAttribute("id"));
  
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  System.out.println("after tesing");
  }
}
