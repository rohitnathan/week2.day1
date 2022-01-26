package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

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
		
		// Click Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		
		// Type First Name
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("Rohit");
		
		// Type Last Name
		WebElement lastName = driver.findElement(By.id("lastNameField"));
		lastName.sendKeys("Test");
		
		// Click Create Contact Button
		driver.findElement(By.name("submitButton")).click();
		
		//Print the first name and browser title
		String title = driver.getTitle();
		System.out.println("Browser title is: " + title);
		String fName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		String lName = driver.findElement(By.id("viewContact_lastName_sp")).getText();
		System.out.println("Name is: " + fName +" "+ lName);
		
		//Close the browser
		driver.close();
		

	}

}