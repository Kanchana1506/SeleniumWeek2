package week2.day2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {

		//open chrome
		System.setProperty("webdriver.chrome.driver","./drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();

				//open url
				driver.get("http://leafground.com/pages/radio.html");

		//Are you enjoying the classes?
				WebElement enjoycls = driver.findElementById("no");
				enjoycls.click();
				
				//Find default selected radio button
				if (driver.findElementByXPath("//input[@name='news'][1]").isSelected())
					System.out.println("Unchecked is default selected");
				else
					System.out.println("Checked is default selected");
				
				//Select your age group (Only if choice wasn't selected)
				if(driver.findElementByXPath("//input[@name='age'][2]").isSelected())
				{System.out.println("correct age group is already selected");}
				else
				{
					driver.findElementByXPath("//input[@name='age'][2]").click();
					System.out.println("age group is selected");
					
				}
				
				
	}

	
}
