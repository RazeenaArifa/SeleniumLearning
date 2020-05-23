package week3.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		/*
		 *  * URL - http://www.leafground.com/pages/table.html
		 * 
		 * 1) Set the property for chromedriver and initialize the driver
		 * 
		 * 2) launch the url
		 * 
		 * 3) Get the table and store it as a webelement
		 * 
		 * 4) Find the number of rows based on its tag name and store it in a list
		 * 
		 * 5) Find the number of cols based on its tag name and store it in a list
		 * 
		 * 6) Print the size of the rows
		 * 
		 * 7) Print the size of the cols
		 * 
		 * 8) Get the progress value of 'Learn to interact with Elements' and store it in a variable
		 * 
		 * 9) Print the text of the variable
		 * 
		 * 10) Find the vital task for the least completed progress and check the box
		 * 
		 * /
		 */
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		WebElement tableDetails = driver.findElementByXPath("//table[@id='table_id']");
		List<WebElement> tableNoofRow = driver.findElementsByXPath("//table[@id='table_id']/tbody/tr");
		List<WebElement> tableNoofCol= driver.findElementsByXPath("//table[@id='table_id']/tbody/tr/th");
		System.out.println(tableNoofRow.size());
		System.out.println(tableNoofCol.size());
		int max=100;
		int row=0;
		for(int i =2;i<=tableNoofRow.size();i++)
		{
			for (int j =1; j<=tableNoofCol.size();j++) {
				String colname = driver.findElementByXPath("//table[@id='table_id']/tbody/tr["+i+"]/td["+j+"]").getText();
				
				//System.out.println(colname);
				if(colname.contains("Learn to interact with Elements")) {
					String progress= driver.findElementByXPath("//table[@id='table_id']/tbody/tr["+i+"]/td[2]").getText();
					System.out.println(progress);
				}}}
			for(int i =2;i<=tableNoofRow.size();i++) {
		
				String compProgress = driver.findElementByXPath("//table[@id='table_id']/tbody/tr["+i+"]/td[2]").getText();
				int progress = Integer.parseInt(compProgress.replace("%", ""));
				if(progress<max) {
					max =progress;
					 row=i;
									}
				
				
			}
			driver.findElementByXPath("//table[@id='table_id']/tbody/tr["+row+"]/td[3]/input").click();	
			
		Thread.sleep(1000);
			
		
		driver.close();
		

	}

}
