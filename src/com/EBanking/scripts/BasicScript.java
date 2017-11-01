package com.EBanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicScript {

	public static void main(String[] args) 
	{
	//git
		//Firefox Browser
		
		WebDriver driver=new FirefoxDriver();
		
		//Url
		driver.get("http://183.82.100.55/ranford2/home.aspx");
	 driver.findElement(By.id("txtuId")).sendKeys("Admin");
	 driver.findElement(By.id("txtPword")).sendKeys("Admin");
	 driver.findElement(By.xpath(".//*[@id='login']")).click();

	}

}
