package week2.day2.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Edit {

	public static void main(String[] args) {

		//open chrome
		System.setProperty("webdriver.chrome.driver","./drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//open url
		driver.get("http://leafground.com/pages/Edit.html");
		
		//Enter your email address
		WebElement emailaddr = driver.findElementById("email");
		emailaddr.sendKeys("abc@gmail.com");
			
		
		//Append a text and press keyboard tab
	WebElement tab = driver.findElementByXPath("//input[@value='Append ']");
	tab.sendKeys("new data is appended");
	tab.sendKeys(Keys.TAB);
		
		
		//Get default text entered
	String txt = driver.findElementByXPath("(//input[@name=\"username\"])[1]").getAttribute("value");
	System.out.println("default text entered is: " + txt);
		
				
		//Clear the text........... 
		WebElement cleartxt = driver.findElementByXPath("//input[@name=\"username\"][@value=\"Clear me!!\"]");
		cleartxt.clear();
		System.out.println("text is cleared....");
		
		//Confirm that edit field is disabled
		WebElement editfield = driver.findElementByXPath("//input[@disabled='true']");
		if (editfield.isEnabled())
			{System.out.println("edit fild is enabled");}
			else
				{System.out.println("edit field is disabled");}
	}

}
