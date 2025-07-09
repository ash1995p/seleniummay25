package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFormAutomationtesting {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement name = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		name.sendKeys("ashwini");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		lastname.sendKeys("pudale");
		
		WebElement fullnamelabel = driver.findElement(By.xpath("//label[text()=\"Full Name* \"]"));
		System.out.println(fullnamelabel.isDisplayed());
		
		
		WebElement address = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		address.sendKeys("A/p-palus,Dist-sangli,Tal-PALUS pin-416310");
		
		WebElement mailid = driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]"));
		mailid.sendKeys("ashwinipudale2@gmail.com");
		
		WebElement phoneno = driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]"));
		phoneno.sendKeys ("7757987675");
		
		WebElement radiobtn1 = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		boolean result = radiobtn1.isEnabled();
		if(result==true)
		{
			radiobtn1.click();
		}
		
		WebElement radiobtn2 = driver.findElement(By.xpath("//input[@id=\"checkbox1\"]"));
	    boolean btn = radiobtn2.isEnabled();
	    if(btn == true)
	    {
	    	radiobtn2.click();
	    }
	    WebElement radiobtn3= driver.findElement(By.xpath("//input[@id=\"checkbox2\"]"));
	    boolean btn2 = radiobtn2.isEnabled();
	    if(btn == true)
	    {
	    	radiobtn3.click();
	    }
	    
	    WebElement selectskills = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
	     Select s = new Select(selectskills);
	     boolean b = s.isMultiple();
	     System.out.println(b);
	    // s.selectByIndex(1);
	    
	    
	     
	     
//	     WebElement countryselect = driver.findElement(By.xpath("//select[@id=\"countries\"]");
//	     Select s1 = new Select(countryselect);
//	     s1.selectByVisibleText("Bangladesh");
	  
		
	     Thread.sleep(8000);
	     driver.close();
		

	}

}
