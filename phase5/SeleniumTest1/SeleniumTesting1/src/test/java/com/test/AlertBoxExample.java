package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\durgasindhu\\\\Downloads\\\\chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		
		//simple alert box
		driver.findElement(By.name("alertbox")).click();
		driver.switchTo().alert().accept();
		
		//confirm alert box
		driver.findElement(By.name("confirmalertbox")).click();
		driver.switchTo().alert().accept();
		System.out.println("Text :"+driver.findElement(By.id("demo")).getText());
		
		//prompt alert box
		driver.findElement(By.name("promptalertbox1234")).click();
		driver.switchTo().alert().sendKeys("No"); //yes //no
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		System.out.println("Text: "+driver.findElement(By.id("demoone")).getText());
		
		
		driver.close();
	}

}