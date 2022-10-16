package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ajay");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("B");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8015991979");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("P@ssw0rd");
		
	
		WebElement elementDay = driver.findElement(By.id("day"));
		Select dd1 = new Select(elementDay);
		dd1.selectByVisibleText("10");
		
		WebElement elementMonth = driver.findElement(By.id("month"));
		Select dd2 = new Select(elementMonth);
		dd2.selectByVisibleText("Nov");
		
		WebElement elementYear = driver.findElement(By.id("year"));
		Select dd3 = new Select(elementYear);
		dd3.selectByValue("1992");
		
		WebElement element6 = driver.findElement(By.className("_58mt"));
		element6.click();
		
	}
	
	
	
}
