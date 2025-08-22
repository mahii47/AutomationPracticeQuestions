import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "https://demo.automationtesting.in/Alerts.html";
		driver.get(Url);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement clicks = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='analystic'])[3]")));
		clicks.click();
		
		WebElement alertbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='btn btn-info']")));
		alertbox.click();
		
		driver.switchTo().alert().sendKeys("Mahesh Mankar");
		
		driver.switchTo().alert().accept();
	}

}
