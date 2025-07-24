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
    private WebDriver driver;
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private WebElement username;
    private WebElement password;
    private WebElement loginBtn;
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
 login obj = new ExternalClass5(); // calling external class of login
obj.startBrowser(String browserName, String url);

  Connection.driver = Connection.startBrowser("Chrome","webdriver.chrome.driver","C:\\chromedriver.exe");
    LoginPage loginPage=new LoginPage(Connection.driver);
    LPPage LPPPage = new LPPage(Connection.driver);
 LPPPage.get("https://opensource-demo.orangehrmlive.com/");
        
    assertTrue(loginPage.isInitialized());

    loginPage.loginCleo("Admin", "admin123");

    assertTrue(LPPage.isInitialized());
        Thread.sleep(3000);

        LPPPage.findElement(By.id(waitFortimeTab() )).click();


        LPPPage.findElement(By.id(waitForattendanceBtn())).click();




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
               LPPPage.findElement(By.id(waitForBtn() )).click();

                break; // Exit the switch statement
            case 2: // If choice is 2
                System.out.println(" Punch In/Out");
                LPPPage.findElement(By.id(waitForBtn() )).click();

                break;
            case 3: // If choice is 1
                System.out.println("Employee Records");
                LPPPage.findElement(By.id(waitForBtn() )).click();

                break; // Exit the switch statement
            case 4: // If choice is 2
                System.out.println("Configuration");
                LPPPage.findElement(By.id(waitForBtn() )).click();

                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1, 2 , 3 or 4");
                break;
        }

        input.close(); // Close the scanner

       LPPPage.findElement(By.id(waitForsearchBtn() )).click();

        Thread.sleep(3000);

        LPPPage.findElement(By.id(waitForadminTab() )).click();

       LPPPage.findElement(By.id(waitForqualificationsBtn ())).click();

        LPPPage.findElement(By.id(waitForskillsBtn ())).click();

       LPPPage.findElement(By.id( waitForaddBtn() )).click();

       LPPPage.quit();
}
    public String waitForusername() {


        username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));//exception

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
    public String waitFortimeTab() {
        timeTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[button()='Time']/parent::a")));
        return    timeTab.getText();
    }
    public String waitForattendanceBtn() {
        attendanceBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Attendance']")));
        return   attendanceBtn.getText();
    }
    public String waitForBtn() {
        Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));

        return   Btn.getText();
    }
    public String waitForsearchBtn() {
        searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[()='Search']")));
        return  searchBtn.getText();
    }
    public String waitForadminTab() {
        adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[button()='Admin']/parent::a")));
        return   adminTab.getText();
    }
    public String waitForqualificationsBtn () {
        qualificationsBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[button()='Qualifications']/parent::a")));

        return   qualificationsBtn.getText();
    }
    public String waitForskillsBtn () {
        skillsBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[button()='Skills']/parent::a")));
        return skillsBtn.getText();
    }
    public String waitForaddBtn() {
        addBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[button()='Add']/parent::a")));

        return   addBtn.getText();
    }
    public String waitForjobBtn () {
        jobBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Job")));
        return  jobBtn.getText();
    }
    public String waitForprojectInfoBtn() {
        projectInfoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Project Info']/parent::a")));
        return     projectInfoBtn.getText();
    }

    public String waitFororganizationBtn () {
        organizationBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Organization")));
        return   organizationBtn .getText();
    }
    public String waitForgeneralinformationBtn() {
        generalinformationBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("General Information")));
        return    generalinformationBtn.getText();
    }
    public String waitForjobtitlesBtn () {
        jobtitlesBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Job Title")));
        return     jobtitlesBtn.getText();
    }

    @Test
    public  <WebDriver, WebDriverWait, WebElement> void NavigationFunction1() throws InterruptedException {
login obj = new ExternalClass5(); // calling external class of login
obj.startBrowser(String browserName, String url);

  Connection.driver = Connection.startBrowser("Chrome","webdriver.chrome.driver","C:\\chromedriver.exe");
    LoginPage loginPage=new LoginPage(Connection.driver);
    LPPage LPPPage = new LPPage(Connection.driver);
 LPPPage.get("https://opensource-demo.orangehrmlive.com/");
        
    assertTrue(loginPage.isInitialized());

    loginPage.loginCleo("Admin", "admin123");

    assertTrue(LPPPage.isInitialized());

        Thread.sleep(3000);


      LPPPage.findElement(By.id(waitForadminTab())).click();


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
               LPPPage.findElement(By.id(waitForBtn())).click();

                break; // Exit the switch statement
            case 2: // If choice is 2
                System.out.println("Employee Reports ");
                LPPPage.findElement(By.id(waitForBtn())).click();

                break;
            case 3: // If choice is 1
                System.out.println("Attendance Summary ");
                LPPPage.findElement(By.id(waitForBtn())).click();

                break; // Exit the switch statement
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1, 2 or 3 ");
                break;
        }

        input.close(); // Close the scanner



       LPPPage.findElement(By.id(waitForsearchBtn())).click();

        Thread.sleep(3000);


        LPPPage.findElement(By.id(waitForjobBtn () )).click();


        LPPPage.findElement(By.id(waitForjobtitlesBtn ())).click();


       LPPPage.findElement(By.id(waitForaddBtn())).click();


        LPPPage.quit();

}


    @Test
    public  <WebDriver, WebDriverWait, WebElement> void NavigationFunction2() throws InterruptedException {
  login obj = new ExternalClass5(); // calling external class of login
obj.startBrowser(String browserName, String url);

  Connection.driver = Connection.startBrowser("Chrome","webdriver.chrome.driver","C:\\chromedriver.exe");
    LoginPage loginPage=new LoginPage(Connection.driver);
    LPPage LPPPage = new LPPage(Connection.driver);
 LPPPage.get("https://opensource-demo.orangehrmlive.com/");
        
    assertTrue(loginPage.isInitialized());

    loginPage.loginCleo("Admin", "admin123");

    assertTrue(LPPPage.isInitialized());
        Thread.sleep(3000);


       LPPPage.findElement(By.id(waitFortimeTab() )).click();

        LPPPage.findElement(By.id( waitForprojectInfoBtn() )).click();

        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("Choose Project Info:");
        System.out.println("1. Customers");
        System.out.println("2. Projects ");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt(); // Read the user's integer input

        switch (choice) { // Evaluate the 'choice' variable
            case 1: // If choice is 1
                System.out.println("Customers ");
              LPPPage.findElement(By.id(waitForBtn())).click();

                break; // Exit the switch statement
            case 2: // If choice is 2
                System.out.println("Projects ");
                LPPPage.findElement(By.id(waitForBtn())).click();

                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1 or 2 ");
                break;
        }

        input.close(); // Close the scanner


      LPPPage.findElement(By.id(waitForsearchBtn())).click();
        Thread.sleep(3000);

       LPPPage.findElement(By.id(waitForadminTab())).click();


     LPPPage.findElement(By.id(waitFororganizationBtn ())).click();



        LPPPage.findElement(By.id(waitForgeneralinformationBtn())).click();



       LPPPage.findElement(By.id(waitForaddBtn())).click();


       LPPPage.quit();




    }
       public static class ExternalClass5 extends WebDriver {
    }
}
