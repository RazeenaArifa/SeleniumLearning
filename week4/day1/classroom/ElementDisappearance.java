package week4.day1.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementDisappearance {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new  ChromeDriver();
		driver.get("http://leafground.com/pages/disapper.html");
		driver.manage().window().maximize();
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(ElementNotInteractableException.class);*/
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn")));
		if(driver.findElementByXPath("//div[@id='show']/p/strong").getText().contains("I know you can do it! Button is disappeared!"))
			System.out.println("Success");
			driver.close();	
	}

}
