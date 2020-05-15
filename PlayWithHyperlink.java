package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithHyperlink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//div[@class='large-6 small-12 columns']/a[contains (text(),'Go')])[1]").click();
		driver.navigate().back();
		System.out.println(driver.findElementByXPath("//div[@class='large-6 small-12 columns']/a[contains (text(),'Find')]").getAttribute("href"));
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='large-6 small-12 columns']/a[contains (text(),'Verify')]").click();
		Thread.sleep(1000);
		String Messg= driver.findElementByXPath("//h1").getText();
		if (Messg.equalsIgnoreCase("HTTP Status 404 – Not Found") ){
			System.out.println("Page is Broken");
		}
		driver.navigate().back();
		driver.findElementByXPath("(//div[@class='large-6 small-12 columns']/a[contains (text(),'Go')])[2]").click();
		driver.findElementByXPath("//h5[contains (text(),'HyperLink')]/following-sibling::img").click();
		Thread.sleep(1000);
		driver.close();
	}

}
