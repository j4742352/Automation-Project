package src;

import org.openqa.selenium.WebDriver;
import org.OpenQA.Selenium.Chrome;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;
public class login  {

    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));


        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginBtn.click();

        try {
            WebElement profileDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-userdropdown-name")));
            System.out.println("Login Test Passed – Dashboard Loaded");
            profileDropdown.click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

        driver.quit();

    }


    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction1(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));


        username.sendKeys("User");
        password.sendKeys("user123");
        loginBtn.click();

        try {
            WebElement profileDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-userdropdown-name")));
            System.out.println("Login Test Passed – Dashboard Loaded");
            profileDropdown.click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

        driver.quit();


    }


    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction2()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));


        username.sendKeys("Admin1");
        password.sendKeys("admin1234");
        loginBtn.click();

        try {
            WebElement profileDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-userdropdown-name")));
            System.out.println("Login Test Passed – Dashboard Loaded");
            profileDropdown.click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

        driver.quit();


    }
    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction3()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));


        username.sendKeys("Admin3");
        password.sendKeys("admin1234");
        loginBtn.click();

        try {
            WebElement profileDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-userdropdown-name")));
            System.out.println("Login Test Passed – Dashboard Loaded");
            profileDropdown.click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

        driver.quit();

    }
    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction4()
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));


        username.sendKeys("User2");
        password.sendKeys("user1234");
        loginBtn.click();

        try {
            WebElement profileDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-userdropdown-name")));
            System.out.println("Login Test Passed – Dashboard Loaded");
            profileDropdown.click();

            System.out.println("Waiting for 6 seconds on the dashboard...");
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Login Test Failed – Dashboard not detected");
        }

        driver.quit();


    }
}

