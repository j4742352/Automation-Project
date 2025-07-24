package src;

import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static javax.swing.UIManager.get;

public class login1  {
private WebDriver driver;
private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
private WebElement username;
private WebElement password;
private WebElement loginBtn;
private WebElement profileDropdown;

@Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction(){

        System.getProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        WebDriver driver = (WebDriver) driver1;// not used variable of driver and no value = , apply to the code
        driver1.get("https://opensource-demo.orangehrmlive.com/");



        driver1.manage().window().maximize();

        driver1.findElement(By.id(waitForusername())).sendKeys("Admin");
        driver1.findElement(By.id(waitForpassword())).sendKeys("admin123");
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


        username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        return username.getText();
    }
    public String waitForpassword() {
        password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

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
        System.getProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
         Webdriver driver = null;// not used variable of driver and no value = , apply to the code
        driver1.get("https://opensource-demo.orangehrmlive.com/");
        driver1.manage().window().maximize();


        driver1.findElement(By.id(waitForusername())).sendKeys("Admin");
        driver1.findElement(By.id(waitForpassword())).sendKeys("admin123");
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


    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction2()
    {
        System.getProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        WebDriver driver = null;// not used variable of driver and no value = , apply to the code
        driver1.get("https://opensource-demo.orangehrmlive.com/");
        driver1.manage().window().maximize();

        driver1.findElement(By.id(waitForusername())).sendKeys("Admin");
        driver1.findElement(By.id(waitForpassword())).sendKeys("admin123");
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


    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction3()
    {

        System.getProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        WebDriver driver = null;// not used variable of driver and no value = , apply to the code
        driver1.get("https://opensource-demo.orangehrmlive.com/");
        driver1.manage().window().maximize();

        driver1.findElement(By.id(waitForusername())).sendKeys("Admin");
        driver1.findElement(By.id(waitForpassword())).sendKeys("admin123");
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

    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction4()
    {
        System.getProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        WebDriver driver = driver1; // not used variable of driver and no value = , apply to the code
        driver1.get("https://opensource-demo.orangehrmlive.com/");
        driver1.manage().window().maximize();

        driver1.findElement(By.id(waitForusername())).sendKeys("Admin");
        driver1.findElement(By.id(waitForpassword())).sendKeys("admin123");
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
}

