package week2.day1.assignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ButtonPage {

	public static void main(String[] args) {
		
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		
		//open the url
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		//click on the "go to home page" button
		WebElement homebtn = driver.findElementById("home");
		homebtn.click();
		
		//click on button link in home page
		WebElement btn = driver.findElementByLinkText("Button");
		btn.click();
		
		//get position (x,y)
		WebElement position = driver.findElementById("position");
		Point abc = position.getLocation();
		System.out.println("positions are " + abc);
		
		//find button color
		WebElement btncolor = driver.findElementById("color");
		System.out.println("button color is " + btncolor.getCssValue("background-color"));
		
		//find height and width
		WebElement sizes = driver.findElementById("size");
	System.out.println("height and width is " +	sizes.getSize());
	}


}
