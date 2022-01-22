package com.Julybatch;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest
{
	@Test
	public void loginTest() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis = new FileInputStream("/Users/Neelam/eclipse-workspace/myfirstmavenproject/src/test/resources/login.properties");
		Properties p = new Properties();
		p.load(fis);
		
		driver.get(p.getProperty("url"));
		driver.findElement(By.name("txtUsername")).sendKeys(p.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(p.getProperty("password"));
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println("Title of the page is :" +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		driver.close();
	}
}
