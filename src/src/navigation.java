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

import static org.junit.Assert.*;

public class navigation {

    @Test
    public  <WebDriver, WebDriverWait, WebElement> void NavigationFunction() throws InterruptedException {
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

        WebElement timeTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[button()='Time']/parent::a")));
        timeTab.click();

        WebElement attendanceBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Attendance']")));
        attendanceBtn.click();

        WebElement Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));


        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("Choose an Attendance:");
        System.out.println("1. My Records");
        System.out.println("2. Punch In/Out");
        System.out.println("3. Employee Records");
        System.out.println("4. Configuration");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt(); // Read the user's integer input

        switch (choice) { // Evaluate the 'choice' variable
            case 1: // If choice is 1
                System.out.println(" My Records");
                Btn.click();
                break; // Exit the switch statement
            case 2: // If choice is 2
                System.out.println(" Punch In/Out");
                Btn.click();
                break;
            case 3: // If choice is 1
                System.out.println("Employee Records");
                Btn.click();
                break; // Exit the switch statement
            case 4: // If choice is 2
                System.out.println("Configuration");
                Btn.click();
                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1, 2 , 3 or 4");
                break;
        }

        input.close(); // Close the scanner


        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[()='Search']")));
        searchBtn.click();
        Thread.sleep(3000);

          WebElement adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[button()='Admin']/parent::a")));
        adminTab.click();

       
        WebElement qualificationsBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[button()='Qualifications']/parent::a")));
      qualificationsBtn.click();

      
        WebElement skillsBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[button()='Skills']/parent::a")));
     skillsBtn.click();

        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[button()='Add']/parent::a")));
        addBtn.click();


        driver.quit();
}


    @Test
    public  <WebDriver, WebDriverWait, WebElement> void NavigationFunction1(){
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

        WebElement adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']/parent::a")));
        adminTab.click();

        WebElement Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));


        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("Choose Reports:");
        System.out.println("1. Project Reports");
        System.out.println("2. Employee Reports");
        System.out.println("3. Attendance Summary");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt(); // Read the user's integer input

        switch (choice) { // Evaluate the 'choice' variable
            case 1: // If choice is 1
                System.out.println("Project Reports ");
                Btn.click();
                break; // Exit the switch statement
            case 2: // If choice is 2
                System.out.println("Employee Reports ");
                Btn.click();
                break;
            case 3: // If choice is 1
                System.out.println("Attendance Summary ");
                Btn.click();
                break; // Exit the switch statement
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1, 2 or 3 ");
                break;
        }

        input.close(); // Close the scanner


        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Search']")));
        searchBtn.click();
        Thread.sleep(3000);

         WebElement jobBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Job")));
       jobBtn.click();

        WebElement jobtitlesBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Job Title")));
       jobtitlesBtn.click();

        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Add")));
        addBtn.click();


        driver.quit();

}


    @Test
    public  <WebDriver, WebDriverWait, WebElement> void NavigationFunction2()
    {
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

        WebElement timeTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Time']/parent::a")));
        timeTab.click();

        WebElement projectInfoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Project Info']/parent::a")));
        projectInfoBtn.click();

        WebElement Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));


        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("Choose Project Info:");
        System.out.println("1. Customers");
        System.out.println("2. Projects ");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt(); // Read the user's integer input

        switch (choice) { // Evaluate the 'choice' variable
            case 1: // If choice is 1
                System.out.println("Customers ");
                Btn.click();
                break; // Exit the switch statement
            case 2: // If choice is 2
                System.out.println("Projects ");
                Btn.click();
                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1 or 2 ");
                break;
        }

        input.close(); // Close the scanner


        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Search']")));
        searchBtn.click();
        Thread.sleep(3000);

         WebElement adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[button()='Admin']/parent::a")));
        adminTab.click();

        WebElement organizationBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Organization")));
       organizationBtn.click();

        WebElement generalinformationBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("General Information")));
       generalinformationBtn.click();

        WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Add")));
        addBtn.click();

        driver.quit();




    }

}
