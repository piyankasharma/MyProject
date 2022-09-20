package com.my.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:/MySpace/JavaProjects/MyProject/newDriver/chromedriver.exe");
			
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.get("https://automationstepbystep.com/");
		 
		 driver.findElement(By.xpath("//img[@class='alignnone wp-image-3204']")).click();
		 Thread.sleep(5000); 
		 driver.close();
		 driver.quit();

	}

}
