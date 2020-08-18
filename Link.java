package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {


	public static void main(String[] args) {

		//open chrome
		System.setProperty("webdriver.chrome.driver","./drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//open url
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		//Go to Home Page
		WebElement homepg = driver.findElementByLinkText("Go to Home Page");
		homepg.click();
		
		//go back 
		WebElement bcktolink = driver.findElementByLinkText("HyperLink");
		bcktolink.click();
		
		//Find where am supposed to go without clicking me?
		String clck = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		System.out.println("Find where am supposed to go without clicking me? : " + clck);
		
		//Verify am I broken?
		driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
		driver.findElementByXPath("//h1");
		String broke = driver.getTitle();
		
		if (broke.contains("404"))
			System.out.println("I am broken");
				else
					System.out.println("I am not broken");
		
		
		driver.navigate().back();
		
		//Go to Home Page (Interact with same link name)
		WebElement homepg2 = driver.findElementByLinkText("Go to Home Page");
		homepg2.click();
				

		//go back 
		driver.findElementByLinkText("HyperLink").click();
		
		//how many links are available in this page?
		List<WebElement> linkcount = driver.findElementsByXPath("//a");
		System.out.println("how many links are available in this page?: " + linkcount.size());
		
	}

}
