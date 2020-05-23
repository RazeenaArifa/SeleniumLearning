package week4.day1.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 1) Open https://www.myntra.com/
2) Mouse over on WOMEN 
3) Click Jackets & Coats
4) Find the total count of item 
5) Validate the sum of categories count matches
6) Check Coats in CATEGORIES 
7) Click + More option under BRAND	
8) Type MANGO and click checkbox
9) Close the pop-up x
10) Confirm all the Coats are of brand MANGO  
11) Sort by Better Discount
12) Find the price of first displayed item    
13) Mouse over on size of the first item
14) Click on WishList Now
15) Close Browser
		 */
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disbale-notification-");
		ChromeDriver driver=new  ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement women = driver.findElementByXPath("//a[@data-group='women']");
		Actions builder = new Actions(driver);
		builder.moveToElement(women).perform();
		driver.findElementByXPath("//a[text()='Jackets & Coats']").click();
		Thread.sleep(3000);
		driver.close();

	}

}
