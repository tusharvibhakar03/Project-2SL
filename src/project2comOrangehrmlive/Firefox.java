package project2comOrangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {

    public static void main(String[] args) {
        String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        System.setProperty("webdriver.ghecko.driver","Driver/gheckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get(baseUrl);
// Launch the URL

// Get the title of the page.

        System.out.println("Page title is"+ driver.getTitle());

        // Get Current URL

        System.out.println("Current URl"+driver.getCurrentUrl());

        // Get page source

        System.out.println("page source"+driver.getPageSource());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));



        // Find the Username  field element and send email
        WebElement UsernameField=driver.findElement(By.name("username"));
        UsernameField.sendKeys("Admin");

        // Find the password field

        WebElement passwordField=driver.findElement(By.name("password"));
        passwordField.sendKeys("123pass");

       driver.quit();







    }
}
