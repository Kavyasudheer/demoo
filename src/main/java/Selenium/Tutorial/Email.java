package Selenium.Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KAVYA SUDHEER\\Desktop\\eclipse\\chromedriverr.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.id("identifierId")).sendKeys("karthikaalin123@gmail.com");
		
		//driver.findElement(By.id("")).sendKeys("karthika@456");
		
		
	

	}

}
