package week2.day1;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver=new  ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement dropDown1source=driver.findElementByXPath("//select[@id='dropdown1']");
		WebElement dropDown2source=driver.findElementByXPath("//select[@name='dropdown2']");
		WebElement dropDown3source=driver.findElementByXPath("//select[@id='dropdown3']");
		WebElement dropDown4source=driver.findElementByXPath("//select[@class='dropdown']");
		WebElement dropDown5source=driver.findElementByXPath("(//select)[5]");
		WebElement dropDown6source=driver.findElementByXPath("(//select)[6]");
		
		Select dropDown1=new Select(dropDown1source);
		dropDown1.selectByIndex(1);
		Select dropDown2=new Select(dropDown2source);
		dropDown2.selectByVisibleText("Selenium");
		Select dropDown3=new Select(dropDown3source);
		dropDown3.selectByValue("1");
		//WebElement dropDown4source=driver.findElementByXPath("//select[@class='dropdown']");
		Select dropDown4=new Select(dropDown4source);
		List<WebElement> options=dropDown4.getOptions();
		int s=options.size();
		System.out.println("Size of the dropdown: "+(s-1));
		//Select dropDown5=new Select(dropDown5source);
		dropDown5source.sendKeys("Selenium");
		Select dropDown6=new Select(dropDown6source);
		dropDown6.selectByValue("1");
		
		Thread.sleep(10000);
		driver.close();
		

	}

}
