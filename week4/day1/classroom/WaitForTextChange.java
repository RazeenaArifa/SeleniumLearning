package week4.day1.classroom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTextChange {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new  ChromeDriver();
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("btn"), "Click ME!"));
		driver.findElementById("btn").click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
			driver.close();
	}

}
