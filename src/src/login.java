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
    private WebDriver driver1 = driver;
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private WebElement username;
    private WebElement password;
    private WebElement loginBtn;
    private WebElement profileDropdown;
    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction(){

login obj = new ExternalClass4(); // calling external class of login
obj.startBrowser(String browserName, String url);

  Connection.driver = Connection.startBrowser("Chrome","webdriver.chrome.driver","C:\\chromedriver.exe");
    LoginPage loginPage=new LoginPage(Connection.driver);
    LPPage LPPPage = new LPPage(Connection.driver);
 driver.get("https://opensource-demo.orangehrmlive.com/");
        
    assertTrue(loginPage.isInitialized());

    loginPage.loginCleo("Admin", "admin123");

    assertTrue(LPPage.isInitialized());

  try {

            System.out.println("Login Test Passed – Dashboard Loaded");
            driver1.findElement(By.id(waitForprofileDropdown())).click();

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
        loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));

        return loginBtn.getText();
    }
    public String waitForprofileDropdown() {
        profileDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-userdropdown-name")));

        return  profileDropdown.getText();
    }

    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction1(){

        login obj = new ExternalClass4(); // calling external class of login
obj.startBrowser(String browserName, String url);

  Connection.driver = Connection.startBrowser("Chrome","webdriver.chrome.driver","C:\\chromedriver.exe");
    LoginPage loginPage=new LoginPage(Connection.driver);
    LPPage LPPPage = new LPPage(Connection.driver);
 driver.get("https://opensource-demo.orangehrmlive.com/");
        
    assertTrue(loginPage.isInitialized());

    loginPage.loginCleo("Admin", "admin123");

    assertTrue(LPPage.isInitialized());

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


    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction2()
    {
 login obj = new ExternalClass4(); // calling external class of login
obj.startBrowser(String browserName, String url);

  Connection.driver = Connection.startBrowser("Chrome","webdriver.chrome.driver","C:\\chromedriver.exe");
    LoginPage loginPage=new LoginPage(Connection.driver);
    LPPage LPPPage = new LPPage(Connection.driver);
 driver.get("https://opensource-demo.orangehrmlive.com/");
        
    assertTrue(loginPage.isInitialized());

    loginPage.loginCleo("Admin", "admin123");

    assertTrue(LPPage.isInitialized());

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


    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction3()
    {

login obj = new ExternalClass4(); // calling external class of login
obj.startBrowser(String browserName, String url);

  Connection.driver = Connection.startBrowser("Chrome","webdriver.chrome.driver","C:\\chromedriver.exe");
    LoginPage loginPage=new LoginPage(Connection.driver);
    LPPage LPPPage = new LPPage(Connection.driver);
 driver.get("https://opensource-demo.orangehrmlive.com/");
        
    assertTrue(loginPage.isInitialized());

    loginPage.loginCleo("Admin", "admin123");

    assertTrue(LPPage.isInitialized());

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

    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction4()
    {
       login obj = new ExternalClass4(); // calling external class of login
obj.startBrowser(String browserName, String url);

  Connection.driver = Connection.startBrowser("Chrome","webdriver.chrome.driver","C:\\chromedriver.exe");
    LoginPage loginPage=new LoginPage(Connection.driver);
    LPPage LPPPage = new LPPage(Connection.driver);
 driver.get("https://opensource-demo.orangehrmlive.com/");
        
    assertTrue(loginPage.isInitialized());

    loginPage.loginCleo("Admin", "admin123");

    assertTrue(LPPage.isInitialized());


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
        public static class ExternalClass4 extends WebDriver {
    }
}
