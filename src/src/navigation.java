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
    private WebElement username;
    private WebElement password;
    private WebElement loginBtn;
    private WebDriver driver = new ChromeDriver();//de
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private WebElement Btn;
    private WebElement timeTab;
    private WebElement attendanceBtn;
    private  WebElement searchBtn;
    private WebElement adminTab;
    private WebElement qualificationsBtn;
    private   WebElement skillsBtn;
    private WebElement addBtn;
    private     WebElement jobBtn;
    private  WebElement jobtitlesBtn;
private  WebElement projectInfoBtn;
private      WebElement organizationBtn;
private WebElement generalinformationBtn;

    @Test
    public  <WebDriver, WebDriverWait, WebElement> void NavigationFunction() throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "target/chromedriver.exe");

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
        username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(By.id(String.valueOf(username))).getText();
        password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.id(String.valueOf(password))).getText();

        loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Login']")));
        driver.findElement(By.id(String.valueOf(loginBtn))).click();

        timeTab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Time']/parent::a")));
        driver.findElement(By.id(String.valueOf(timeTab))).click();

        attendanceBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Attendance']")));
         driver.findElement(By.id(String.valueOf(attendanceBtn))).click();

  Thread.sleep(3000);


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
                Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));
                driver.findElement(By.id(String.valueOf(Btn))).click();

                break; // Exit the switch statement
            case 2: // If choice is 2
                System.out.println(" Punch In/Out");
                Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));
                driver.findElement(By.id(String.valueOf(Btn))).click();

                break;
            case 3: // If choice is 1
                System.out.println("Employee Records");
                Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));
                 driver.findElement(By.id(String.valueOf(Btn))).click();

                break; // Exit the switch statement
            case 4: // If choice is 2
                System.out.println("Configuration");
                Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));
                 driver.findElement(By.id(String.valueOf(Btn))).click();

                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1, 2 , 3 or 4");
                break;
        }

        input.close(); // Close the scanner
        searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//a[()='Search']")));
        driver.findElement(By.id(String.valueOf(searchBtn))).click();

        Thread.sleep(3000);

        adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Admin']/parent::a")));
         driver.findElement(By.id(String.valueOf(adminTab))).click();

        qualificationsBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Qualifications']/parent::a")));
       driver.findElement(By.id(String.valueOf(qualificationsBtn))).click();

        skillsBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Skills']/parent::a")));
         driver.findElement(By.id(String.valueOf(skillsBtn))).click();

        addBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Add']/parent::a")));
       driver.findElement(By.id(String.valueOf(addBtn))).click();

        driver.quit();
}



    @Test
    public  <WebDriver, WebDriverWait, WebElement> void NavigationFunction1() throws InterruptedException {
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


        adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Admin']/parent::a")));
        driver.findElement(By.id(String.valueOf(adminTab))).click();


        Thread.sleep(3000);

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
                Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));
               driver.findElement(By.id(String.valueOf(Btn))).click();

                break; // Exit the switch statement
            case 2: // If choice is 2
                System.out.println("Employee Reports ");
                Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));
                driver.findElement(By.id(String.valueOf(Btn))).click();

                break;
            case 3: // If choice is 1
                System.out.println("Attendance Summary ");
                Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));
                driver.findElement(By.id(String.valueOf(Btn))).click();

                break; // Exit the switch statement
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1, 2 or 3 ");
                break;
        }

        input.close(); // Close the scanner



        searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//a[()='Search']")));
        driver.findElement(By.id(String.valueOf(searchBtn))).click();

        Thread.sleep(3000);

        jobBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Job")));
       driver.findElement(By.id(String.valueOf(jobBtn))).click();

        jobtitlesBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Job Title")));
       driver.findElement(By.id(String.valueOf(jobtitlesBtn))).click();


        addBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Add']/parent::a")));
        driver.findElement(By.id(String.valueOf(addBtn))).click();


       driver.quit();

}


    @Test
    public  <WebDriver, WebDriverWait, WebElement> void NavigationFunction2() throws InterruptedException {
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


        adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Admin']/parent::a")));
        driver.findElement(By.id(String.valueOf(adminTab))).click();


        timeTab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Time']/parent::a")));
        driver.findElement(By.id(String.valueOf(timeTab))).click();

        projectInfoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[text()='Project Info']/parent::a")));
driver.findElement(By.id(String.valueOf(projectInfoBtn))).click();

        Thread.sleep(3000);

        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("Choose Project Info:");
        System.out.println("1. Customers");
        System.out.println("2. Projects ");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt(); // Read the user's integer input

        switch (choice) { // Evaluate the 'choice' variable
            case 1: // If choice is 1
                System.out.println("Customers ");
                Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));
              driver.findElement(By.id(String.valueOf(Btn))).click();

                break; // Exit the switch statement
            case 2: // If choice is 2
                System.out.println("Projects ");
                Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));
                driver.findElement(By.id(String.valueOf(Btn))).click();

                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1 or 2 ");
                break;
        }

        input.close(); // Close the scanner

        searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//a[()='Search']")));
        driver.findElement(By.id(String.valueOf(searchBtn))).click();
        Thread.sleep(3000);

        adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Admin']/parent::a")));
        driver.findElement(By.id(String.valueOf(adminTab))).click();

        organizationBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Organization")));
        driver.findElement(By.id(String.valueOf(organizationBtn))).click();
 Thread.sleep(3000);


        generalinformationBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("General Information")));
driver.findElement(By.id(String.valueOf(generalinformationBtn))).click();

        addBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Add']/parent::a")));
        driver.findElement(By.id(String.valueOf(addBtn))).click();

       driver.quit();




    }
   
}
