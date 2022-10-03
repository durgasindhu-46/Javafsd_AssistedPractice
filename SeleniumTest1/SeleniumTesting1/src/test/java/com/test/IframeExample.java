package com.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\durgasindhu\\\\\\\\Downloads\\\\\\\\chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("G:\\phase5\\SeleniumTest1\\SeleniumTesting1\\src\\main\\webapp\\iframe.html");
		//driver.get("http://localhost:8080/SeleniumTesting1/iframe.html");
		
		//another website: https://www.freecodecamp.org/news/what-is-an-iframe-html-example/
		
		//find iframe from the website
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		List<WebElement> frame= driver.findElements(By.tagName("iframe"));
		System.out.println("Total Number of iFrame Found: "+frame.size());
	}

}