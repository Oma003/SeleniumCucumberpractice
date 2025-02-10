package day3.CSSlocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.google.co.in/");
	    driver.manage().window().maximize();
	    
	    
	    // tag#Id
	    //driver.findElement(By.cssSelector("input#searchword")).sendKeys("Kindness");
	    //driver.findElement(By.cssSelector("#searchword")).sendKeys("Kindness");
	   
	    
	  
		//Tag.classname
	    
	    //driver.findElement(By.cssSelector("a.pHiOh")).click();
	    //System.out.println("l");
		

	}

}
