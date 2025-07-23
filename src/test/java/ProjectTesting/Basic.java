package ProjectTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
            
	public static WebDriver driver = null;
	
	
	public static WebDriver openbrowser(String url) throws InterruptedException
	{
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
		Thread.sleep(2000);
		return driver;
	}
	
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
