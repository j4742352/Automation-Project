package src;

import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Scanner;

public class search {

    @Test
    public  <WebDriver, WebDriverWait, WebElement> void SearchFunction() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));


        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginBtn.click();
        Thread.sleep(3000);

        WebElement leaveTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leave']/parent::a")));
        adminTab.click();

        
        WebElement usernameText = driver.findElement(By.xpath("//textarea"));
        usernameText.sendKeys("Username");
        Thread.sleep(3000);

        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Search']")));
        searchBtn.click();
        Thread.sleep(3000);

        driver.quit();

    }

    @Test
    public  <WebDriver, WebDriverWait, WebElement> void  SearchFunction1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));


        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginBtn.click();
        Thread.sleep(3000);

        WebElement adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leave']/parent::a")));
        adminTab.click();

        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("Choose an User Role:");
        System.out.println("1. Admin");
        System.out.println("2. ESS");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt(); // Read the user's integer input

        switch (choice) { // Evaluate the 'choice' variable
            case 1: // If choice is 1
                System.out.println("Admin");
                break; // Exit the switch statement
            case 2: // If choice is 2
                System.out.println("ESS");
                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1 or 2");
                break;
        }

        input.close(); // Close the scanner

       
        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Search']")));
        searchBtn.click();
        Thread.sleep(3000);

        driver.quit();
}

    @Test
    public  <WebDriver, WebDriverWait, WebElement> void  SearchFunction2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));


        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginBtn.click();
        Thread.sleep(3000);

        WebElement adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leave']/parent::a")));
        adminTab.click();

        WebElement EmployeeNameText = driver.findElement(By.xpath("//textarea"));
        EmployeeNameText.sendKeys("Employee Name");
        Thread.sleep(3000);

        
        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Search']")));
        searchBtn.click();
        Thread.sleep(3000);

        driver.quit();
    }


    @Test
    public  <WebDriver, WebDriverWait, WebElement> void  SearchFunction3() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));


        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginBtn.click();
        Thread.sleep(3000);

        WebElement adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leave']/parent::a")));
        adminTab.click();

        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("Choose Status:");
        System.out.println("1. Enabled");
        System.out.println("2. Disabled");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt(); // Read the user's integer input

        switch (choice) { // Evaluate the 'choice' variable
            case 1: // If choice is 1
              WebElement enabledBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Enabled']")));
               enabledBtn.click();
                break; // Exit the switch statement
            case 2: // If choice is 2
              WebElement disabledBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Disabled']")));
                     disabledBtn.click();
                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1 or 2");
                break;
        }

        input.close(); // Close the scanner


        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Search']")));
        searchBtn.click();
        Thread.sleep(3000);

        driver.quit();

    }


}
