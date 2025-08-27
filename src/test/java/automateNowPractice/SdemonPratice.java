package automateNowPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

public class SdemonPratice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		boolean found = false;
		for(int i =0;i<3;i++)
		{
			try {
				driver.findElement(By.id("username")).sendKeys("Mahesh");
				driver.findElement(By.id("password")).sendKeys("manakr");
				driver.findElement(By.id("submit")).click();
				String url = driver.getCurrentUrl();
				Assert.assertEquals(url,"https://practicetestautomation.com/logged-in-successfully");
				found=true;
				break;
				
				
				
			}catch(Throwable e)
			{
				System.out.println("Login failed try in 5 seconds"+"For"+(i+1)+"Times");
				TakesScreenshot ts = (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("screenshot_"+i+".png");
				FileUtils.copyFile(src, dest);
				Thread.sleep(5000);
			}
		}
		
		if(!found)
		{
			System.out.println("Login failed");
		}
		else
		{
			System.out.println("Login successfully");
		}
		
		driver.quit();
	}


}
