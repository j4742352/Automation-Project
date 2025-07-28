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
    private ChromeDriver driver = new ChromeDriver();
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private Webriver driver1 =  driver (WebDriver());
    private WebElement profileDropdown;
	  private WebElement PIMtab;
		  private WebElement Admintab;
		  private WebElement Maintenancetab;
	  private WebElement Directorytab;
        private WebElement username;
        private WebElement password;
        private WebElement loginBtn;
    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction(){
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

          driver1.findElement(By.id(waitForusername())).getText();
		  driver1.findElement(By.id(waitForpassword())).getText();
         driver1.findElement(By.id(waitForloginBtn())).click();

  try {

            System.out.println("Login Test Passed – Dashboard Loaded");
            driver1.findElement(By.id(waitForprofileDropdown())).click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }
driver1.quit();
        
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

        return loginBtn.click();
    }
    public String waitForprofileDropdown() {
        profileDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("oxd-userdropdown-name")));

        return  profileDropdown.click();
    }
 public String waitForPIMtab() {
        PIMtab= wait.until(ExpectedConditions.elementToBeClickable (By.cssSelector("button[type='PIM']")));

        return  PIMtab.click();
    }
	 public String waitForAdmintab() {
        Admintab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Admin']")));

        return  Admintab.click();
    }
	 public String waitForMaintenanceTab() {
       Maintenancetab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Maintenance']")));

        return  Maintancetab.click();
    }
	 public String waitForDirectorytab() {
      Directorytab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Directory']")));

        return  Directorytab.click();
    }
	
    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction1(){

                driver1.findElement(By.id(waitForusername())).getText();
		  driver1.findElement(By.id(waitForpassword())).getText();
         driver1.findElement(By.id(waitForloginBtn())).click();
        
        try {

            System.out.println("Login Test Passed – Dashboard Loaded");
            driver1.findElement(By.id(waitForPIMtab())).click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

        driver1.quit();


    }


    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction2()
    {
          driver1.findElement(By.id(waitForusername()).getText();
		  driver1.findElement(By.id(waitForpassword())).getText();
         driver1.findElement(By.id(waitForloginBtn())).click();
        
        try {

            System.out.println("Login Test Passed – Dashboard Loaded");
           driver1.findElement(By.id(waitForAdmintab())).click();


            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }
       driver1.quit();
    }


    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction3()
    {

          driver1.findElement(By.id(waitForusername())).getText();
		  driver1.findElement(By.id(waitForpassword()).getText();
         driver1.findElement(By.id(waitForloginBtn())).click();

        try {

            System.out.println("Login Test Passed – Dashboard Loaded");
        driver1.findElement(By.id(waitForMaintancetab())).click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

      driver1.quit();

    }

    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction4()
    {
             driver1.findElement(By.id(waitForusername())).getText();
		  driver1.findElement(By.id(waitForpassword())).getText();
         driver1.findElement(By.id(waitForloginBtn())).click();

        try {

            System.out.println("Login Test Passed – Dashboard Loaded");
          driver1.findElement(By.id(waitForDirectorytab())).click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

       driver1.quit();


    }
	     
}
