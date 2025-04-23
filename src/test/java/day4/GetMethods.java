package day4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static String myName;
	public static int var;
	
	public void nameCalling() {
		System.out.println(myName);
	}

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();	
		
		driver.get("https://staging.toolbox.bjshomedelivery.com/");
		
		//System.out.println(driver.getTitle());
		
		//System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle()); //it will return window id every time it will be diffrent
		
		System.out.println(driver.getWindowHandles());
		
		myName = "Jiya";
		var = 1;
	
	

	}

}
