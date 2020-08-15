package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {

	public static void main(String[] args) {

		//open chrome
		System.setProperty("webdriver.chrome.driver","./drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//open url
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		//Select the languages that you know?
		driver.findElementByXPath("(//input[@type='checkbox'])[1]").click();		
		driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[5]").click();
		
		//Confirm Selenium is checked
		if (driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected())
		{System.out.println("Selenium is checked by default");}
		else
			{System.out.println("Selenium is not checked by default");}
		
		//DeSelect only checked
		if (driver.findElementByXPath("(//input[@type='checkbox'])[7]").isSelected())
			{driver.findElementByXPath("(//input[@type='checkbox'])[7]").click();}
		else if(driver.findElementByXPath("(//input[@type='checkbox'])[8]").isSelected())
			{driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();}
		
		//Select all below checkboxes
	
	List<WebElement> check = driver.findElementsByXPath("//label[text()='Select all below checkboxes ']/following::input");
	for (WebElement eachelement : check) {
			eachelement.click();
		}
		}


}
