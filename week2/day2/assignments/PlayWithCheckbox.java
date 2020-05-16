package week2.day2.assignments;




import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithCheckbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//label[contains (text(),'Select the languages')]/following-sibling::div//input)[1]").click();
		Thread.sleep(1000);
		if(driver.findElementByXPath("//label[contains (text(),'Confirm')]/following-sibling::div/input").isSelected())
		{
			System.out.println(driver.findElementByXPath("//label[contains (text(),'Confirm')]/following-sibling::div").getText());
		}
		if (driver.findElementByXPath("(//label[text()='DeSelect only checked']/../div)[1]").isSelected())
			System.out.println(driver.findElementByXPath("(//label[text()='DeSelect only checked']/../div)[1]").getText());
		else
			System.out.println(driver.findElementByXPath("(//label[text()='DeSelect only checked']/../div)[2]").getText());	

		
		
      List<WebElement> i = driver.findElementsByXPath("//label[text()='Select all below checkboxes ']/../div/input");
       for (WebElement j :i) {
    	  j.click();
      }
       Thread.sleep(1000);
       driver.close();
       }
	}



