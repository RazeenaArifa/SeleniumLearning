package week4.day1.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement item4 = driver.findElementByXPath("(//li[@class='ui-state-default ui-sortable-handle'])[4]");
		int x =item4.getLocation().getX();
		int y =item4.getLocation().getY();
		WebElement item1= driver.findElementByXPath("(//li[@class='ui-state-default ui-sortable-handle'])[1]");
        Actions builder = new Actions(driver);	
        builder.dragAndDropBy(item1, x, y).perform();
        Thread.sleep(5000);
        driver.close();
	}

}
