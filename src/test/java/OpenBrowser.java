import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.navigate().to("https://www.wikipedia.org");
//		driver.manage().window().maximize();
//		
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		
//		Thread.sleep(10000);
//		
//		String title = driver.getTitle();
//		String currentUrl =  driver.getCurrentUrl();
//		String pageSource = driver.getPageSource();
//		
//		System.out.println("The title is:"+title);
//		System.out.println("The currentUrl is:"+currentUrl);
//		System.out.println("The pageSource is:"+pageSource);
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
		
		
	}

}
