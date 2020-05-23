package week3.day2.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ERailSort {

	public static void main(String[] args) throws InterruptedException {
	
//		Launch the browser
		
//		Launch the URL - https://erail.in/
		
//		Uncheck the check box - sort on date
		
//		clear and type in the source station 
		
//		clear and type in the destination station
		
//		Find all the train names using xpath and store it in a list
		
//		Use Java Collections sort to sort it and then print it
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("Mgr Chennai Ctr",Keys.ENTER);
		driver.findElementByXPath("//input[@id='txtStationTo']").clear();
		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("Nagercoil Town",Keys.ENTER);
		driver.findElementByXPath("//input[@id='buttonFromTo']").click();
		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		List <WebElement> noOfRows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr");
		List<String> trainName= new ArrayList<String>();
		for (int i=1;i<=noOfRows.size();i++) {
			trainName.add(driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]/td[2]/a").getText());
		}
		
		Collections.sort(trainName);
		
		System.out.println(trainName);
	    driver.close();

	}

}
