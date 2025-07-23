package ProjectTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegistrationAutomationTesting extends Basic{

	public static void main(String[] args) throws InterruptedException
	{
		
		driver = openbrowser("https://demo.automationtesting.in/Register.html");
		
		WebElement label = driver.findElement(By.xpath("//label[text()=Full Name* ]"));
		boolean result = label.isDisplayed();
		System.out.print(result);
		if(result == true)
		{
			System.out.println("test case pass");
		}
	
	

	}

}
