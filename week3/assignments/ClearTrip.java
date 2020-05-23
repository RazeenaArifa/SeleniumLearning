package week3.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * https://www.cleartrip.com/

1) Launch chrome and load URL, implicitwait
2) Click Round trip
3) Enter From city (Chennai) and TAB
4) Enter To city (New York) and TAB
5) Click Depart On (text box) 
6) Click Date (use current date as hardcoded) // Note it is link -> so use linkText
8) Click Return On (text box) 
9) Click Date (10) // Note it is link -> so use linkText
10) Select Adults (as 2)
11) Select Children (as 1)
12) Select Infant (as 1)
13) Click More Options (use id as locator)
14) Select Premium Economy as Class of Travel
15) Enter Preferred Airline as Emirates and TAB
16) Click Search Flights

	*/	 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//label[@for='RoundTrip']/input").click();
		driver.findElementByXPath("//input[@etitle='From']").sendKeys("Chennai",Keys.TAB);
		driver.findElementByXPath("//input[@etitle='To']").sendKeys("New York",Keys.TAB);
		driver.findElementByXPath("//input[@id='DepartDate']").click();
		driver.findElementByXPath("//a[text()='23']").click();
		driver.findElementByXPath("//input[@id='ReturnDate']").click();
		driver.findElementByXPath("//a[text()='10']").click();
		driver.findElementByXPath("//select[@id='Adults']/option[@value='2']").click();
		driver.findElementByXPath("//select[@id='Childrens']/option[@value='1']").click();
		driver.findElementByXPath("//select[@id='Infants']/option[@value='1']").click();
		driver.findElementByXPath("//a[@id='MoreOptionsLink']").click();
		driver.findElementByXPath("//select[@id='Class']/option[@value='Premium Economy']").click();
		driver.findElementByXPath("//input[@name='airline']").sendKeys("Emirates",Keys.TAB);
		driver.findElementByXPath("//input[@id='SearchBtn']").click();
		System.out.println("Completed");
		driver.close();
	}

}
