import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReloadPage {

	public static void main(String[] args) throws InterruptedException {
	     
        WebDriver driver = new ChromeDriver();
        String title = "";
        String url = "https://assertion.cloud/";
        
        for(int i=0 ; i<3;i++)
        {
        	try {
        	 driver.get(url);
        	 title = driver.getTitle();
        	 if(!title.isBlank() && title != null)
        	 {
        		 System.out.println("the pass attempt is:"+ i);
        		 break;
        	 }
        	 else
        	 {
        	System.out.println("the pass attempt is:"+ i);
        	Thread.sleep(5000);
        	 }
        	}
        	catch(Exception e1)
        	{
        		System.out.println("the failed attempt is:"+ i);
        		Thread.sleep(5000);
        		
        	}
        }
      
        driver.quit();
    }
}
