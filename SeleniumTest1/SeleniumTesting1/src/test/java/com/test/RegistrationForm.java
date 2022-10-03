package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\durgasindhu\\\\Downloads\\\\chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		//name
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("sindhu");
				
		
		
		//email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("sindhu799@gmail.com");
		
		//mobile
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("8606653759");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Sindhu@123");
		
		//button
		WebElement register= driver.findElement(By.cssSelector("#registerButton"));
		register.click();
		
		
	}

}