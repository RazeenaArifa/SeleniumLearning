package week4.day1.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementAppearance {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new  ChromeDriver();
		driver.get("http://leafground.com/pages/appear.html");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn")));
		System.out.println((driver.findElementByXPath("//button[@id='btn']/b")).getText());
		driver.close();

	}

}
