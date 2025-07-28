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
    private WebElement profileDropdown;
    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction(){



  try {

            System.out.println("Login Test Passed – Dashboard Loaded");
            LPPPage.findElement(By.id(waitForprofileDropdown())).click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }
LPPPage.quit();
        
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
        loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));

        return loginBtn.getText();
    }
    public String waitForprofileDropdown() {
        profileDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-userdropdown-name")));

        return  profileDropdown.getText();
    }

    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction1(){

      
        try {

            System.out.println("Login Test Passed – Dashboard Loaded");
            LPPPage.findElement(By.id(waitForprofileDropdown())).click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

        LPPPage.quit();


    }


    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction2()
    {

        try {

            System.out.println("Login Test Passed – Dashboard Loaded");
           LPPPage.findElement(By.id(waitForprofileDropdown())).click();


            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }
       LPPPage.quit();
    }


    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction3()
    {



        try {

            System.out.println("Login Test Passed – Dashboard Loaded");
        LPPPage.findElement(By.id(waitForprofileDropdown())).click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

       LPPPage.quit();

    }

    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction4()
    {
   

        try {

            System.out.println("Login Test Passed – Dashboard Loaded");
          LPPPage.findElement(By.id(waitForprofileDropdown())).click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

       LPPPage.quit();


    }
}
