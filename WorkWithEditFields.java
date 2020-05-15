package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithEditFields {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Edit.html");
        driver.manage().window().maximize();
        driver.findElementByXPath("//div[@class='large-6 small-12 columns']/input[@id='email']").sendKeys("razeena@gmail.com");
        driver.findElementByXPath("(//div[@class='large-6 small-12 columns']/input[@type='text'])[2]").sendKeys("AppendText",Keys.TAB);
        System.out.println(driver.findElementByXPath("//div[@class='large-6 small-12 columns']/input[@value=\"TestLeaf\"]").getAttribute("value"));
        driver.findElementByXPath("//div[@class='large-6 small-12 columns']/input[@value='Clear me!!']").clear();
        boolean field = driver.findElementByXPath("(//div[@class='large-6 small-12 columns']/input)[5]").isEnabled();
        if (field ==false) {
        	System.out.println("Field is Disabled");
        }
        Thread.sleep(1000); 
        driver.close();
	}

}
