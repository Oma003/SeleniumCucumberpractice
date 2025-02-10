package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_methods extends GetMethods{

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");

		//isDisplayed()
		
		//boolean Logo= driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		//System.out.println(Logo);
		
		
		//isEnabled()
		
		//boolean img = driver.findElement(By.xpath("//textarea[@id='APjFqb']")).isEnabled();
		//System.out.println(img);
		
		//isSelected()
		
		boolean test = driver.findElement(By.xpath("//span[@class='QCzoEc z1asCe MZy1Rb']//*[name()='svg']")).isSelected();
		System.out.println(test);
	}

}
