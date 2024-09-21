package com.groupstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSelenium {
	
	
	public void getLogin() {
	
	
	WebDriverManager.chromedriver().setup();
	
	
	WebDriver driver =new ChromeDriver();//Upcasting
	driver.manage().window().maximize();
	//driver.manage().window().fullscreen();
	
	driver.navigate().to("https://www.automationexercise.com");
	
	//driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
	driver.findElement(By.xpath("//i[@class = 'fa fa-lock' ]")).click();
	
	driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("rezwanislam857@gmail.com");
	
	{

}}}
