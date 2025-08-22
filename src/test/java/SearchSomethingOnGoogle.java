import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchSomethingOnGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver  =  new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		username.sendKeys("Admin");
		
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("admin123");
		
		
		WebElement Login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type=\"submit\"]")));
		Login.click();
		
		
		 
		 String URL=driver.getCurrentUrl();
		 System.out.println(URL);
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
