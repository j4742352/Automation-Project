package src;

import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Scanner;

import static jdk.internal.agent.Agent.getText;

public class search {

    private WebDriver driver;
    private WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));;
    private WebElement profileDropdown;
    private WebElement searchBtn;
    private WebElement username;
    private WebElement password;
    private   WebElement leaveTab;
private WebElement usernameText;
private WebElement   EmployeeNameText;
private   WebElement adminTab;
private  WebElement enabledBtn;
private WebElement disabledBtn;
    private WebElement loginBtn;
    private Object username1;

    @Test
    public  <WebDriver, WebDriverWait, WebElement> void SearchFunction() throws InterruptedException {
 	 System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

        username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
          driver.findElement(By.id(String.valueOf(username))).getText();
        password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		  driver.findElement(By.id(String.valueOf(password))).getText();

        loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Login']")));
         driver.findElement(By.id(String.valueOf(loginBtn))).click();

        Thread.sleep(3000);


        leaveTab  = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Login']")));
        driver.findElement(By.id(String.valueOf(leaveTab))).click();

        usernameText.findElement(By.xpath("//textarea"));

        usernameText.sendKeys((CharSequence) username1);
        Thread.sleep(3000);

        searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Search']")));
       driver.findElement(By.id(String.valueOf(searchBtn))).click();
        Thread.sleep(3000);

      driver.quit();

    }


    @Test
    public  <WebDriver, WebDriverWait, WebElement> void  SearchFunction1() throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	   driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

        username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(By.id(String.valueOf(username))).getText();
        password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.id(String.valueOf(password))).getText();

        loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Login']")));
        driver.findElement(By.id(String.valueOf(loginBtn))).click();

	    Thread.sleep(3000);
        adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[text()='Leave']/parent::a")));
       driver.findElement(By.id(String.valueOf(adminTab))).click();


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

        searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Search']")));
        driver.findElement(By.id(String.valueOf(searchBtn))).click();
        Thread.sleep(3000);

       driver.quit();
}

    @Test
    public  <WebDriver, WebDriverWait, WebElement> void  SearchFunction2() throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	   driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

        username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(By.id(String.valueOf(username))).getText();
        password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.id(String.valueOf(password))).getText();

        loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Login']")));
        driver.findElement(By.id(String.valueOf(loginBtn))).click();

 Thread.sleep(3000);

      //adminTab
        adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[text()='Leave']/parent::a")));
        driver.findElement(By.id(String.valueOf(adminTab))).click();

        EmployeeNameText.findElement(By.xpath("//textarea"));
        EmployeeNameText.sendKeys("Employee Name");
        Thread.sleep(3000);

        //searchBtn
        searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Search']")));
        driver.findElement(By.id(String.valueOf(searchBtn))).click();
        Thread.sleep(3000);

       driver.quit();
    }


    @Test
    public  <WebDriver, WebDriverWait, WebElement> void  SearchFunction3() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	   driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

        username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(By.id(String.valueOf(username))).getText();
        password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.id(String.valueOf(password))).getText();

        loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Login']")));
        driver.findElement(By.id(String.valueOf(loginBtn))).click();

        Thread.sleep(3000);

        adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[text()='Leave']/parent::a")));
        driver.findElement(By.id(String.valueOf(adminTab))).click();


        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("Choose Status:");
        System.out.println("1. Enabled");
        System.out.println("2. Disabled");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt(); // Read the user's integer input

        switch (choice) { // Evaluate the 'choice' variable
            case 1: // If choice is 1
                enabledBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Enabled']")));
               driver.findElement(By.id(String.valueOf(enabledBtn))).click();

                break; // Exit the switch statement
            case 2: // If choice is 2
                disabledBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Disabled']")));
               driver.findElement(By.id(String.valueOf(disabledBtn))).click();

                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1 or 2");
                break;
        }

        input.close(); // Close the scanner

        searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Search']")));
        driver.findElement(By.id(String.valueOf(searchBtn))).click();
        Thread.sleep(3000);

        driver.quit();

    }
}
