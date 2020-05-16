package week2.day2.assignments;


import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("indumathy97@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		System.out.println(driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText());
		String name = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		Thread.sleep(1000);
		if(driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText().matches(name))
		{
			System.out.println("Duplicate Lead Name is same");
		}
		driver.close();

	}

}
