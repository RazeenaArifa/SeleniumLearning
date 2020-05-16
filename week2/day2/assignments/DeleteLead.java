package week2.day2.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver=new  ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99",Keys.ENTER);
		Thread.sleep(1000);
		System.out.println(driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText());
		String id = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	    driver.findElementByXPath("//a[text()='Delete']").click();
	   driver.findElementByXPath("//a[text()='Find Leads']").click();
	   driver.findElementByXPath("//input[@name='id']").sendKeys(id,Keys.ENTER);
	   Thread.sleep(1000);
	   String Message = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
	    if (Message.contains("No records to display"))
	    {
	   	System.out.println("Record successfully deleted");
	    }
	    driver.close();

	}

}
