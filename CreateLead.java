package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver=new  ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Razeena");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("A");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();


		driver.close();

	}

}
