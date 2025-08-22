import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RetryLogic {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals("Google", title);
		
		if(title.equals("Google"))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		
		driver.quit();
		

	}

}
