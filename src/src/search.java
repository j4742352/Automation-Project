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

public class login  {
    private ChromeDriver driver = new ChromeDriver();
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    private Webriver driver1 =  driver (WebDriver());
    private WebElement profileDropdown;
        private WebElement username;
        private WebElement password;
        private WebElement loginBtn;
    @Test
    public <WebDriver, WebDriverWait, WebElement> void LoginFunction(){
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

          driver1.findElement(By.id(waitForusername())).getText();
		  driver1.findElement(By.id(waitForpassword())).getText();
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

public class search {
     private Webriver driver1 =  driver (WebDriver());
   private ChromeDriver driver = new ChromeDriver();
    private WebDriver driver;
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
 		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

          driver1.findElement(By.id(waitForusername())).getText();
		  driver1.findElement(By.id(waitForpassword())).getText();
         driver1.findElement(By.id(waitForloginBtn())).click();
        
    assertTrue(loginPage.isInitialized());

  

    assertTrue(driver1.isInitialized());

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
   
        
    assertTrue(loginPage.isInitialized());

    loginPage.loginCleo("Admin", "admin123");

    assertTrue(LPPage.isInitialized());

        Thread.sleep(3000);


     LPPPage.findElement(By.id(waitForadminTab ())).click();


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
       login obj = new ExternalClass6(); // calling external class of login
obj.startBrowser(String browserName, String url);
String az="";
        String fn = obj.az;
  Connection.driver = fn.get(Connection.startBrowser("Chrome","webdriver.chrome.driver","C:\\chromedriver.exe"));
LoginPage loginPage=new LoginPage(Connection.driver);
    LPPage LPPPage = new LPPage(Connection.driver);
LPPPage.get("https://opensource-demo.orangehrmlive.com/");
        
    assertTrue(loginPage.isInitialized());

    loginPage.loginCleo("Admin", "admin123");

    assertTrue(LPPage.isInitialized());


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
       login obj = new ExternalClass6(); // calling external class of login
obj.startBrowser(String browserName, String url);
String az="";
        String fn = obj.az;
  Connection.driver = fn.get(Connection.startBrowser("Chrome","webdriver.chrome.driver","C:\\chromedriver.exe"));
    LoginPage loginPage=new LoginPage(Connection.driver);
    LPPage LPPPage = new LPPage(Connection.driver);
LPPPage.get("https://opensource-demo.orangehrmlive.com/");
        
    assertTrue(loginPage.isInitialized());

    loginPage.loginCleo("Admin", "admin123");

    assertTrue(LPPage.isInitialized());
        Thread.sleep(3000);

       LPPPage.findElement(By.id(waitForadminTab ())).click();

        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("Choose Status:");
        System.out.println("1. Enabled");
        System.out.println("2. Disabled");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt(); // Read the user's integer input

        switch (choice) { // Evaluate the 'choice' variable
            case 1: // If choice is 1

               LPPPage.findElement(By.id(waitForenabledBtn ())).click();

                break; // Exit the switch statement
            case 2: // If choice is 2

               LPPPage.findElement(By.id(waitFordisabledBtn ())).click();

                break;
            default: // If none of the above cases match
                System.out.println("Invalid choice. Please enter 1 or 2");
                break;
        }

        input.close(); // Close the scanner

       LPPPage .findElement(By.id(waitForsearchBtn())).click();
        Thread.sleep(3000);

        LPPPage .quit();

    }
       public static class ExternalClass5 extends WebDriver {
    }

}
