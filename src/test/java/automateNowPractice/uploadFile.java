package automateNowPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String url = "https://practice-automation.com/file-upload/";
		driver.get(url);
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement chooseFile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("file-upload")));
		
		chooseFile.sendKeys("C:\\Users\\mahma\\Downloads\\test.pdf");
		
		driver.findElement(By.id("upload-btn")).click();
		
		
		

	}

}
