package automateNowPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		String url = "https://practice-automation.com/";
		driver.get(url);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement javaScriptDelays = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='wp-block-button__link wp-element-button'])[1]")));
		javaScriptDelays.click();
		
		WebElement Start = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("start")));
		Start.click();
		
		WebElement timer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Liftoff!']")));
		String Liftoff=timer.getText();
		System.out.println(Liftoff);
		
		

	}

}
