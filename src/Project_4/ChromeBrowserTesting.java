package Project_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {


        String baseURL = "https://www.saucedemo.com/";
        //Launch Chrome browser

        WebDriver driver = new ChromeDriver();
        // Get baseUrl
        driver.get(baseURL);
        //Maximise page
        driver.manage().window().maximize();
        //Give driver to Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title =driver.getTitle();
        System.out.println("Page Title is:" +title);
        //Get the current URL
        System.out.println("Current URL:" +driver.getCurrentUrl());
        //get the page source
        System.out.println("Page source:" +driver.getPageSource());
        // Get the email id
        WebElement usernameField = driver.findElement(By.name("user-name"));
        usernameField.sendKeys("standard_user");
        WebElement PasswordField = driver.findElement(By.name("password"));
        PasswordField.sendKeys("secret_sauce");
        //Browser close
        driver.close();

    }
}