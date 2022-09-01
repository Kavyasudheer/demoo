package Selenium.Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KAVYA SUDHEER\\Desktop\\eclipse\\chromedriverr.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys("ATHUN");
		driver.findElement(By.id("lastName")).sendKeys("DILEEP");
		String id=driver.findElement(By.name("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.linkText("PIM")).click();
		List<WebElement> data=driver.findElements(By.xpath("//tbody/tr/td[2]"));
		for(WebElement abc:data)
		{
			String a=abc.getText();
			if(a.contains(id))
			{
				System.out.println("pass");
			}
		}
		
		
		

}
}