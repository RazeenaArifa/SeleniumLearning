package week3.day2.classroom;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) {

//		Set the system property and Launch the URL
		
//		Click the 'sort on date' checkbox
		
//		clear and type in the from station text field
		
//		clear and type in the to station text field
		
//		Add a java sleep for 2 seconds
		
//		Store all the train names in a list
		
//		Get the size of list
		
//		Add the list into a new Set
		
//		Get the size of set

//		Compare the Size of list and Set to verify the names are unique
		
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
		System.out.println(trainName.size());
		Set<String> trainNameSet = new LinkedHashSet<String>();
		trainNameSet.addAll(trainName);
		System.out.println(trainNameSet.size());
		if(trainName.size()==trainNameSet.size()) {
			System.out.println("Names are unique");
		}
			
		else
		{
			System.out.println("Names are not unique");
		}
		
		driver.close();

	}

}
