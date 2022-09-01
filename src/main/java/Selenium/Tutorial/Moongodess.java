package Selenium.Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moongodess {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KAVYA SUDHEER\\Desktop\\eclipse\\chromedriverr.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moongoddesscouture.com/");
		driver.findElement(By.className("icon")).click();
		driver.findElement(By.linkText("Shop")).click();
		//driver.findElement(By.id("dgwt-wcas-search-input-1124")).sendKeys("MGBL578");
		//driver.findElement(By.className("btn-submit dgwt-wcas-search-submit")).click();
		
		

	}

}
