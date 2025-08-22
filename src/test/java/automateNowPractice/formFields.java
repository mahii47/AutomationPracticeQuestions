package automateNowPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class formFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice-automation.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement fieldsbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Form Fields']")));
				
		fieldsbutton.click();
		
		
		WebElement Name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name-input")));
		Name.sendKeys("Mahesh");
		
		
		
		
		
		
		
		
		
		

	}

}
