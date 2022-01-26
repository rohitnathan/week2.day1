package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		
		// Setup driver
		WebDriverManager.chromedriver().setup();
						
		// Launch browser
		ChromeDriver driver = new ChromeDriver();
						
		// Load URL
		driver.get("http://leaftaps.com/opentaps/");
						
		// Maximize browser
		driver.manage().window().maximize();

		// Enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoCSR");
						
		// Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
						
		// Click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();
						
		// Click on homepage link text CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
				
		// Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		
		// Click Find Contacts
		driver.findElement(By.linkText("Find Contacts")).click();
		
		// Click Email Tab
		driver.findElement(By.xpath("//span[text() = 'Email']")).click();
		
		// Type email as babu@testleaf.com
		WebElement emailTextbox = driver.findElement(By.xpath("//input[@name = 'emailAddress']"));
		emailTextbox.sendKeys("babu@testleaf.com");
		
		// Click Find Contacts
		driver.findElement(By.xpath("//button[text() = 'Find Contacts']")).click();
		
		// Close the browser
		driver.close();

	}

}