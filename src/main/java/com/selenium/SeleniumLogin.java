package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLogin {
	
	
	public void getLogin() {
		
		// set my preferred browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();//Upcasting 
		
		driver.manage().window().maximize();//Maximize window
		
		//Add to testing website link 
		driver.navigate().to("https://www.automationexercise.com");
		
		//Click to login button 
		driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
		
		//Enter Email address and password in login field
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("parthadebnathk@gmail.com");
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("1234567");
		
		//click in login button
		driver.findElement(By.xpath("//*[text()='Login']")).click();
	}}
		
		// Click Logout with test method
		//driver.findElement(By.xpath("//*[text()=' Logout']")).click();
		
		//Click Logout with contains method
	/*	
	(driver.findElement(By.xpath("//*[contains(text(),' Logout')]")).isDisplayed());
		
		System.out.println("Login sucessfull!");}*/
	
		
		
		
		
	
