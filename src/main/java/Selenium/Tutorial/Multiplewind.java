package Selenium.Tutorial;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewind {

	public static void main(String[] args) {
		//WebDriverManager.edgedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.name("fname")).sendKeys("KAVYA");
		driver.findElement(By.partialLinkText("Facebook")).click();
		Set<String>allwindow=driver.getWindowHandles();
		for(String abc:allwindow)
		{
			if(!(abc.equals(parent)))
			{
				driver.switchTo().window(abc);
				String facebook=driver.getWindowHandle();
			}
		}

	}
}

