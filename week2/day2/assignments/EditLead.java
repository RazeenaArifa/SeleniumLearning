package week2.day2.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("S",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.getTitle();
		driver.findElementByXPath("//a[@class='subMenuButton'][text()='Edit']").click();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("Test Leaf Leaf");
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		if (driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText().contains("Test Leaf Leaf"))
		{
			System.out.println("Company name is updated");
			
		}
		driver.close();

	}

}
