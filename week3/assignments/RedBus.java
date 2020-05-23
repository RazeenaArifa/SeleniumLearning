package week3.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * https://www.redbus.in/

1) Launch chrome and load URL, implicitwait
2) Enter From (Chennai) and Tab
3) Enter To (Trichy) and Tab
4) Click on current date 
5) Click on Return Date
6) Click on current date 
7) Click Search Buses
8) Click After 6 PM checkbox 
9) Click Bus Type (AC) Checkbox 
10) Print number of buses found 

		 */
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='src']").sendKeys("Chennai",Keys.ENTER);
		driver.findElementByXPath("//input[@id='dest']").sendKeys("Trichy",Keys.ENTER);
		driver.findElementByXPath("//label[@for='onward_cal']").click();
		driver.findElementByXPath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td[@class='current day']").click();
		driver.findElementByXPath("//label[@for='return_cal']").click();
		driver.findElementByXPath("//div[@id='rb-calendar_return_cal']/table/tbody/tr/td[@class='current day']").click();
		//Thread.sleep(3000);
		driver.findElementById("search_btn").click();
		Thread.sleep(1000);
		System.out.println(driver.findElementByXPath("//div[@class='search']/div/div/h3").getText());
		driver.close();
	}

}
