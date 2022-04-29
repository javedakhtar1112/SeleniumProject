package com.voicera;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginaccount 
{
	@Test

	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.xpath("//div//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("voicera@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("T@5t@123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
}
