package org.task.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewPro {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabakkaran\\eclipse-workspace\\Task\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
WebElement username = driver.findElement(By.id("email"));
username.sendKeys("sharmi@gmail.com");
WebElement password = driver.findElement(By.id("pass"));
password.sendKeys("12345");


	
		
	}

}
