package Selenium.Tutorial;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prac {
	static WebDriver driver;
	static String parent;
	static String facebook;
	static String google;
	public static void dob(WebElement wb,String value)
	{
		Select sel=new Select(wb);
		sel.selectByVisibleText(value);
	}
	
	public static void twowindow(Set<String>allwindow, String parent)
	{
		for(String abc:allwindow)
		{
			if(!(abc.equals(parent)))
			{
				driver.switchTo().window(abc);
				facebook=driver.getWindowHandle();
			}
		}
		
	}
	public static void threewindow(Set<String>allwindows, String parent, String facebook)
	{
		for(String lmn:allwindows)
		{
			
			{
				if(!(lmn.equals(parent))&&(!(lmn.equals(facebook))))
				driver.switchTo().window(lmn);
				google=driver.getWindowHandle();
			}
		}
		
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAVYA SUDHEER\\Desktop\\eclipse\\chromedriverr.exe");
		driver=new ChromeDriver();
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.name("fname")).sendKeys("KAVYA");
		driver.findElement(By.partialLinkText("Facebook")).click();
		Set<String>allwindow=driver.getWindowHandles();
		Prac.twowindow(allwindow, parent);
		
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("KAVYA");
		driver.switchTo().window(parent);
		driver.findElement(By.name("lname")).sendKeys("SUDHEER");
		driver.switchTo().window(facebook);
		Thread.sleep(5000);
		driver.findElement(By.name("lastname")).sendKeys("SUDHEER");
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		Prac.dob(day, "10");
		Thread.sleep(5000);
		Prac.dob(month, "Jul");
		Thread.sleep(5000);
		Prac.dob(year, "1996");
		Thread.sleep(5000);
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("address")).sendKeys("ATTINGAL");
		driver.findElement(By.partialLinkText("Google")).click();
		Set<String>allwindows=driver.getWindowHandles();
		Prac.threewindow(allwindows, parent, facebook);
	
		driver.findElement(By.name("q")).sendKeys("ATTINGAL");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File fs= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs,new File( "/Tutorial/screenshot/pqr.png"));
		
		
		
		
		
		

	}

}
