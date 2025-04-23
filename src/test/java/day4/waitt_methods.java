package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;


public class waitt_methods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//declaration
		
		driver. get ("https://staging.toolbox.bjshomedelivery.com/");
		driver.manage().window().maximize();
		
		
		
		 WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
				txtusername.sendKeys( "Jiya");
				
		//driver. close();

	}

}
