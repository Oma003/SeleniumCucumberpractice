package Import_Orders;

    
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
    

import java.time.Duration;

	public class DMS_import_orders {

	//    private static FluentWait<WebDriver> wait;

		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			    
			   // URL
			
			   driver.get("https://staging.toolbox.bjshomedelivery.com/login");
			   driver.manage().window().maximize();
			   
			   //Login 
			   
				driver.findElement(By.name("username")).sendKeys("Jiya");
				driver.findElement(By.name("pwd")).sendKeys("Kyu003??");
				driver.findElement(By.name("submit")).click();
				
				// Step: 1 Click order 
				
				driver.findElement(By.xpath( "(//i[@class='fa fa-first-order'][1])")).click();
				
				// Step: 2 wait 
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
				// Step: 3 Click Import Orders in drop down
				
				driver.findElement(By.xpath("//*[@id=\"main_88\"]/div[2]/div/ul[2]/a[3]/li")).click();		
						
				// Step: 4 Click on Choose file button
				
				WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));			
				
				//Step: 5 Attached file excel file with orders detail
				
	            String filepath = "C:\\Users\\Jiya Kharyal\\Documents\\Manifest.Demo10.csv";
	            fileInput.sendKeys(filepath);
	            
	            // Step: 6 Click check box for 'Confirm Import Details Correct'
	            
	            driver.findElement(By.xpath("//input[@name='confirm']")).click();
	            
	            //Step: 7 Click on the 'Submit' button
	            
	            WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Submit']"));
	            element.click();
	            
	            //Step: 8 Accept browser notification
	            
	            driver.switchTo().alert().accept();
	            
	            
	                  } 
	            // Step: 9 Close the driver
	            //driver.quit(); 
	
	        
	    }
	
	

