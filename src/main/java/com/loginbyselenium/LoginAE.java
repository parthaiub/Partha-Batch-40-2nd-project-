package com.loginbyselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAE {
	
	public void getLogin() {
		
		
		//Add Chromedriver in JAVA(Step 1)
		WebDriverManager.chromedriver().setup();
		
		
		//(Step-2)
		WebDriver driver =new ChromeDriver();//Upcasting
		
		
		
		
	}

}
