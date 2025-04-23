package DMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class create_task {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://staging.dms.bjshomedelivery.com/flag");
		   driver.manage().window().maximize();
		   
		   
	}

}
