package week4.day1.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//	ChromeDriver driver=new  ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disbale-notification-");
		ChromeDriver driver=new  ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
	   WebElement men = driver.findElementByXPath("//a/span[@class='catText'][contains (text(),'Men')]");
	   Actions builder = new Actions(driver);
	   builder.moveToElement(men).perform();
	   Thread.sleep(3000);
	   driver.findElementByXPath("(//span[text()='Shirts'])[2]").click();
	   WebElement firstItem = driver.findElementByXPath("(//p[@class='product-title'])[1]");
	   builder.moveToElement(firstItem).perform();
	   driver.findElementByXPath("(//div[contains(text(),'Quick View')])[1]").click();
	   Thread.sleep(3000);
	   driver.close();
	  
	   

	}

}
