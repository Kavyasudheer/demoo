package Selenium.Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KAVYA SUDHEER\\Desktop\\eclipse\\chromedriverr.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung s mobile");
		//driver.findElement(By.xpath("//input[@type='submit'][1]")).click();
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> sam= driver.findElements(By.xpath("//a[contains(@class,'a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal')]"));
		
		for(WebElement abc: sam)
		{
			System.out.println(abc.getText());
		}
}



}
