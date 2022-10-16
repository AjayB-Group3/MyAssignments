package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//Login Page
		WebElement ElementUserName = driver.findElement(By.xpath("//input[@id='username']"));
		ElementUserName.sendKeys("Demosalesmanager");
		
		WebElement ElementPassword = driver.findElement(By.xpath("//input[@id='password']"));
		ElementPassword.sendKeys("crmsfa");
		
		WebElement ElementLogin = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		ElementLogin.click();
		
		WebElement ElementCRMSFALink = driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
		ElementCRMSFALink.click();
		
		WebElement ElementLeadTab = driver.findElement(By.linkText("Leads"));
		ElementLeadTab.click();
		
		WebElement ElementCreateLead = driver.findElement(By.linkText("Create Lead"));
		ElementCreateLead.click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajay");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");


		driver.findElement(By.id("createLeadForm_description")).sendKeys("Before Edit Description");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Before Edit ImportNote");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ajaymar892@gmail.com");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String Title = driver.getTitle();
		System.out.println("The title of the web page is " +Title);
		
		driver.findElement(By.linkText("Edit")).click();

		//Clear Description Field
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("Description Edited succssfully");
		
		driver.findElement(By.id("updateLeadForm_importantNote")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("ImportantNotes Edited succssfully");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println("The title of the web page is " +title);
		
		
	}

}
