package week2.day2.assignments;




import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithRadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver=new  ChromeDriver();

		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//div[@id='first']/label/input[@id='yes']").click();
		if(driver.findElementByXPath("(//input[@name='news'])[1]").isSelected())
		{

			System.out.println(driver.findElementByXPath("//div[@class='large-6 small-12 columns']/label[@for='Unchecked']").getText());
		}
		else
			System.out.println(driver.findElementByXPath("//div[@class='large-6 small-12 columns']/label[@for='Checked']").getText());   
		if(driver.findElementByXPath("//div[@class='large-6 small-12 columns']/input[@value='1']").isSelected())
		{
			System.out.println("Age already selected");

		}
		Thread.sleep(1000);
		driver.close();
	}

}
