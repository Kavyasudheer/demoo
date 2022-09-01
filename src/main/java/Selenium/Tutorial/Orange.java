package Selenium.Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KAVYA SUDHEER\\Desktop\\eclipse\\chromedriverr.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//Thread.sleep(5000);
		//driver.close();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys("ATHUN");
		driver.findElement(By.id("lastName")).sendKeys("DILEEP");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_optGender_1")).click();
		WebElement nationality=driver.findElement(By.id("personal_cmbNation"));
		Select sel=new Select(nationality);
		sel.selectByVisibleText("Indian");
		WebElement ms=driver.findElement(By.id("personal_cmbMarital"));
		Select sel1=new Select(ms);
		sel1.selectByVisibleText("Married");
		driver.findElement(By.id("personal_DOB")).click();
		WebElement month=driver.findElement(By.className("ui-datepicker-month"));
		Select sel2=new Select(month);
		sel2.selectByVisibleText("Nov");
		WebElement year=driver.findElement(By.className("ui-datepicker-year"));
		Select sel3=new Select(year);
		sel3.selectByVisibleText("1992");
		driver.findElement(By.linkText("1")).click();
		driver.findElement(By.id("btnSave")).click();
		String a=driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
		System.out.println(a);
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(a);
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("chkSelectRow[]")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
		
		
		
	
		
	
		
	
		
		
		
		
	}

}
