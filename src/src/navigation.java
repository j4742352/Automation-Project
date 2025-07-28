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
 driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

          driver.findElement(By.id(waitForusername())).getText();
		  driver.findElement(By.id(waitForpassword())).getText();
         driver.findElement(By.id(waitForloginBtn())).click();

        driver.findElement(By.id(waitFortimeTab() )).click();


         driver.findElement(By.id(waitForattendanceBtn())).click();

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
                driver.findElement(By.id(waitForBtn() )).click();

                break; // Exit the switch statement
            case 2: // If choice is 2
                System.out.println(" Punch In/Out");
                driver.findElement(By.id(waitForBtn() )).click();

                break;
            case 3: // If choice is 1
                System.out.println("Employee Records");
                 driver.findElement(By.id(waitForBtn() )).click();

                break; // Exit the switch statement
            case 4: // If choice is 2
                System.out.println("Configuration");
                 driver.findElement(By.id(waitForBtn() )).click();

                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1, 2 , 3 or 4");
                break;
        }

        input.close(); // Close the scanner

        driver.findElement(By.id(waitForsearchBtn() )).click();

        Thread.sleep(3000);

         driver.findElement(By.id(waitForadminTab() )).click();

       driver.findElement(By.id(waitForqualificationsBtn ())).click();

         driver.findElement(By.id(waitForskillsBtn ())).click();

       driver.findElement(By.id( waitForaddBtn() )).click();

        driver.quit();
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
        loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Login']")));

        return loginBtn.click();
    }
    public String waitFortimeTab() {
        timeTab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Time']/parent::a")));
        return    timeTab.click();
    }
    public String waitForattendanceBtn() {
        attendanceBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='Attendance']")));
        return   attendanceBtn.click();
    }
    public String waitForBtn() {
        Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button")));

        return   Btn.click();
    }
    public String waitForsearchBtn() {
        searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//a[()='Search']")));
        return  searchBtn.click();
    }
    public String waitForadminTab() {
        adminTab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Admin']/parent::a")));
        return   adminTab.click();
    }
    public String waitForqualificationsBtn () {
        qualificationsBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Qualifications']/parent::a")));

        return   qualificationsBtn.click();
    }
    public String waitForskillsBtn () {
        skillsBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Skills']/parent::a")));
        return skillsBtn.click();
    }
    public String waitForaddBtn() {
        addBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[button()='Add']/parent::a")));

        return   addBtn.click();
    }
    public String waitForjobBtn () {
        jobBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Job")));
        return  jobBtn.click();
    }
    public String waitForprojectInfoBtn() {
        projectInfoBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("//span[text()='Project Info']/parent::a")));
        return     projectInfoBtn.click();
    }

    public String waitFororganizationBtn () {
        organizationBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Organization")));
        return   organizationBtn .click();
    }
    public String waitForgeneralinformationBtn() {
        generalinformationBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("General Information")));
        return    generalinformationBtn.click();
    }
    public String waitForjobtitlesBtn () {
        jobtitlesBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Job Title")));
        return     jobtitlesBtn.click();
    }

    @Test
    public  <WebDriver, WebDriverWait, WebElement> void NavigationFunction1() throws InterruptedException {
driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

          driver.findElement(By.id(waitForusername())).getText();
		  driver.findElement(By.id(waitForpassword())).getText();
         driver.findElement(By.id(waitForloginBtn())).click();
         driver.findElement(By.id(waitForadminTab())).click();

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
               driver.findElement(By.id(waitForBtn())).click();

                break; // Exit the switch statement
            case 2: // If choice is 2
                System.out.println("Employee Reports ");
                driver.findElement(By.id(waitForBtn())).click();

                break;
            case 3: // If choice is 1
                System.out.println("Attendance Summary ");
                driver.findElement(By.id(waitForBtn())).click();

                break; // Exit the switch statement
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1, 2 or 3 ");
                break;
        }

        input.close(); // Close the scanner



      driver.findElement(By.id(waitForsearchBtn())).click();

        Thread.sleep(3000);


       driver.findElement(By.id(waitForjobBtn () )).click();


       driver.findElement(By.id(waitForjobtitlesBtn ())).click();


     driver.findElement(By.id(waitForaddBtn())).click();


       driver.quit();

}


    @Test
    public  <WebDriver, WebDriverWait, WebElement> void NavigationFunction2() throws InterruptedException {
driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

          driver.findElement(By.id(waitForusername())).getText();
		  driver.findElement(By.id(waitForpassword())).getText();
         driver.findElement(By.id(waitForloginBtn())).click();
         driver.findElement(By.id(waitForadminTab())).click();
     driver.findElement(By.id(waitFortimeTab() )).click();
driver.findElement(By.id( waitForprojectInfoBtn() )).click();

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
              driver.findElement(By.id(waitForBtn())).click();

                break; // Exit the switch statement
            case 2: // If choice is 2
                System.out.println("Projects ");
                driver.findElement(By.id(waitForBtn())).click();

                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1 or 2 ");
                break;
        }

        input.close(); // Close the scanner

 driver.findElement(By.id(waitForsearchBtn())).click();
        Thread.sleep(3000);

        driver.findElement(By.id(waitForadminTab())).click();

        driver.findElement(By.id(waitFororganizationBtn ())).click();
 Thread.sleep(3000);
        
driver.findElement(By.id(waitForgeneralinformationBtn())).click();

        driver.findElement(By.id(waitForaddBtn())).click();


       driver.quit();




    }
   
}
