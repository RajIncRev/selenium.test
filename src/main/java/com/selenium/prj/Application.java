package com.selenium.prj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootApplication
public class Application {

	public static WebDriver driver;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		WebDriverManager.chromedriver().setup();
		//C:\Apps
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://www.google.com";
		driver.get(url);
		
	/*	System.setProperty("webdriver.chrome.driver","C://apps//chromedriver.exe");

		//Create Chrome Browser Driver

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com");*/
	}

}
