package com.voicera;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createaccount 
{
	@Test
	public void test() throws FindFailed
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		Screen s = new Screen();
		ImagePath.add("C:\\Users\\javed\\Desktop\\Register.sikuli");
		//s.click("register.png");
		driver.findElement(By.xpath("//div//a[text()=\"Register\"] ")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("voicera");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("voicera@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("T@5t@123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//s.click("signup.png");
		driver.findElement(By.xpath("//input[@value='Sign up']")).click();
	}
}
