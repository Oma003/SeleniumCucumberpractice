package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class JiyaStepDefinition {
    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("I navigate to the toolbox login page")
    public void navigate_to_toolbox_login_page() {
        driver.get("https://staging.toolbox.bjshomedelivery.com/login");
    }

    @When("I enter {string} as the username")
    public void i_enter_as_the_username(String username) {
        driver.findElement(By.name("username")).sendKeys(username);
    }

    @When("I enter {string} as the password")
    public void i_enter_as_the_password(String password) {
        driver.findElement(By.name("pwd")).sendKeys(password);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.name("submit")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Then("I should be redirected to the toolbox dashboard")
    public void i_should_be_redirected_to_the_toolbox_dashboard() {
        boolean isDashboardDisplayed = driver.getCurrentUrl().contains("dashboard");
        assert isDashboardDisplayed : "Dashboard not loaded";
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        boolean isErrorDisplayed = driver.findElement(By.id("error-message")).isDisplayed();
        assert isErrorDisplayed : "Error message not displayed for invalid credentials";
    }
    
    @Then("I should see the toolbox logo displayed")
    public void i_should_see_the_toolbox_logo_displayed() {
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Home']")); 
        assert logo.isDisplayed() : "Logo is not displayed on the login page";
    }

      
    @After
    public void teardown() {
       driver.quit();
    }
}
