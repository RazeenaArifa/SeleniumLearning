package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class BondWithButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Button.html");
        driver.manage().window().maximize();
        driver.findElementByXPath("//button[@id='home']").click();
        driver.navigate().back();
        System.out.println(driver.findElementByXPath("//button[@id='position']").getLocation());
        String Style = driver.findElementByXPath("//button[@id='color']").getAttribute("style");
        System.out.println(Style);
        System.out.println(driver.findElementByXPath("//button[@id='size']").getSize());
        Thread.sleep(1000);
        driver.close();
	}

}
