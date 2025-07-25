package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Connection{ // this is the class of connection of Chromedriver
public static Webdriver driver;

@BeforeClass
public static WebDriver startBrowser(String browserName, String url) throws Exception {// method of StartBrowser declares the Strings of browserName and url

    System.setProperty("webdriver.chrome.driver","C:\\selenium-driver\\chromedriver.exe");

   if (browserName.equalsIgnoreCase("Chrome")) {
        driver = new ChromeDriver();
          driver.get("https://opensource-demo.orangehrmlive.com/");
    }else {
        System.out.println("Browser not found!");
        throw new Exception("Browser not found!");
    }

    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get(url);

    return driver;
}

@AfterClass
public void teardown () {
    driver.quit();
}
  
}
