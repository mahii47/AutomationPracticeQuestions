import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDissmiss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String url = "https://demo.automationtesting.in/Alerts.html";
		driver.get(url);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		WebElement alert1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='analystic'])[2]\r\n"
				+ "")));
		alert1.click();
		
		WebElement alert2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-primary']")));
		alert2.click();
		
		driver.switchTo().alert().dismiss();
		
		driver.quit();

	}

}
