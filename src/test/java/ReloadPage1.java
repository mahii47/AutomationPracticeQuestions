import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReloadPage1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		String url = "http://nonexistentwebsite123456.com/";
		
		for(int i=0;i<3;i++)
		{
			try{
					driver.get(url);
					System.out.println("The pass attempt is:"+i);
					break;
					
			}
			catch(Exception e1)
			{
				System.out.println("The failed attempt is:"+ i);
				Thread.sleep(15000);
			}
		}
		driver.quit();

	}

}
