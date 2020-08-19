//No records to display is not captured properly

package week2.day2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver","./drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
					
//http://leaftaps.com/opentaps/control/main
 //Delete Lead:
	
//1	Launch the browser
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
//2	Enter the username
	WebElement usrname = driver.findElementById("username");
	usrname.sendKeys("demosalesmanager");

	//3	Enter the password
	WebElement pwd = driver.findElementById("password");
	pwd.sendKeys("crmsfa");

	//4	Click Login
	 WebElement submit = driver.findElementByClassName("decorativeSubmit");
	submit.click();

//5	Click crm/sfa link
	WebElement crmlink = driver.findElementByLinkText("CRM/SFA");
	crmlink.click();

//6	Click Leads link
	WebElement leads = driver.findElementByLinkText("Leads");
	leads.click();

//7	Click Find leads
	WebElement findlead = driver.findElementByLinkText("Find Leads");
	findlead.click();

	//8	Click on Phone
	driver.findElementByXPath("//span[text()='Phone']").click();
	
//9	Enter phone number
	String oldphn = "1111111111";
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(oldphn);
		
//10	Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(2000);
		
//11	Capture lead ID of First Resulting lead
	WebElement leadid = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		String leadids = leadid.getText();
		System.out.println(" lead ID of First Resulting lead: " + leadid.getText());
		
Thread.sleep(2000);
		
		  
		  //12 Click First Resulting lead driver.
		  driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		  
		
		  Thread.sleep(2000);
		  
		  //13 Click Delete
	driver.findElementByClassName("subMenuButtonDangerous").click();
	System.out.println("data is deleted");
		  	  
		  //14 Click Find leads
		  driver.findElementByXPath("//a[text()='Find Leads']").click();
		  
		  //15 Enter captured lead ID
		  driver.findElementByXPath("//input[@name='id']").sendKeys(leadids);
		  
		  
		  //16 Click find leads button
		  driver.findElementByXPath("//button[text()='Find Leads']").click();
		//button[@class='x-btn-text'][7]
		  
		  //17 Verify message "No records to display" in the Lead List. This message
		  //confirms the successful deletion 
		  
		 String text = driver.findElementByClassName("x-paging-info").getText();
		 
		  System.out.println(text);
			if (text.equals("No records to display")) {
				System.out.println("record deleted");
			} else {
				System.out.println("record not deleted");
			}
		    
		  //18 Close the browser (Do not log out)
		  // driver.close();
		  
		 	}

}
