package Selenium.Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KAVYA SUDHEER\\Desktop\\eclipse\\chromedriverr.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 12");
		//driver.findElement(By.xpath("//input[@type='submit'][1]")).click();
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> iphne= driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone 12 Mini')]"));
		List<WebElement> rat= driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone 12 Mini')]//following::div[1]/div/span[1]"));
		System.out.println(iphne.size());
		System.out.println(rat.size());
		for(WebElement abc: iphne)
			{
			for(WebElement pqr: rat)
			{
				System.out.println(abc.getText());	
				System.out.println(pqr.getAttribute("aria-label"));
				break;
			}
			}
		
	}



	}

