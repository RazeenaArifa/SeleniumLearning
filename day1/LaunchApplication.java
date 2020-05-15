package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver=new  ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement userName= driver.findElementById("username");
		userName.sendKeys("demosalesmanager");
		WebElement password= driver.findElementById("password");
		password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Razeena");
		driver.findElementById("createLeadForm_lastName").sendKeys("A");
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown=new Select(source);
		dropdown.selectByVisibleText("Employee");
		WebElement marketingCampaignId_source=driver.findElementById("createLeadForm_marketingCampaignId");
		Select marketingCampaignId_dropdown=new Select(marketingCampaignId_source);
		marketingCampaignId_dropdown.selectByValue("9001");
		WebElement OwnerShip_source=driver.findElementById("createLeadForm_ownershipEnumId");
		Select OwnerShip_dropdown=new Select(OwnerShip_source);
		OwnerShip_dropdown.selectByIndex(5);
		WebElement country_source=driver.findElementById("createLeadForm_generalCountryGeoId");
		Select country_dropdown=new Select(country_source);
		country_dropdown.selectByVisibleText("India");
		
		driver.findElementByName("submitButton").click();
		System.out.println(driver.getTitle());
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
