package com.my.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/MySpace/JavaProjects/MyProject/newDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		
		for(int i=0;i<4;i++)
		{
		
		    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		
		}
		
		
		List<WebElement> cal=driver.findElements(By.cssSelector(".DayPicker-Day"));
		for(WebElement ab:cal)
		{   
			if(ab.getText().equalsIgnoreCase("25"))
			{  
				try {
				
				ab.click();
				break;
				}
				catch(Exception e)
				{
					
				}
			}
		}
	
			driver.findElement(By.xpath("//span[text()='Done']")).click();
				
		}
		
		

	}