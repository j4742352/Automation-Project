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

    private WebDriver driver;
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
    private WebElement username1;
    private WebElement password;
    private WebElement loginBtn;
    private WebElement profileDropdown;
    private WebElement searchBtn;
    private   WebElement leaveTab;
private WebElement usernameText;
private WebElement   EmployeeNameText;
private   WebElement adminTab;
private  WebElement enabledBtn;
private WebElement disabledBtn;
    @Test
    public  <WebDriver, WebDriverWait, WebElement> void SearchFunction() throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        WebDriver driver = null;
        driver1.get("https://opensource-demo.orangehrmlive.com/");
        driver1.manage().window().maximize();

        driver1.findElement(By.id(waitForusername())).sendKeys("Admin");
        driver1.findElement(By.id(waitForpassword())).sendKeys("admin123");
        driver1.findElement(By.id(waitForloginBtn())).click();


        Thread.sleep(3000);


        driver1.findElement(By.id(waitForleaveTab ())).click();


        
        usernameText.findElement(By.xpath("//textarea"));

        usernameText.sendKeys((CharSequence) username1);
        Thread.sleep(3000);


        driver1.findElement(By.id(waitForsearchBtn())).click();
        Thread.sleep(3000);

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
    public String waitForleaveTab () {
 leaveTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leave']/parent::a")));
        return leaveTab.getText();
    }
    public String waitForsearchBtn() {
        searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Search']")));
        return  searchBtn.getText();
    }
    public String waitForadminTab () {
adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Leave']/parent::a")));
        return  searchBtn.getText();
    }
    public String waitForenabledBtn () {
        enabledBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Enabled']")));
        return   enabledBtn .getText();
    }
    public String waitFordisabledBtn () {
        disabledBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Disabled']")));
        return   disabledBtn .getText();
    }



    @Test
    public  <WebDriver, WebDriverWait, WebElement> void  SearchFunction1() throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        WebDriver driver = null;
        driver1.get("https://opensource-demo.orangehrmlive.com/");
        driver1.manage().window().maximize();


        Thread.sleep(3000);


        driver1.findElement(By.id(waitForadminTab ())).click();


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

        driver1.findElement(By.id(waitForsearchBtn())).click();
        Thread.sleep(3000);


        Thread.sleep(3000);

        driver1.quit();
}

    @Test
    public  <WebDriver, WebDriverWait, WebElement> void  SearchFunction2() throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        WebDriver driver = null;
        driver1.get("https://opensource-demo.orangehrmlive.com/");
        driver1.manage().window().maximize();
        //username

        driver1.findElement(By.id(waitForusername())).sendKeys("Admin");
        driver1.findElement(By.id(waitForpassword())).sendKeys("admin123");
        driver1.findElement(By.id(waitForloginBtn())).click();


        Thread.sleep(3000);

      //adminTab
        driver1.findElement(By.id(waitForadminTab ())).click();
       EmployeeNameText.findElement(By.xpath("//textarea"));
        EmployeeNameText.sendKeys("Employee Name");
        Thread.sleep(3000);

        //searchBtn
        driver1.findElement(By.id(waitForsearchBtn())).click();
        Thread.sleep(3000);

        driver1.quit();
    }


    @Test
    public  <WebDriver, WebDriverWait, WebElement> void  SearchFunction3() throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        WebDriver driver = null;
        driver1.get("https://opensource-demo.orangehrmlive.com/");
        driver1.manage().window().maximize();
        WebDriverWait wait = (WebDriverWait) Duration.ofSeconds(10);

        driver1.findElement(By.id(waitForusername())).sendKeys("Admin");
        driver1.findElement(By.id(waitForpassword())).sendKeys("admin123");
        driver1.findElement(By.id(waitForloginBtn())).click();
        Thread.sleep(3000);

        driver1.findElement(By.id(waitForadminTab ())).click();

        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("Choose Status:");
        System.out.println("1. Enabled");
        System.out.println("2. Disabled");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt(); // Read the user's integer input

        switch (choice) { // Evaluate the 'choice' variable
            case 1: // If choice is 1

                driver1.findElement(By.id(waitForenabledBtn ())).click();

                break; // Exit the switch statement
            case 2: // If choice is 2

                driver1.findElement(By.id(waitFordisabledBtn ())).click();

                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1 or 2");
                break;
        }

        input.close(); // Close the scanner

        driver1.findElement(By.id(waitForsearchBtn())).click();
        Thread.sleep(3000);

        driver1.quit();

    }
       public static class ExternalClass4 extends WebDriver {
    }

}
