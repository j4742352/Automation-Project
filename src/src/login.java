package src;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class login  {
	private WebDriver driver;
    private WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));;
    private WebElement profileDropdown;
	  private WebElement PIMtab;
        private WebElement usernameField;
        private WebElement passwordField;
        private WebElement loginBtn;
        private WebElement Mainenantce;
	
    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction(){
	                 System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");//here se.
	   driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com"); // no access to c1 , c2, c3
		driver.manage().window().maximize();
        usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));// c1
        driver.findElement(By.id(String.valueOf(usernameField))).getText();
        passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));// c2
        driver.findElement(By.id(String.valueOf(passwordField))).getText();

	      // Enter the credentials
        usernameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");


        loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Login']")));// c3
        driver.findElement(By.id(String.valueOf(loginBtn))).click();


  try {

            System.out.println("Login Test Passed – Dashboard Loaded");
      profileDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("oxd-userdropdown-name")));
            driver.findElement(By.id(String.valueOf(profileDropdown))).click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }
driver.quit();
        
    }

	
    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction1(){
 System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	   driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

        usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(By.id(String.valueOf(usernameField))).getText();
        passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.id(String.valueOf(passwordField))).getText();

	     // Enter the credentials
        usernameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");

        loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Login']")));
        driver.findElement(By.id(String.valueOf(loginBtn))).click();


        try {

            System.out.println("Login Test Passed – Dashboard Loaded");
            PIMtab= wait.until(ExpectedConditions.elementToBeClickable (By.cssSelector("button[type='PIM']")));
            driver.findElement(By.id(String.valueOf(PIMtab))).click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

        driver.quit();


    }
    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction2(){
         System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(By.id(String.valueOf(usernameField))).getText();
        passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.id(String.valueOf(passwordField))).getText();

	     // Enter the credentials
        usernameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");

        loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Login']")));
        driver.findElement(By.id(String.valueOf(loginBtn))).click();


        try {

            System.out.println("Login Test Passed – Dashboard Loaded");
            Mainenantce= wait.until(ExpectedConditions.elementToBeClickable (By.cssSelector("button[type='Mainenantce']")));
            driver.findElement(By.id(String.valueOf(Mainenantce))).click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

        driver.quit();


    }
}

    
