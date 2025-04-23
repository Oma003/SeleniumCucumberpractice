package day1script;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;



public class FirstTestCase {

	public static void main(String[] args) {
		
		//Launch browser(chrome)
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		//open url
		
		driver.get("https://staging.toolbox.bjshomedelivery.com/login/");
		
		//validate title
		
		String act_title = driver.getTitle();
		
		if(act_title.equals("BJS - Login"))
		{
			System.out.println("Test Passed");
		}
		
		else
		{
			System.out.println("Test Failed");
		}
		
		//close browser
		driver.close(); //use to close the browser
		
	

		
		

	}

}
