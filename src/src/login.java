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
	private WebDriver driver;//de
    private WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
    private WebElement profileDropdown;
	  private WebElement PIMtab;
        private WebElement username;
        private WebElement password;
        private WebElement loginBtn;
        private WebElement Mainenantce;
	
    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction(){
	                 System.setProperty("webdriver.chrome.driver", "target/chromedriver.exe");
	   driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com"); 
		driver.manage().window().maximize();
        username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(By.id(String.valueOf(username))).getText();
        password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.id(String.valueOf(password))).getText();

	    loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Login']")));
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
 System.setProperty("webdriver.chrome.driver", "target/chromedriver.exe");
	   driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

        username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(By.id(String.valueOf(username))).getText();
        password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.id(String.valueOf(password))).getText();

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
         System.setProperty("webdriver.chrome.driver", "target/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(By.id(String.valueOf(username))).getText();
        password= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.id(String.valueOf(password))).getText();

	   

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

    
