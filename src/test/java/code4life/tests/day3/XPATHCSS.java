package code4life.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.http.io.SessionOutputBuffer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class XPATHCSS {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.name("login-button"));
        loginBtn.click();

        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // implcit = universal wait
        WebElement password = driver.findElement(By.id("password"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement loginbtn = driver.findElement(By.xpath("//input[@id='user-name']"));
        wait.until(ExpectedConditions.elementToBeClickable(loginbtn)).click();




       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        //wait.until(ExpectedConditions.visibilityof(userName)) .sendkeys

       // wait.until(ExpectedCondition.v)

    }
}
