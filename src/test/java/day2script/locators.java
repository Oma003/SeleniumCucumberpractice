package day2script;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://staging.toolbox.bjshomedelivery.com/login");
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("username")).sendKeys("Jiya");
		driver.findElement(By.name("pwd")).sendKeys("Kyu003??");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		//driver.findElement(By.xpath("//li[contains(@class,'top-menu-active')]")).click();
		driver.findElement(By.xpath("//*[@id=\"main_88\"]/div[2]/div/ul[2]/a[3]/li")).click();		

		
		//driver.findElement(By.xpath("//*[@id=\"main_2\"]/div[1]/span[1]")).click(); //this 
		//driver.findElement(By.xpath("//span[text()='Routes']")).click(); //this relative x path and we can choose from current node and will be child node directly
		
		//driver.close(); - this will close only current active window
		//driver.quit();  - this will close all active windows
		
		//List <WebElement> test =  driver.findElements(By.className("menu_item"));
		//System.out.println(test.size());
		
		//List <WebElement> test =  driver.findElements(By.tagName("a"));
		//System.out.println(test.size());

		
	
		
		
				
				
				
				
				
				
	}

}
