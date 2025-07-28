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
    private WebDriverWait wait ;
    private WebElement  Maintenancetab;
    private WebElement profileDropdown;
	  private WebElement PIMtab;
		  private WebElement Admintab;
	  private WebElement Directorytab;
        private WebElement username;
        private WebElement password;
        private WebElement loginBtn;
	
    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction(){
	                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	   driver = new ChromeDriver();
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

         driver.findElement(By.id(waitForusername())).getText();
		  driver.findElement(By.id(waitForpassword())).getText();
        driver.findElement(By.id(waitForloginBtn())).click();

  try {

            System.out.println("Login Test Passed – Dashboard Loaded");
            driver.findElement(By.id(waitForprofileDropdown())).click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }
driver.quit();
        
    }

    public String waitForusername() {


        username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Admin")));

        return username.getText();
    }
    public String waitForpassword() {
        password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("admin123")));

        return password.getText();
    }
    public String waitForloginBtn() {
        loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Login']")));

        return loginBtn;
    }
    public WebElement waitForprofileDropdown() {
        profileDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("oxd-userdropdown-name")));

        return  profileDropdown;
    }
 public String waitForPIMtab() {
        PIMtab= wait.until(ExpectedConditions.elementToBeClickable (By.cssSelector("button[type='PIM']")));

        return  PIMtab;
    }
	 public WebElement waitForAdmintab() {
        Admintab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Admin']")));

        return  Admintab;
    }
	 public WebElement waitForMaintenanceTab() {
       Maintenancetab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Maintenance']")));

        return  Maintenancetab;
    }
	 public WebElement waitForDirectorytab() {
      Directorytab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Directory']")));

        return  Directorytab;
    }
	
    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction1(){
 System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	   driver = new ChromeDriver();
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	    
                driver.findElement(By.id(waitForusername())).getText();
		  driver.findElement(By.id(waitForpassword())).getText();
         driver.findElement(By.id(waitForloginBtn())).click();
        
        try {

            System.out.println("Login Test Passed – Dashboard Loaded");
            driver.findElement(By.id(waitForPIMtab())).click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

        driver.quit();


    }
