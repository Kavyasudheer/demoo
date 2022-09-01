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

public class Prc {
	static WebDriver driver;
	static String orange;
	static String parent;
	static String facebook;
	public static void dob(WebElement wb,String value)
	{
		Select sel=new Select(wb);
		sel.selectByVisibleText(value);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\KAVYA SUDHEER\\\\Desktop\\\\eclipse\\\\chromedriverr.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		String parent=driver.getWindowHandle();
		driver.findElement(By.name("fname")).sendKeys("KAVYA");
		driver.findElement(By.partialLinkText("HRM")).click();
		Set<String> allwindow=driver.getWindowHandles();
		for(String abc:allwindow)
		{
			if(!(abc.equals(parent)))
			{
				driver.switchTo().window(abc);
				orange= driver.getWindowHandle();
			}
		}
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.switchTo().window(parent);
		driver.findElement(By.partialLinkText("Facebook")).click();
		Set<String> allwindows=driver.getWindowHandles();
		for(String pqr:allwindows)
		{
			if(!(pqr.equals(parent))&&(!(pqr.equals(orange))))
			{
				driver.switchTo().window(pqr);
				facebook= driver.getWindowHandle();
			}
		}
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		Prc.dob(day, "10");
		Thread.sleep(5000);
		Prc.dob(month, "Jul");
		Thread.sleep(5000);
		Prc.dob(year, "1996");
		Thread.sleep(5000);
		
		driver.switchTo().window(parent);
		driver.findElement(By.name("lname")).sendKeys("SUDHEER");
		driver.switchTo().window(orange);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.switchTo().window(facebook);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9562445362");
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("address")).sendKeys("ATTINGAL");
		//driver.quit();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File fs= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs,new File( "/Tutorial/screenshot/pqrr.png"));
		
		
		
	}

}
